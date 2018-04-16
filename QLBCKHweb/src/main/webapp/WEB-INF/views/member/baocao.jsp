<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="row">
	<div class="col-md-3"></div>
	<div class="col-md-6">
		<table class="table table-striped">
			<h4>
				<c:out value="${tabletitle }" />
			</h4>
			<c:if test="${baocaoList ne null }">
				<tr>
					<th>ID Báo Cáo</th>
					<th>Báo Cáo</th>
					<th>Thể loại báo cáo</th>
					<th>Đường dẫn</th>
					<th>Ngày Hoàn Thành</th>
					<th>Lĩnh Vực</th>
					<th>Show</th>
				</tr>
			</c:if>
			<c:forEach items="${baocaoList}" var="baocao">
				<tr>
					<td><c:out value="${baocao.getBaoCaoID() }" /></td>
					<td><c:out value="${baocao.getTenBaoCao() }" /></td>
					<td><c:out value="${baocao.getTheLoaiBaoCao() }" /></td>
					<td><c:out value="${baocao.getDuongDan() }" /></td>
					<td><c:out value="${baocao.getNgayHoanThanh() }" /></td>
					<td><c:out value="${baocao.getLinhVuc() }" /></td>

					<td><form action='<c:url value="/baocaomanager/edit" />'
							method="post" model="model">
							<input type="hidden" name="baoCaoID"
								value="${baocao.getBaoCaoID() }" /> <input type="hidden"
								name="tenBaoCao" value="${baocao.getTenBaoCao() }" /> <input
								type="hidden" name="theLoaiBaoCao"
								value="${baocao.getTheLoaiBaoCao()}" /> <input type="hidden"
								name="duongDan" value="${baocao.getDuongDan()}" /> <input
								type="hidden" name="ngayHoanThanh"
								value="${baocao.getNgayHoanThanh()}" /> <input type="hidden"
								name="linhVuc" value="${baocao.getLinhVuc()}" /> <input
								type="submit" value="Show" />

						</form></td>
				</tr>
			</c:forEach>
		</table>
	</div>



</div>
