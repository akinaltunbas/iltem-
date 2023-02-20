<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
 <link rel="stylesheet" href="css/style.css">
</head>
<body>
	<jsp:include page="kullaniciPanel.jsp"></jsp:include>
	
    
     		<div class="baslikcontainer">
		<label>BİLGİLERİ DÜZENLE</label>
	</div>
	<div class="formcontainer">
		<form action="kullaniciProfilController" method="post">
			
			<div class="row">
				<div class="col-25">
					<label for="id">Id</label>
				</div>
				
				<div class="col-75">
				   
					<input type="text" id="id" name="kullaniciId" 
						placeholder="ID" value="${kullanici.kullaniciId}"  >
				</div>
			</div>
			
			<div class="row">
				<div class="col-25">
					<label for="kullaniciAd">Kullanıcı Adı</label>
				</div>
				
				<div class="col-75">
					<input type="text" id="kullaniciAd" name="kullaniciAd"
						placeholder="AD" value="${kullanici.kullaniciAd}" >
				</div>
				
			</div>
			
				<div class="row">
				<div class="col-25">
					<label for="kullaniciSoyad">Kullanıcı Soyadı</label>
				</div>
				
				<div class="col-75">
					<input type="text" id="kullaniciSoyad" name="kullaniciSoyad"
						placeholder="SOYAD" value="${kullanici.kullaniciSoyad}" >
				</div>
			</div>
			
				<div class="row">
				<div class="col-25">
					<label for="kullaniciMail">Mail</label>
				</div>
				
				<div class="col-75">
					<input type="text" id="kullaniciMail" name="kullaniciMail"
						placeholder="MAİL" value="${kullanici.kullaniciMail}" >
				</div>
			</div>
			
				<div class="row">
				<div class="col-25">
					<label for="kullaniciSifre">Şifre</label>
				</div>
				
				<div class="col-75">
					<input type="text" id="kullaniciSifre" name="kullaniciSifre"
						placeholder="ŞİFRE" value="${kullanici.kullaniciSifre}" >
				</div>
			</div>
			
							<div class="row">
				<div class="col-25">
					<label for="seviye">Seviye</label>
				</div>
				
				<div class="col-75">
					<input type="text" id="seviye" name="seviye"
						placeholder="SEVİYE" value="${kullanici.seviye}" >
				</div>
			</div>
			
				
			<div class="row">
			     <div class="col-25">
					
				</div> 
				
				<div class="col-75">
				  <input type="submit" value="Bilgileri Düzenle">
				</div>
			</div>
			
			
		</form>
	</div>



</body>