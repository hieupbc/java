<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form action="updateinfo" method="post" model="model">
	<table class="table">
		<tr>
		<td>username</td>
		<td>
			<input type="text" readonly="readonly" name="userID"
				value="${toEditUser.getUserID() }" />
		</td>
		</tr>
		<tr>
		<td>password</td>
		<td>
			<input type="text" name="password"
				value="${toEditUser.getPassword() }" />
		</td>
		</tr>
		<tr>
		<td>Role</td>
		<td><select name="quyenHan">
							<c:forEach items="${roleList}" var="role">
								<c:choose>
									<c:when
										test="${toEditUser.getQuyenHan() eq role.getTenQuyenHan() }">
										<option value="${role.getTenQuyenHan()}" selected>${toEditUser.getQuyenHan()}</option>
									</c:when>
									<c:otherwise>
										<option value="${role.getTenQuyenHan() }">${role.getTenQuyenHan()}</option>
									</c:otherwise>
								</c:choose>

							</c:forEach>

					</select></td>
		</tr>
		<tr>
		<td></td>
			<td><input type="submit" value="Edit" /></td>
		</tr>
	</table>

</form>