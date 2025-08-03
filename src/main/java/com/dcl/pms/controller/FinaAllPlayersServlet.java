package com.dcl.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dcl.pms.dao.PlayerDao;
import com.dcl.pms.entity.Player;

@WebServlet("/display-all-players")
public class FinaAllPlayersServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  List<Player> players = PlayerDao.findAllPlayers();  // get players list from DAO

		    req.setAttribute("playersList", players);  // set 

		    // Forward to JSP
		    req.getRequestDispatcher("displayPlayers.jsp").forward(req, resp);
		}
	}
