<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="container">
	<form name="insertForm" action="bookInsert" method="post">
		<table border="1">		
			<tbody>
				<tr>
					<th>도서번호</th>
					<td><input type="text" name="bookNo" readonly></td>
				</tr>
				<tr>
					<th>도서명</th>
					<td><input type="text" name="bookName"></td>
				</tr>
				<tr>
					<th>도서표지</th>
					<td><input type="text" name="bookCoverimg"></td>
				</tr>
				<tr>
					<th>출판일자</th>
					<td><input type="text" name="bookDate"></td>
				</tr>
				<tr>
					<th>금액</th>
					<td><input type="text" name="bookPrice"></td>
				</tr>
				<tr>
					<th>출판사</th>
					<td><input type="text" name="bookPublisher"></td>
				</tr>
				<tr>
					<th>도서소개</th>
					<td><textarea name="bookInfo"></textarea></td>
				</tr>
			</tbody>
		</table>
		<button type="submit">등록</button>
		<button>조회</button>
	</form>
</div>

<script>
document.querySelector('form[name="insertForm"]')
.removeEventListener('submit', bookInsertJq);
$('form[name="insertForm"]').on('submit', bookInsertJq);
alert('도서등록이 완료되었습니다.');

function bookInsertJq(event){
	event.preventDefault();
	
	let bookName = $('[name="bookName"]');

	if(bookName.val() == ''){
		alert('도서명이 입력되지 않았습니다.');
		bookName.focus();
		return;
	}
	

	
	insertForm.submit();
}

</script>