<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%@include file="include/navbar.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
	<div class="card-header my-3">匿名評論區</div>
	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">編號</th>
				<th scope="col">用戶名</th>
				<th scope="col">評論</th>
				<th scope="col">圖片</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${comment}" var="comment">
				<tr>
					<th scope="row">${comment.id}</th>
					<td>${comment.email}</td>
					<td>${comment.comment}</td>
					<c:if test="${not empty comment.pic}">
						<td><img class="emoticon_my" src="${comment.pic}" width="48" height="48"></td>
					</c:if>
					<c:if test="${empty comment.pic}">
						<td></td>
					</c:if>
					
				</tr>
				
			</c:forEach>
		</tbody>
	</table>
	<form action="setCommenntServlet" method="post">
		<div class="form-group">
			<label for="exampleFormControlInput1">用戶名</label> <input type="text"
				class="form-control" id="exampleFormControlInput1" name="email"
				 required="required">
		</div>

		<div class="form-group">
			<label for="exampleFormControlTextarea1">評論內容</label>
			<textarea class="form-control" id="exampleFormControlTextarea1" name="comment"
				rows="10" required="required"></textarea>
		</div>
		<div class="form-group">
			<label for="exampleFormControlTextarea1">圖片</label>
			<textarea class="form-control" id="exampleFormControlTextarea1" name="pic"
				rows="2" placeholder="放入圖片連結(.png.jpg.gif)"></textarea>
		</div>
		<br>
		<button type="submit" class="btn btn-primary">送出</button>
	</form>
</div>

<%@include file="include/footer.jsp"%>