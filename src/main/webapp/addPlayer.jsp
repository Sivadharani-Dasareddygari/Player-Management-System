<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD PLAYER</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
	<h2>ADD PLAYER</h2>
	<form action="add-player" method="post">
		<input type="text" placeholder="Enter name" name="title"></br> <input
			type="number" placeholder="Enter age" name="age"></br> <input
			type="number" placeholder="Enter salary" name="salary"></br> <input
			type="text" placeholder="Enter team" name="team"></br> <input
			type="text" placeholder="Enter nationality" name="nationality"></br>
		<input type="submit" value="ADD PlAYER">

	</form>

</body>
</html>