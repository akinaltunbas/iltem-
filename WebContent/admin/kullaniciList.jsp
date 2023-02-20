<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<jsp:include page="adminPanel.jsp"></jsp:include>
	
		<div class="baslikcontainer">
		<label>KULLANCI LİSTESİ</label>
	</div>
	<div class="tablecontainer">
		<table id="myTable">
			<tr class="header">
				<th style="width: 20%;"> Adı</th>
				<th style="width: 20%;"> Soyadı</th>
				<th style="width: 20%;"> Mail</th>
				<th style="width: 20%;"> Şifre</th>
			
			</tr>
			
		   <c:forEach items="${allKullanicis}" var="kullanici">
			<tr>
				<td><c:out value="${kullanici.kullaniciAd}" /></td>
				<td><c:out value="${kullanici.kullaniciSoyad}" /></td>
				<td><c:out value="${kullanici.kullaniciMail}" /></td>
				<td><c:out value="${kullanici.kullaniciSifre}" /></td>
				
			</tr>
          </c:forEach>
		</table>
	</div>
  

</body>
</html>