<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp" />
    

  
  <section class="" style="padding-top: 104px;  padding-bottom:0px" >
	    <div class="row">
		<div class="col-expand">
		<div class="container-fluid">
				<div id="carouselExampleIndicators" class="carousel slide"
					data-ride="carousel">
					<ol class="carousel-indicators">
						<li data-target="#carouselExampleIndicators" data-slide-to="0"
							class="active"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
					</ol>
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img src="resources/img/1slider-.jpg" class="d-block  w-100" alt="...">
						</div>
						<div class="carousel-item">
							<img src="resources/img/2-slider-porselen-CARTOON.jpg" class="d-block w-100"
								alt="...">
						</div>
						<div class="carousel-item">
							<img src="resources/img/3-slider-1.jpg" class="d-block w-100" alt="...">
						</div>
					</div>
					<a class="carousel-control-prev" href="#carouselExampleIndicators"
						role="button" data-slide="prev"> <span
						class="carousel-control-prev-icon" aria-hidden="true"></span> <span
						class="sr-only">Previous</span>
					</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
						role="button" data-slide="next"> <span
						class="carousel-control-next-icon" aria-hidden="true"></span> <span
						class="sr-only">Next</span>
					</a>
				</div>
				</div>
	</div>
	</div>
				
</section>

<jsp:include page="footer.jsp" />