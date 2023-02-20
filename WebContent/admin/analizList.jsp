<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

</head>
<body>
	<jsp:include page="adminPanel.jsp"></jsp:include>
	
		<div class="baslikcontainer">
		<label>CİHAZ LİSTESİ</label>
	</div>
	<div class="tablecontainer">
		<table id="myTable">
			<tr class="header">
				
				<th style="width: 20%;">Cihaz Adı</th>
				<th style="width: 20%;">Analiz Adı</th>
				<th style="width: 10%;">Ücret</th>
				<th style="width: 10%;">Sil</th>
				
			</tr>
		    
		    	<c:forEach items="${allAnalizs}" var="analiz">
								<tr>
								    
									<td><c:out value="${analiz.cihaz.cihazAd}" /></td>
									<td><c:out value="${analiz.analizAd}" /></td>
									<td><c:out value="${analiz.analizFiyat}" /></td>
									<td>
									   <a href="analizController?action=delete&analizId=${analiz.analizId}"
								         class="btn btn-danger" type="button">SİL</a> 
										
									</td>				
			   </c:forEach>

		</table>
	</div>
	
	<div class=col-25></div>
    
    <a href="cihazController?action=insert"
										     class="btn btn-primary" type="button">Analiz Ekle</a>


</body>
</html>