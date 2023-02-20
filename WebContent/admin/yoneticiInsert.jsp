<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

</head>
<body>
	<jsp:include page="adminPanel.jsp"></jsp:include>


	<div class="baslikcontainer">
		<label>YÖNETİCİ EKLE</label>
	</div>
	<div class="formcontainer">
		<form action="yoneticiController" method="post">
			
			<div class="row">
				<div class="col-50">
					<label for="lname">Yönetici Adı:</label>
				</div>
				<div class="col-75">
					<input type="text" id="yoneticiAd" name="yoneticiAd"
						placeholder="" value="" required>
				</div>
			</div>
			
			<div class="row">
				<div class="col-50">
					<label for="lname">Yönetici Soyadı:</label>
				</div>
				<div class="col-75">
					<input type="text" id="yoneticiSoyad" name="yoneticiSoyad"
						placeholder="" value="" required>
				</div>
			</div>
			
			<div class="row">
				<div class="col-50">
					<label for="lname">Yönetici Mail:</label>
				</div>
				<div class="col-75">
					<input type="text" id="yoneticiMail" name="yoneticiMail"
						placeholder="" value="" required>
				</div>
			</div>
			
			<div class="row">
				<div class="col-50">
					<label for="lname">Yönetici Şifre:</label>
				</div>
				<div class="col-75">
					<input type="text" id="yöneticiSifre" name="yöneticiSifre"
						placeholder="" value="" required>
				</div>
			</div>
			
			<div class="row">
				<div class="col-50">
					<label for="lname">Yönetici Kullanıcı Adı:</label>
				</div>
				<div class="col-75">
					<input type="text" id="seviye" name="seviye"
						placeholder="" value="" required>
				</div>
			</div>
				
			<div class="row">
				<input type="submit" value="Yönetici Ekle">
			</div>
		</form>
	</div>



</body>
</html>