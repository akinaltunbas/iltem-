<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

</head>
<body>
	<jsp:include page="adminPanel.jsp"></jsp:include>


	<div class="baslikcontainer">
		<label>LABORATUVAR EKLE</label>
	</div>
	<div class="formcontainer">
		<form action="laboratuvarController" method="post">
			
			<div class="row">
				<div class="col-25">
					<label for="laboratuvarAd">Laboratuvar Adı:</label>
				</div>
				<div class="col-75">
					<input type="text" id="laboratuvarAd" name="laboratuvarAd"
						placeholder="" value="" required>
				</div>
			</div>
				
			<div class="row">
				<input type="submit" value="Laboratuvar Ekle">
			</div>
		</form>
	</div>



</body>
</html>