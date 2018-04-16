<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="row">
	<div class="col-md-3"></div>
	<div class="col-md-6">
		<table class="table table-striped">
			<h4>
				<c:out value="${tabletitle }" />
			</h4>
			<c:if test="${userList ne null }">
				<tr>
					<th>Username</th>
					<th>Password</th>
					<th>Role</th> 
					<th>Edit</th>
				</tr>
			</c:if>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td><c:out value="${user.getUserID() }" /></td>
					<td><c:out value="${user.getPassword() }" /></td>
					<td><c:out value="${user.getQuyenHan() }" /></td>
					<td><form action='<c:url value="/usermanager/edit" />' method="post" model="model">
							<input type="hidden" name="userID"
								value="${user.getUserID() }" />
								 <input
								type="hidden" name="password" value="${user.getPassword() }" />
							<input type="hidden" name="quyenHan" value="${user.getQuyenHan()}" />
							<input type="submit" value="Edit" />

						</form></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div class="col-md-3">
		<form action='<c:url value="/usermanager/search" />' method="post">
			<div class="form-group">
				<input type="text" name="username" placeholder="Search">
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>
	

</div>

