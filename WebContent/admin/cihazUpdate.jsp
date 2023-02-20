<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
 <link rel="stylesheet" href="css/style.css">
</head>
<body>
	<jsp:include page="adminPanel.jsp"></jsp:include>
	
	 <div class="container-fluid" >
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-12">
						<form class="form-horizontal" action="cihazController "
							method="POST">
							<fieldset>

								<!-- Form Name -->
								<legend>Cihaz Düzenle</legend>
								
									<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="id">Id</label>
									<div class="col-md-4">
										<input id="id" name="id" type="text" 
										placeholder="" value="${cihaz.cihazId}" 
											class="form-control input-md">

									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="cihazAd">Cihaz Adı</label>
									<div class="col-md-4">
										<input id="cihazAd" name="cihazAd" type="text" placeholder=""
											value="${cihaz.cihazAd}" class="form-control input-md">

									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="labId">Laboratuvar Adı</label>
									<div class="col-md-4">
										<input id="labId" name="labId" type="text" placeholder=""
											value="${cihaz.labId}" class="form-control input-md">

									</div>
								</div>
								
								
								

								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="add"></label>
									<div class="col-md-4">
										<input type="submit" class="btn btn-info"
											value="Cihaz Düzenle">
									</div>
								</div>
								<!-- ErrMsg -->
								<div class="col-md-4 col-md-offset-4" style="color: red">
									<h5>${errMsg}</h5>
								</div>

							</fieldset>
						</form>
					</div>
					<div class="col-md-6"></div>
				</div>
			</div>
		</div>
	</div>
	
	
</body>
</html>