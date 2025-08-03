package com.dcl.pms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dcl.pms.dao.PlayerDao;
import com.dcl.pms.entity.Player;

@WebServlet("/add-player")
public class AddPlayerServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		String title = req.getParameter("title");
		String team = req.getParameter("team");
		String nationality = req.getParameter("nationality");
		int age = Integer.parseInt(req.getParameter("age"));
		long salary = Long.parseLong(req.getParameter("salary"));

		Player player = new Player();
		player.setTitle(title);
		player.setAge(age);
		player.setSalary(salary);
		player.setTeam(team);
		player.setNationality(nationality);
		PlayerDao.addPlayer(player);

		resp.sendRedirect("index.jsp");

	}

}
