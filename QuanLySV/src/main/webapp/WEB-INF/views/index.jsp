<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">
</head>
</head>
<body>
	<div class="row" style="padding-top: 100px">

		<div class="col-md-4"></div>
		<div class="col-md-4">

			<div class="container-fluid">
				<h2>Login</h2>
				<p style="color: red">
					<c:out value="${mes }"></c:out>
				</p>
				<form action="loginprocess" method="post">
					<div class="table">
						<table>
							<tr>
								<td>Username :</td>
								<td><input type="text" name="username" required></td>
							</tr>
							<tr>
								<td>Password :</td>
								<td><input type="password" name="password" required></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="submit" value="Login"></td>
							</tr>
						</table>
					</div>

				</form>
			</div>

		</div>
	</div>

</body>
</html>