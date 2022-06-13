<%@page import="java.util.List"%>
<%@page import="tw.com.lccnet.web.utils.FirstPersonInfo"%>
<%@page import="tw.com.lccnet.web.utils.PersonalProfile"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%@include file="include/header.jsp"%>
	<%@include file="include/navbar.jsp"%>
	<div class="container">
		<h3>個人簡介</h3>
		<br>
		<%
		List<PersonalProfile> pp = (List<PersonalProfile>) request.getAttribute("personlist");
		List<FirstPersonInfo> fpi = (List<FirstPersonInfo>) request.getAttribute("firstp");
		%>
		<div class="card mb-3" style="max-width: document.body.clientWidth">
			<div class="row no-gutters">
				<div class="col-md-2">
					<img src=<%=pp.get(0).getMyPhoto()%> class="card-img" alt="...">
				</div>
				<div class="col-md-8">
					<div class="card-body">
						<div>
							<p class="card-text">
								<%="<h4>" + fpi.get(0).getCName() + "</h4>"%>
							</p>
							<p class="card-text">
								<%=fpi.get(0).getUniversity()%>
								|
								<%=fpi.get(0).getMajor()%>
							</p>
							<p class="card-text">
								<small> <%=fpi.get(0).getAddress()%> | <%=fpi.get(0).getWorkExperience()%>
								</small>
							</p>
						</div>
						<br>
						<hr>
					</div>
				</div>
			</div>
			<div class="accordion" id="accordionExample">
				<div class="card">
					<div class="card-header" id="headingOne">
						<h2 class="mb-0">
							<button class="btn btn-clear" type="button"
								data-toggle="collapse" data-target="#collapseOne"
								aria-expanded="true" aria-controls="collapseOne">詳細資料</button>
						</h2>
					</div>
					<div id="collapseOne" class="collapse hidden"
						aria-labelledby="headingOne" data-parent="#accordionExample">
						<div class="card-body">
							<div>
								<p class="card-text">
									個人資料 :
									<%=pp.get(0).getInformation()%></p>
								<p class="card-text">
									就業狀態 :
									<%=pp.get(0).getEmploymentStatus()%></p>
								<p class="card-text">
									主要手機 :
									<%=pp.get(0).getPhoneNumber()%></p>
								<p class="card-text">
									E-mail :
									<%=pp.get(0).getEmail()%></p>
								<p class="card-text">
									通訊地址 :
									<%=pp.get(0).getAddress()%></p>
								<p class="card-text">
									英文姓名 :
									<%=pp.get(0).getEName()%></p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<h3>有接觸過的功能</h3>
		<div class="card-deck">
			<div class="card border-light mb-3">
				<div class="card-body">
					<h5 class="card-title">Java_web相關</h5>
					<p class="card-text">1.網頁</p>
				</div>
			</div>
			<div class="card border-light mb-3">
				<div class="card-body">
					<h5 class="card-title">MySQL</h5>
					<p class="card-text">2.網頁與資料庫的連接</p>
				</div>
			</div>
			<div class="card border-light mb-3">
				<div class="card-body">
					<h5 class="card-title">Java框架(進修中...)</h5>
					<p class="card-text"></p>
				</div>
			</div>
		</div>
		<div class="card-deck">
			<div class="card border-light mb-3">
				<div class="card-body">
					<h5 class="card-title">使用程式寄email (可以同時多人)</h5>
					<p class="card-text"></p>
				</div>
			</div>
			<div class="card border-light mb-3">
				<div class="card-body">
					<h5 class="card-title">使用Flask</h5>
					<p class="card-text">
						1.上傳資料到Heroku雲端<br> 2.基礎網站架設
					</p>
				</div>
			</div>
			<div class="card border-light mb-3">
				<div class="card-body">
					<h5 class="card-title">架設discord bot</h5>
					<p class="card-text">
						1.GigHub 上傳資料到雲端保存<br> 2.Replit 保持bot24hr開啟<br>
						3.Dashborad 自動監測bot啟動狀況
					</p>
				</div>
			</div>
		</div>
		<div class="card-deck">
			<div class="card border-light mb-3">
				<div class="card-body">
					<h5 class="card-title">基礎使用Git</h5>
					<p class="card-text"></p>
				</div>
			</div>
			<div class="card border-light mb-3">
				<div class="card-body">
					<h5 class="card-title">網路爬蟲</h5>
					<p class="card-text">
						1.自動抓資料<br> 2.自動抓圖片
					</p>
				</div>
			</div>
			<div class="card border-light mb-3">
				<div class="card-body">
					<h5 class="card-title">資料分析</h5>
					<p class="card-text">
						1.資料清理<br> 2.分析資料<br> 3.作圖
					</p>
				</div>
			</div>
		</div>
		<br>
	</div>
	<div class="container">
		<h3>自傳</h3>
		<div class="card" style="max-width: document.body.clientWidth">
			<div class="card-body">
				<div>
					<h5 class="card-title">一、背景與個人特質:</h5>
					<p class="card-text">我是解庚霖，大學就讀中國文化大學生命科學系，個人特質偏向細心，隨和，抗壓力強。</p>
					<br>
				</div>
				<div>
					<h5 class="card-title">二、學歷與專業能力:</h5>
					<h6>1.經歷:</h6>
					<p class="card-text">在生物相關科系畢業後，有再進修職訓局的【Python 大數據分析】課程，有學過
						機器學習、資料分析、網路爬蟲，並且在課堂中也學習過MySQL與JAVA，在課程中發現自己對程式很有興趣，並且在資料分析這塊，我運用大學平時報告和專題的經驗，使我很快找到了主題，並完成了課題。在上課中學到且感受到電腦程式在未來的發展與應用，所以想從事相關產業。
						平時也有做程式相關的練習，另外也有自學Git，使用GitHub。</p>
					<h6>2.進修:</h6>
					<p class="card-text">目前有再繼續進修Java web方面的課程，而之後會往Java框架的目標邁進。</p>
					<br>
				</div>
				<div>
					<h5 class="card-title">三、工作經歷:</h5>
					<h6>1.生醫相關媒體公司(實習):</h6>
					<p class="card-text">在大三升大四的暑假有去外面實習，在實習的時候跟著同事們參與了採訪工作、記者會、展覽會、文章的翻譯與撰寫，在文章方面我運用了在學校學得的技巧，可以快速地完成工作。在這些經歷中，我學到了如何與同事的相處，工作時該有的態度與細心度。</p>
					<h6>2.問號咖啡:</h6>
					<p class="card-text">在疫情期間我有到朋友的咖啡店打工，負責的工作是收銀、送餐與整理麵包櫃，在面對來來往往的客人，我學會了如何與顧客應對，人潮眾多時，也訓練了良好的抗壓力與處事能力。</p>
					<br>
				</div>
				<div>
					<h5 class="card-title">四、未來展望:</h5>
					<p class="card-text">
						看好電腦程序在未來的實用價值與潛力，所以真的想從事相關產業，期望有公司可以給我面試的機會，希望以後能成為專業的工程師。</p>
					<br>
				</div>
			</div>
		</div>
	</div>
	<%@include file="include/footer.jsp"%>
</body>
</html>