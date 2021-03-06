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

<style type="text/css">

	#btn1 {
		float: right;
		margin-right: 30px;
	}	

</style>
<script type="text/javascript">

	function modify(){
		
		
	}
	
	function del(){
		
		
	}

</script>
</head>
<body>
	<!-- menu bar 삽입 -->
	<%@include file="../menu_bar.jsp" %>
	
	<div class="container">
		<div class="table-responsive">
			<div class="table-wrapper"">
				<div class="table-title">
					<div class="row">
						<div class="col-xs-5">
							<h2>
								<b>CAR</b>
							</h2>
						</div>
			<div class="btn-group" id="btn1">
				<button type="button" class="btn btn-dark" onclick="location.href='car_insert_form.do'">Insert</button>
				<button type="button" class="btn btn-dark" onclick="modify();">Update</button>
				<button type="button" class="btn btn-dark" onclick="del();">Delete</button>
			</div>
					</div>
				</div>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th></th>
							<th>사진</th>
							<th>이름</th>
							<th>크기</th>
							<th>브랜드</th>
							<th>가격</th>
							<th>연료</th>
							<th>종류</th>
							<th>연비</th>
							<th>출력</th>
							<th>토크</th>
							<th>배기</th>
							<th>엔진</th>
							<th>구동</th>
							<th>변속</th>
						</tr>
					</thead>
					<tbody>
						<!-- data -->
						
						<c:forEach var="vo" items="${ list }" varStatus="i">
							<tr>
								<td><input type="checkbox"></td>
								<td>${ vo.car_photo }</td>
								<td>${ vo.car_name }</td>
								<td>${ vo.car_size }</td>
								<td>${ vo.co_name }</td>
								<td>${ vo.car_price }</td>
								<td>${ vo.car_fuel }</td>
								<td>${ vo.car_type }</td>
								<td>${ vo.car_fcost }</td>
								<td>${ vo.car_output }</td>
								<td>${ vo.car_torq }</td>
								<td>${ vo.car_exhaust }</td>
								<td>${ vo.car_engine }</td>
								<td>${ vo.car_drive }</td>
								<td>${ vo.car_change }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

	</div>
</body>
</html>