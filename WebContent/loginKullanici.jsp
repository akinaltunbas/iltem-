<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>


<jsp:include page="header.jsp" />

  <section class="container">
	<div class="container-fluid" style="padding:50px">
      <div class="row">
       
            <div class="col-md-8 col-md-offset-8">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Kullanıcı Girişi</h3>
                    </div>
                    <div class="panel-body">
                        <form action="loginKullanici" method="post" >
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="E-mail" name="mail" type="email"  autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Şifre" name="password" type="password" >
                                </div>
                              
                                <!-- Change this to a button or input when using this as a form -->
                                <input type="submit" name="gonder" value="Giriş Yap" class="btn btn-lg btn-success btn-block"/>
                             
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</section>

 <jsp:include page="footer.jsp" />