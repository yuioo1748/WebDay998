<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%@include file="include/navbar.jsp"%>

<div class="container">
	<form action="loginServlet" method="post">
		<div class="form-group">
			<label for="exampleInputEmail1">Email</label> <input
				type="email" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" name="login-email" required="required"> <small
				id="emailHelp" class="form-text text-muted">我們將會保護用戶帳戶隱私,不會給予第三方。
				</small>
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">密碼</label> <input
				type="password" class="form-control" id="exampleInputPassword1"
				name="login-password" required="required">
		</div>
		<br>
		<button type="submit" class="btn btn-primary">確認</button>
	</form>

</div>
<%@include file="include/footer.jsp"%>