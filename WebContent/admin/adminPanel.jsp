<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html lang="tr" >

<head>
 <title>Yönetici Paneli</title>
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>
<link rel='stylesheet prefetch' href='http://cdnjs.cloudflare.com/ajax/libs/animate.css/3.2.3/animate.min.css'>
<link rel='stylesheet prefetch' href='http://cdnjs.cloudflare.com/ajax/libs/animate.css/3.2.3/animate.min.css'>
 <link rel="stylesheet" href="css/style.css">
</head>

<body>
  <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a href="#" class="navbar-brand">Yönetici Paneli</a>
    </div>
    <div class="collapse navbar-collapse">
      <ul class="nav navbar-nav navbar-right">
        <li><a ><span class="glyphicon glyphicon-user">&nbsp;</span>${ad} ${soyad} Hoşgeldiniz </a></li>
       
        <li><a href="logoutController">Çikis</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="container-fluid">
  <div class="col-md-3">
    <div id="sidebar">
      <ul class="nav navbar-nav side-bar">
        <li class="side-bar tmargin"><a href="/Proje1/laboratuvarController"><span class="glyphicon glyphicon-user">&nbsp;</span>Laboratuvar Islemleri</a></li>
        <li class="side-bar"><a href="/Proje1/cihazController"><span class="glyphicon glyphicon-user">&nbsp;</span>Cihaz Islemleri</a></li>
        <li class="side-bar"><a href="/Proje1/analizController"><span class="glyphicon glyphicon-user">&nbsp;</span>Analiz Islemleri</a></li>
        <li class="side-bar"><a href="/Proje1/yoneticiController"><span class="glyphicon glyphicon-home">&nbsp;</span>Yönetici İşlemleri</a></li>
        <li class="side-bar"><a href="/Proje1/adminKullanıcıController"><span class="glyphicon glyphicon-education">&nbsp;</span>Kullancılar</a></li>
        <li class="side-bar"><a href=""><span class="glyphicon glyphicon-book">&nbsp;</span>İstekler</a></li>
        <li class="side-bar"><a href=""><span class="glyphicon glyphicon-book">&nbsp;</span>Mesajlar</a></li>
        <li class="side-bar"><a href=""><span class="glyphicon glyphicon-list-alt">&nbsp;</span>Çıkış Yap</a></li>

      </ul>
    </div>
  </div>
  

</div>
<script src='js/jquery.min.js'></script>
<script src='js/bootstrap.min.js'></script>
</body>

</html>
