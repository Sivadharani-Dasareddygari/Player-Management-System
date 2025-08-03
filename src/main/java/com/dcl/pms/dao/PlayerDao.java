package com.dcl.pms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dcl.pms.entity.Player;

public class PlayerDao {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");

	public static void addPlayer(Player player) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(player);
		et.commit();
		em.close();
	}

	public static List<Player> findAllPlayers() {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		List<Player> players = em.createQuery("SELECT p FROM Player p", Player.class).getResultList();
		em.close();
		return players;
	}

	public static Player findPlayerById(int id) {
		EntityManager em=emf.createEntityManager();
		Player player=em.find(Player.class, id);
		em.close();
		return player;
	}

	public static void updatePlayer(Player player) {
      EntityManager em=emf.createEntityManager();
      EntityTransaction et=em.getTransaction();
      et.begin();
      em.merge(player);
      et.commit();
      em.close();
	}

	public static Player deletePlayerById(int id) {
		EntityManager em=emf.createEntityManager();
		Player player=em.find(Player.class, id);
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.remove(player);
		et.commit();
		em.close();
		return player;
	}

	

}
