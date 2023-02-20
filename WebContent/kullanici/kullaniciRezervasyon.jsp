<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="dao.CihazDAOImpl"%>
<%@page import="dao.CihazDAO"%>
<%@page import="model.Cihaz"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.AnalizDAOImpl"%>
<%@page import="dao.AnalizDAO"%>
<%@page import="model.Analiz"%>
<%
   CihazDAO cihazDAO = new CihazDAOImpl();
   List<Cihaz> cihazList = cihazDAO.getCihazs();
   request.setAttribute("allCihazs", cihazList);
%>

<%
   AnalizDAO analizDAO = new AnalizDAOImpl();
   List<Analiz> analizList = analizDAO.getAnalizs();
   request.setAttribute("allAnalizs", analizList);
%>


<html>
<head>
 <script type="text/javascript" src="js/index.js"></script>

</head>
<body>
	<jsp:include page="kullaniciPanel.jsp"></jsp:include>
	
<div class="baslikcontainer"><label>Cihaz Ara :</label><input type="text" id="ara" onkeyup="myFunction()" placeholder="Aramak istediğiniz cihaz ismini yazınız..."/></div>
 <div class="tablecontainer">
 <table id="myTable" class="tablolar">
  <tr class="header">
    <th style="width:10%;">Cihaz</th>
  	<th style="width:30%;">Analiz</th>
  	<th style="width:10%;">Ücret</th>
  	<th style="width:10%;">EKLE</th>
  </tr>
<c:forEach items="${allAnalizs}" var="analiz">
  <tr>
	<td><c:out value="${analiz.cihaz.cihazAd}" /></td>
	<td><c:out value="${analiz.analizAd}" /></td>
	<td><c:out value="${analiz.analizFiyat}" /></td>
	<td><a href=''><span class="glyphicon glyphicon-ok" style="font-size:24px; color:green;"></span></a></td>
  </tr>
 
</c:forEach>
 </table>
 </div>

 <script type="text/javascript">
 function myFunction() {
	  var input, filter, table, tr, td, i; //degiskenler ataniyor
	  input = document.getElementById("ara"); //input nesnesi cekiliyor
	  filter = input.value.toUpperCase(); //buyuk kucuk harf sorurunu cozmek icin hepsi buyuk yapiliyor
	  table = document.getElementById("myTable"); //tablo nesnesi cekiliyor
	  tr = table.getElementsByTagName("tr"); //tablodaki satirlar alýnýyor

	  for (i = 0; i < tr.length; i++) { //tablodaki satýr sayýsý kadar dongu baslatiliyor
	    td = tr[i].getElementsByTagName("td")[0]; 
	    if (td) {
	      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) { //filtereye gore arama yapýlýyor eger deger -1 den buyukse deger gosteriliyor
	        tr[i].style.display = "";
	      } else {
	        tr[i].style.display = "none";//filtreden gecemeyen degerler gosterilmiyor
	      }
	    } 
	  }
	}
 </script>
</body>
</html>