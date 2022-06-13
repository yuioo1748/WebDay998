<%@include file="include/header.jsp"%>
<%@include file="include/navbar.jsp"%>

<div class="container">
	<div class="card-deck">

		<c:forEach items="${license}" var="license" begin="0" end="2">

			<div class="card" style="width: 18rem;">
				<img class="card-img-top" src="${license.pic}" alt="...">
				<div class="card-body">
					<p class="card-text">
					<h5>${license.name}</h5>
					</p>
				</div>
			</div>

		</c:forEach>
	</div>
</div>
<br>
<br>
<div class="container">
	<div class="card-deck">
		<c:forEach items="${license}" var="license" begin="3" >

			<div class="card" style="width: 25rem;">
				<img class="card-img-top" src="${license.pic}" alt="...">
				<div class="card-body">
					<p class="card-text">
					<h5>${license.name}</h5>
					</p>
				</div>
			</div>
		</c:forEach>

	</div>
</div>

<%@include file="include/footer.jsp"%>
