<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

</head>
<body>
  <jsp:include page="adminPanel.jsp"></jsp:include>

	
	
		<div class="baslikcontainer">
		<label>LABORATUVAR LİSTESİ</label>
	</div>
	<div class="tablecontainer">
		<table id="myTable">
			<tr class="header">
				<th style="width: 20%;">Laboratuvar Adı</th>
				<th style="width: 20%;">Action</th>
				
			</tr>
			
		   <c:forEach items="${allLaboratuvars}" var="laboratuvar">
			<tr>
				<td><c:out value="${laboratuvar.laboratuvarAd}" /></td>
				<td>
				<a href="laboratuvarController?action=delete&laboratuvarId=${laboratuvar.laboratuvarId}"
				  class="btn btn-danger" type="button">SİL</a> 
										
			     <a href="laboratuvarController?action=update&laboratuvarId=${laboratuvar.laboratuvarId}" class="btn btn-primary" type="button">Güncelle</a></td>
				
			</tr>
          </c:forEach>
		</table>
	</div>
    <div class=col-25></div>
    
    <a href="laboratuvarController?action=insert"
										     class="btn btn-primary" type="button">Laboratuvar Ekle</a>
</body>
</html>										     
