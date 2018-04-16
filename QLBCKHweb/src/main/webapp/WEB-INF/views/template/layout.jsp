
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title><tiles:insertAttribute name="title" /></title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
	integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
	integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href='<c:url value="/home" />'>Java Online</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href='<c:url value="baocaomanager"></c:url>'>Hiện Danh Sách Báo Cáo</a></li>
				<li><a href="#">Danh Sách Nhà Khoa Học</a></li>
				<c:if test="${user.getQuyenHan() eq 'admin' }">
					<li><a href='<c:url value="/usermanager" />'>Userlist</a></li>
				</c:if>
				
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:choose>
					<c:when test="${user eq null }">
						<li><a href="signup"><span
								class="glyphicon glyphicon-user"></span> Sign Up</a></li>
						<li><a href='<c:url value="/login" />'><span
								class="glyphicon glyphicon-log-in"></span> Login</a></li>
					</c:when>

					<c:otherwise>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#"><c:out
									value="${user.getUserID() }" /> <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href='<c:url value="/logout" />'>Logout</a></li>

							</ul></li>
					</c:otherwise>
				</c:choose>

			</ul>
		</div>
	</nav>

	<tiles:insertAttribute name="content" />

</body>
</html>
