<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

</head>
<body>
	<jsp:include page="adminPanel.jsp"></jsp:include>
	
		<div class="baslikcontainer">
		<label>YÖNETİCİ LİSTESİ</label>
	</div>
	<div class="tablecontainer">
		<table id="myTable">
			<tr class="header">
				<th style="width: 20%;"> Adı</th>
				<th style="width: 20%;"> Soyadı</th>
				<th style="width: 20%;"> Mail</th>
				<th style="width: 20%;"> Şifre</th>
				<th style="width: 20%;"> Seviye</th>
				<th style="width: 10%;"> Sil</th>
				<th style="width: 10%;"> Güncelle</th>
				
			</tr>
			
		   <c:forEach items="${allYoneticis}" var="yonetici">
			<tr>
				<td><c:out value="${yonetici.yoneticiAd}" /></td>
				<td><c:out value="${yonetici.yoneticiSoyad}" /></td>
				<td><c:out value="${yonetici.yoneticiMail}" /></td>
				<td><c:out value="${yonetici.yoneticiSifre}" /></td>
				<td><c:out value="${yonetici.seviye}" /></td>
				<td>
				<a href="yoneticiController?action=delete&yoneticiId=${yonetici.yoneticiId}"
				  class="btn btn-danger" type="button">SİL</a> </td>
										
			     <td><a href="yoneticirController?action=update&yoneticiId=${yonetici.yoneticiId}" class="btn btn-primary" type="button">Güncelle></a></td>
				
			</tr>
          </c:forEach>
		</table>
	</div>
    <div class=col-25></div>
    
    <a href="yoneticiController?action=insert"
										     class="btn btn-primary" type="button">Yönetici Ekle</a>

</body>
</html>