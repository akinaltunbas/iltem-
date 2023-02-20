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
     <form >
	   
			<div class="row">
				<div class="col-25">
					<label for="id">Id</label>
				</div>
				
				<div class="col-75">
				   
					<input type="text" id="id" name="kullaniciId" 
						placeholder="${id}" value="${kullanici.kullaniciId}" readonly>
				</div>
			</div>
			
			<div class="row">
				<div class="col-25">
					<label for="kullaniciAd">Kullanıcı Adı</label>
				</div>
				
				<div class="col-75">
					<label for="kullaniciAd">${ad}</label>
				</div>
				
			</div>
			
				<div class="row">
				<div class="col-25">
					<label for="kullaniciSoyad">Kullanıcı Soyadı</label>
				</div>
				
				<div class="col-75">
					<input type="text" id="kullaniciSoyad" name="kullaniciSoyad"
						placeholder="${soyad}" value="${kullanici.kullaniciSoyad}" readonly>
				</div>
			</div>
			
				<div class="row">
				<div class="col-25">
					<label for="kullaniciMail">Mail</label>
				</div>
				
				<div class="col-75">
					<input type="text" id="kullaniciMail" name="kullaniciMail"
						placeholder="${mail}" value="${kullanici.kullaniciMail}" readonly >
				</div>
			</div>
			
				<div class="row">
				<div class="col-25">
					<label for="kullaniciSifre">Şifre</label>
				</div>
				
				<div class="col-75">
					<input type="text" id="kullaniciSifre" name="kullaniciSifre"
						placeholder="${password}" value="${kullanici.kullaniciSifre}" readonly >
				</div>
			</div>
			
			  	<div class="row">
				<div class="col-25">
					<label for="seviye">Seviye</label>
				</div>
				
				<div class="col-75">
					<input type="text" id="seviye" name="seviye"
						placeholder="${seviye}" value="${kullanici.seviye}" readonly>
				</div>
			</div>
			
						
				
			     <a href="kullaniciProfilController?action=update&kullaniciId=${id}" class="btn btn-primary" type="button">GÜNCELLE</a>
		
     </form>
		
		</div>	
			


</body>