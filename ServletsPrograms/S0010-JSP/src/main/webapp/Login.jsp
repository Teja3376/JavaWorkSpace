<%@ page import="java.sql.*"%>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Login</title>

</head>

<body>
	<h2>Login</h2>
	<form method ="post" action = "/home">
		<table>
			<tr>
				<th>UserName:</th>
				<td>
				<input type="text" name = username>
				</td>
			</tr>
			<tr>
				<th>Password:</th>
				<td>
				<input type="password" name = password>
				</td>
			</tr>
		</table>
	</form>
</body>

</html>