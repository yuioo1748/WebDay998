<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%@include file="include/navbar.jsp"%>

<div class="container">
	<form action="addUserServlet" method="post">
		<div class="form-group row">
			<label for="colFormLabelLg"
				class="col-sm-1 col-form-label col-form-label-lg">用戶名</label>
			<div class="col-sm-10">
				<input type="text" class="form-control form-control-lg"
					id="colFormLabelLg" required="required" name="name">
			</div>
		</div>
		<div class="form-group row">
			<label for="colFormLabelLg"
				class="col-sm-1 col-form-label col-form-label-lg">Email</label>
			<div class="col-sm-10">
				<input type="email" class="form-control form-control-lg"
					id="colFormLabelLg" placeholder="name@example.com" required="required" name="email">
			</div>
		</div>
		<div class="form-group row">
			<label for="colFormLabelLg"
				class="col-sm-1 col-form-label col-form-label-lg">密碼</label>
			<div class="col-sm-10">
				<input type="password" class="form-control form-control-lg"
					id="colFormLabelLg" required="required" name="password">
			</div>
		</div>
		<button type="submit" class="btn btn-primary btn">註冊</button>
	</form>
</div>

<%@include file="include/footer.jsp"%>