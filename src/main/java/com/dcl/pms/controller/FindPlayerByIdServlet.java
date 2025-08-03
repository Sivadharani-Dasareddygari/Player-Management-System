package com.dcl.pms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dcl.pms.dao.PlayerDao;
import com.dcl.pms.entity.Player;

@WebServlet("/find-player-by-id")
public class FindPlayerByIdServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     int id=Integer.parseInt(req.getParameter("id"));
   Player player=  PlayerDao.findPlayerById(id);
   
   req.setAttribute("playerObject",player);
   req.getRequestDispatcher("updatePlayer.jsp").forward(req,resp);
  
   
   
	}
}
