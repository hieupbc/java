<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Form</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">
</head>
<body>
	<div class="table">
		<form action="updateStudent" method="post">
			<table>
				<tr>
					<td>ID :</td>
					<td><input type="text" name="studentId"
						value="${ toEditStudent.getStudentId()}" readonly /></td>
				</tr>
				<tr>
					<td>Name :</td>
					<td><input type="text" name="studentName"
						value="${toEditStudent.getStudentName()}" required /></td>
				</tr>
				<tr>
					<td>Age :</td>
					<td><input type="number" name="age" value="${Integer.parseInt(toEditStudent.getAge())}"
						required /></td>
				</tr>
				<tr>
					<td>Class :</td>
					<td><select name="clazzId">
							<c:forEach items="${clazzList}" var="clazz">
								<c:choose>
									<c:when
										test="${toEditStudent.getClazzName() eq clazz.getClassName() }">
										<option value="${clazz.getClassId() }" selected>${toEditStudent.getClazzName()}</option>
									</c:when>
									<c:otherwise>
										<option value="${clazz.getClassId() }">${clazz.getClassName()}</option>
									</c:otherwise>
								</c:choose>

							</c:forEach>

					</select></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Update" /></td>
				</tr>
			</table>

		</form>
	</div>

</body>
</html>