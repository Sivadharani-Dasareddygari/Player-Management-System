<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.dcl.pms.entity.Player"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PLAYERS LIST</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/style.css">

</head>
<body>
	<h2>PLAYERS LIST</h2>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Age</th>
			<th>Salary</th>
			<th>Team</th>
			<th>Nationality</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<%
		List<Player> players = (List<Player>) request.getAttribute("playersList");
		if (players != null) {
			for (Player p : players) {
		%>
		<tr>
			<td><%=p.getId()%></td>
			<td><%=p.getTitle()%></td>
			<td><%=p.getAge()%></td>
			<td><%=p.getSalary()%></td>
			<td><%=p.getTeam()%></td>
			<td><%=p.getNationality()%></td>
			<td><a href="find-player-by-id?id=<%=p.getId()%>">UPDATE</a></td>
			<td><a href="delete-player-by-id?id=<%=p.getId()%>">DELETE</a></td>
		</tr>
		<%
		}
		} else {
		%>
		<tr>
			<td colspan="6">No players found</td>
		</tr>
		<%
		}
		%>
	</table>
	<h2>
		<a href="index.jsp">GO TO DASHBOARD </a>
	</h2>
</body>
</html>