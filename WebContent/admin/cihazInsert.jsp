<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="dao.LaboratuvarDAOImpl"%>
<%@page import="dao.LaboratuvarDAO"%>
<%@page import="model.Laboratuvar"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%
   LaboratuvarDAO laboratuvarDAO = new LaboratuvarDAOImpl();
   List<Laboratuvar> laboratuvarList = laboratuvarDAO.getLaboratuvars();
   request.setAttribute("allLaboratuvars", laboratuvarList);
%>

<html>
<head>
<link rel="stylesheet" href="css/dropdown.css">
</head>
<body>
	<jsp:include page="adminPanel.jsp"></jsp:include>
	


	<div class="baslikcontainer">
		<label>CİHAZ EKLE</label>
	</div>
	<div class="formcontainer">
		<form action="cihazController" method="post">
			<div class="row">
				<div class="col-25">
					<label for="cname">Laboratuvar Adı:</label>
				</div>
				
				<div class="col-75">
				 
					<select name="labId" class="dropdown-select">
					   
                          
                        
					 <option value="${laboratuvar.laboratuvarId}"><c:out value="${laoratuvar.laboratuvarAd}" /> </option>
						 
						<c:forEach items="${allLaboratuvars}" var="laboratuvar">
                           <option value="${laboratuvar.laboratuvarId}"> <c:out value="${laboratuvar.laboratuvarAd}" />  </option>
                        
						</c:forEach>
                       
                      
					</select>
				  
				</div>
				
			</div>
			<div class="row">
				<div class="col-25">
					<label for="cname">Cihaz Adı:</label>
				</div>
				<div class="col-75">
					<input type="text" id="cihazAd" name="cihazAd"
						placeholder="" value="" required>
				</div>
			</div>
			<div class="row">
				<input type="submit" value="Cihaz Ekle">
			</div>
		</form>
	</div>
	
	
	</body>
</html>