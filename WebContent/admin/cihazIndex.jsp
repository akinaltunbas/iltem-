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
				<th style="width: 20%;">Laboratuvar Adı</th>
				<th style="width: 20%;">Cihaz Adı</th>
				<th style="width: 10%;">Sil</th>
				<th style="width: 10%;">Güncelle</th>
			</tr>
		    
		    	<c:forEach items="${allCihazs}" var="cihaz">
								<tr>
								    <td><c:out value="${cihaz.laboratuvar.laboratuvarAd}" /></td>
									<td><c:out value="${cihaz.cihazAd}" /></td>
									<td>
									   <a href="cihazController?action=delete&cihazId=${cihaz.cihazId}"
								         class="btn btn-danger" type="button">SİL</a> 
										
									</td>
									<td><a href="cihazController?action=update&cihazId=${cihaz.cihazId}" class="btn btn-primary" type="button">Güncelle></a></td>
							   </tr>
			   </c:forEach>

		</table>
	</div>
	
	<div class=col-25></div>
    
    <a href="cihazController?action=insert"
										     class="btn btn-primary" type="button">Cihaz Ekle</a>


</body>
</html>