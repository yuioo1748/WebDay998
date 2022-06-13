<%@page import="tw.com.lccnet.web.utils.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<!-- 首頁 -->
	<a class="navbar-brand" href="personalProfileServlet">首頁</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<!-- 功能 -->
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="myLicenseServlet">證照</a>
			</li>
			<!-- 待開發列表功能 -->
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> Dropdown </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="#">Action</a> <a
						class="dropdown-item" href="#">Another action</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Something else here</a>
				</div></li>
			<!-- 登入與登出資格判斷 -->
			<%
			User auth = (User) request.getSession().getAttribute("auth");
			if (auth != null) {
				request.setAttribute("auth", auth);
			}
			%>
			<!-- 登入與登出功能 -->
			<%
			if (auth != null) {
			%>
			<li class="nav-item"><a class="nav-link"
				href="getCommentServlet">評論</a></li>
			<li class="nav-item"><a class="nav-link" href="logoutServlet">登出</a>
			</li>
			<%
			} else {
			%>
			<li class="nav-item"><a class="nav-link" href="loginServlet">登入</a>
			</li>
			<%
			}
			%>
		</ul>
		<!-- 註冊功能 -->
		<ul class="navbar-nav">
			<%
			if (auth != null) {
			%>

			<%
			} else {
			%>
			<li class="nav-item"><a class="nav-link" href="register.jsp">註冊</a></li>
			<%
			}
			%>
		</ul>
		<form class="form-inline my-2 my-lg-0">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Search" aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>
	</div>
</nav>
<br>