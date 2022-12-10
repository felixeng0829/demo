<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>阿飛會員管理系統</title>
</head>
<body>
	<form action="UsernameCheckController" method="post">
		<table width=350 align=center border=1>
			<tr>
				<td colspan=2 align=center>會員基本資料
			
			<tr align=center>
				<td width=70>帳號
				<td><input type="text" name="username">
			
			<tr>
				<td colspan=2 align=center><input type="submit" value="確認帳號是否重複">
		</table>
	</form>
</body>
</html>