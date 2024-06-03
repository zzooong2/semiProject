<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="header_group">
	<header class="header_all">
		<ul class="top_menu">
			<li>분야 카테고리
				<ul class="sub_menu">
					<li><a href="#">IT/프로그래밍</a></li>
					<li><a href="#">디자인</a></li>
					<li><a href="#">영상/사진</a></li>
					<li><a href="#">마케팅</a></li>
					<li><a href="#">교육</a></li>
				</ul>
			</li>
		</ul>
		<!-- 로고 -->
		<img class="Logo" src="/resources/img/Logo.png" alt="logo">
		<!-- Search(돋보기) -->

		<form class="search-box" method="" class="formSetting">
			<input class="search-txt" type="text" name="searchTxt" value="">
			<button class="search-btn" type="submit">
				<i class="fa-solid fa-magnifying-glass" style="color: #ff8e47;"></i>
			</button>
		</form>
		<!-- 네비게이션 -->
		<div class="nav">

			<li><a href="/views/member/login.jsp">로그인</a></li>

			<li><a href="/views/member/register.jsp">회원가입</a></li>
			
			<li><a href="/customerService/list.do?cPage=1&category=Q_TITLE&search-text=">SERVICE</a></li>

			<!-- <li><a href="">NOTICE</a></li> -->

		</div>
	</header>
</div>
<!-- 헤더 구분 선 -->
<hr>
