<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp" />

    
   <section class="container">
	<div class="container-fluid" style="padding-top: 80px; padding-bottom: 45px ">
		<div class="row">
			<div class="col-md-6">
			</div>
				<legend>Laboratuvar Listesi</legend>
				<div class="table-responsive">
					<table id="example" class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Laboratuvar Adı</th>
								
							</tr>
						</thead>
						<tbody>


							<c:forEach items="${allLaboratuvars}" var="laboratuvar">
								<tr>
									<td><c:out value="${laboratuvar.laboratuvarAd}" /></td>
								
							   </tr>
							</c:forEach>
						</tbody>
					</table>
				    </div>
			</div>
		<div class="col-md-6"></div>
  </div>
</section>

	
<jsp:include page="footer.jsp" />