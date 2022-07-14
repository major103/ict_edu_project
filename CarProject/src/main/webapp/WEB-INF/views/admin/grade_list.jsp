<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap 3.x -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<!-- menu bar 삽입 -->
	<%@include file="menu_bar.jsp" %>
	
	<div class="container">
		<div class="table-responsive">
			<div class="table-wrapper"">
				<div class="table-title">
					<div class="row">
						<div class="col-xs-5">
							<h2>
								 <b>Grade Board</b>
							</h2>
						</div>

					</div>
				</div>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>No.</th>
							<th>작성자</th>
							<th>내용</th>
							<th>추천수</th>
							<th>조회수</th>
							<th>평점</th>
						</tr>
					</thead>
					<tbody>
						<!-- data -->
						
						<c:forEach var="vo" items="${ list }" varStatus="i">
							<tr>
								<td>${ vo.g_index }</td>
								<td>${ vo.u_id }</td>
								<td>${ vo.g_content }</td>
								<td>${ vo.g_good }</td>
								<td>${ vo.g_count }</td>
								<td>${ vo.g_point }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>