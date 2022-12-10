<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%String username=(String)session.getAttribute("username"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>阿飛會員管理系統</title>
</head>
<body>
	<form action="addMemberController" method="post">
		<table width=350 align=center border=1>
			<tr>
				<td colspan=2 align=center>帳號：<%=username %>可使用<br>請繼續填入基本資料，以完成註冊
			<tr align=center>
				<td width=70>姓名
				<td><input type="text" name="name">
			<tr align=center>
				<td width=70>密碼
				<td><input type="password" name="password">
			<tr align=center>
				<td width=70>地址
				<td><input type="text" name="address">
			<tr align=center>
				<td width=70>電話
				<td><input type="text" name="phone">
			<tr>
				<td colspan=2 align=center><input type="submit" value="註冊">
		</table>
	</form>
</body>
</html>