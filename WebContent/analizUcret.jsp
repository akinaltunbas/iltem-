<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp" />

    
   <section class="container">
	<div class="container-fluid" style="padding-top: 80px; padding-bottom: 45px ">
		<div class="row">
			<div class="col-md-6">
			</div>
				<legend>Analiz Ücretleri</legend>
				<div class="table-responsive">
					<table id="example" class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Analiz Adı</th>
								<th>Analiz Ücreti</th>
							</tr>
						</thead>
						<tbody>


							<c:forEach items="${allAnalizs}" var="analiz">
								<tr>
									<td><c:out value="${analiz.analizAd}" /></td>
								     <td><c:out value="${analiz.analizFiyat}" /></td>
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