<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html lang="tr" >

<head>
 <title>Kullanici Paneli</title>
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>
<link rel='stylesheet prefetch' href='http://cdnjs.cloudflare.com/ajax/libs/animate.css/3.2.3/animate.min.css'>
<link rel='stylesheet prefetch' href='http://cdnjs.cloudflare.com/ajax/libs/animate.css/3.2.3/animate.min.css'>
 <link rel="stylesheet" href="css/style.css">
</head>

<body>
  <nav class="navbar navbar-inverse navbar-fixed-top bg">
  <div class="container bg" >
   <a class="navbar-brand">Kullanici Paneli</a>
    <div class="collapse navbar-collapse bg">
      <ul class="nav navbar-nav navbar-right ">
        <li><a ><span class="glyphicon glyphicon-user">&nbsp;</span>${ad} ${soyad} Hoşgeldiniz </a></li>
        <li><a href="kullaniciLogoutController">Çıkış</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="container-fluid">
  <div class="col-md-3">
    <div id="sidebar">
      <ul class="nav navbar-nav side-bar">
        <li class="side-bar"><a href="/Proje1/kullaniciProfilController"><span class="glyphicon glyphicon-book">&nbsp;</span>Kullanici Bilgileri</a></li>
        <li class="side-bar"><a href="kullaniciRezervasyon.jsp"><span class="glyphicon glyphicon-book">&nbsp;</span>Rezervasyon İşlemleri</a></li>
      </ul>
    </div>
  </div>
  

</div>
<script src='js/jquery.min.js'></script>
<script src='js/bootstrap.min.js'></script>
</body>

</html>