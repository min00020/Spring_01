<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="container">
    	<h1>도서 조회/수정</h1>
    	<table>
    		<thead>
    			<tr>
    				<th>도서번호</th>
    				<th>도서명</th>
    				<th>표지</th>
    				<th>출판일자</th> 
    				<th>금액</th> 
    				<th>출판사</th> 
    				<th>도서소개</th>
    			</tr>
    		</thead>
    		<tbody>
    			<c:forEach items="${bookList}" var="book">
    				<tr>
	    				<td>${book.bookNo }</td>
	    				<%-- <td>${book.title }</td>
	    				<td>${book.writer }</td>
	    				<td>
							<fmt:formatDate value="${board.regdate}" pattern="yyyy/MM/dd일"/>
						</td> --%>
					</tr>
    			</c:forEach>
    		</tbody>
    	</table>
    </div>