<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 사원 조회</title>
</head>
<body>
	<button></button>
	<table>
		<thead>
			<tr>
				<th>No.</th>
				<th>employee_id</th>
				<th>last_name</th>
				<th>email</th>
				<th>hire_date</th>
				<th>job_id</th>
				<th>salary</th>
			</tr>
		</thead>
		<tbody>
			<!--컨트롤러에서 넘겨받은 이름/ var:임시변수 -->
			<c:forEach items="${empList}" var="info"> 
				<tr>
					<td></td> <!--  -->
					<td>${info.employeeId}</td> <!-- info에 해당하는 객체(EmpVO)의 필드 사용하기 -->
					<td>${info.lastName}</td>
					<td>${info.email}</td>
					<td>${info.hireDate}</td>
					<td>${info.jobId}</td>
					<td>${info.salary}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>