<%@page import="com.dcl.pms.dao.PlayerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.dcl.pms.entity.Player"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	Player player = (Player) request.getAttribute("playerObject");
	%>

	<form action="update-player" method="post">
		<input type="number" value="<%=player.getId()%>" name="id"
			readonly="readonly"></br> 
		<input type="text"	value="<%=player.getTitle()%>" name="title"></br> 
		<input type="number" value="<%=player.getAge()%>" name="age"></br> 
		<input	type="number" value="<%=player.getSalary()%>" name="salary"></br>
		<input type="text" value="<%=player.getTeam()%>" name="team"></br>
		<input type="text" value="<%=player.getNationality()%>"
			name="nationality"></br> <input type="submit"
			value="Update player">

	</form>

</body>
</html>