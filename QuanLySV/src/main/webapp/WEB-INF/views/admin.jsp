<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Controll</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">
</head>
<body>
	<h3>Admin</h3>

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="table table-bordered table-striped table-responsive">
				<div class="row"  >
					<form class="col-md-4" style="padding: 0px" action="findByClass1" method="post">
						<input style="width: 100%;padding: 0px"  type="submit" value="Hiển thị học sinh lớp 1" />
					</form>
					<form class="col-md-4" style="padding: 0px" action="findByClass2" method="post">
						<input style="width: 100%;padding: 0px"  type="submit" value="Hiển thị học sinh lớp 2" />
					</form>
					<form class="col-md-4" style="padding: 0px" action="findByClass3" method="post">
						<input style="width: 100%;padding: 0px"  type="submit" value="Hiển thị học sinh lớp 3" />
					</form>
				</div>


				<table width="100%">
					<c:if test="${show eq 'enable' }">
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Class</th>
							<th>Age</th>
							<th>Edit</th>

						</tr>
					</c:if>
					<c:forEach items="${studentList}" var="student">
						<tr>
							<td>${student.getStudentId() }</td>
							<td>${student.getStudentName() }</td>
							<td>${student.getClazzName() }</td>
							<td>${student.getAge() }</td>
							<td><form action="editForm" method="post">
									<input type="hidden" name="studentId"
										value="${student.getStudentId() }" /> <input type="hidden"
										name="studentName" value="${student.getStudentName() }" /> <input
										type="hidden" name="clazz" value="${student.getClazzName() }" />
									<input type="hidden" name="age" value="${student.getAge() }" />
									<input type="submit" value="Edit" />

								</form></td>

						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

		<div class="col-md-2"></div>

	</div>



</body>
</html>