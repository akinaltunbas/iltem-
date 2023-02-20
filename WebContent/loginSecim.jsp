<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>


<jsp:include page="header.jsp" />

    <section class="container">
	<div class="container-fluid" style="padding:50px">
      <div class="row">
       
            <div class="col-md-8 col-md-offset-8">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">    Giriş Yap</h3>
                    </div>
                    <div class="panel-body">
                        <form action="loginSecim" method="get" >
                            <fieldset>
                                 <a href="loginSecim?action=yonetici"  class="btn btn-lg btn-success btn-block" type="button">Yönetici Girişi</a>
								  <a href="loginSecim?action=kullanici"  class="btn btn-lg btn-success btn-block" type="button">Kullanıcı Girişi</a>		                               
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</section>






<jsp:include page="footer.jsp" />