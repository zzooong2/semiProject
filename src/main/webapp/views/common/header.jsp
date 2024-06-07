<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="header_group">
	<header class="header_all">
		<ul class="top_menu">
			<li>분야 카테고리
				<ul class="sub_menu">
					<li><a href="/category/list.do?type=ITㆍ프로그래밍">ITㆍ프로그래밍</a></li>
					<li><a href="/category/list.do?type=디자인">디자인</a></li>
					<li><a href="/views/category/category_media.jsp">영상ㆍ사진</a></li>
					<li><a href="/views/category/category_marketing.jsp">마케팅</a></li>
					<li><a href="/views/category/category_edu.jsp">교육</a></li>
				</ul>
			</li>
		</ul>
		<!-- 로고 -->
		<a href="/">
		<img class="Logo" src="/resources/img/Logo.png" alt="logo">
		</a>
		<!-- Search(돋보기) -->

		<form class="search-box" method="" class="formSetting">
			<input class="search-txt" type="text" name="searchTxt" value="">
			<button class="search-btn" type="submit">
				<i class="fa-solid fa-magnifying-glass" style="color: #ff8e47;"></i>
			</button>
		</form>
		<!-- 네비게이션 -->
		<div class="nav">

		<c:choose>
			<c:when test="${sessionScope.userName != null}">
			<li><a href="/customerService/list.do?cPage=1&category=Q_TITLE&search-text=">SERVICE</a></li>
			
			<li><a href="/notice/list.do?cPage=1&category=N_TITLE&earch-text=">NOTICE</a></li>
			
			<li><a href="/member/logout.do">로그아웃</a></li>

			<li><a href="/views/member/myPage.jsp">마이페이지</a></li>
			</c:when>
			<c:otherwise>
			<li><a href="/customerService/list.do?cPage=1&category=Q_TITLE&search-text=">SERVICE</a></li>
			
			<li><a href="/notice/list.do?cPage=1&category=N_TITLE&earch-text=">NOTICE</a></li>

			<li><a href="/form/loginForm.do">로그인</a></li>
			
			<li><a href="/form/registerForm.do">회원가입</a></li>
			</c:otherwise>
		</c:choose>

		</div>
	</header>
</div>
<!-- 헤더 구분 선 -->
<hr>
