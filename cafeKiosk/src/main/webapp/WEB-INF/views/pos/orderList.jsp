<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문내역확인</title>
</head>
<body>

	<table>
		<tr>
			<td>번호</td>
			<td>ID</td>
			<td>PW</td>
			<td>직위</td>
			<td>가입일</td>
		</tr>
		<tr>
			<th>${login.num}</th>
			<th>${login.id}</th>
			<th>${login.pw}</th>
			<th>${login.status}</th>
			<th>${login.regdate}</th>
		</tr>	
	</table>

</body>
</html>