package com.dcl.pms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dcl.pms.dao.PlayerDao;
import com.dcl.pms.entity.Player;

@WebServlet("/update-player")
public class UpdatePlayerServlet extends HttpServlet {

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			int id=Integer.parseInt(req.getParameter("id"));
			String title=req.getParameter("title");
			String team=req.getParameter("team");
			String nationality=req.getParameter("nationality");
			int age=Integer.parseInt(req.getParameter("age"));
			long salary=Long.parseLong(req.getParameter("salary"));
			
		Player player=PlayerDao.findPlayerById(id);
		player.setTitle(title);
		player.setAge(age);
		player.setSalary(salary);
		player.setTeam(team);
		player.setNationality(nationality);
		
		PlayerDao.updatePlayer(player);
		resp.sendRedirect("display-all-players");
			
			
		}
		
		
}
