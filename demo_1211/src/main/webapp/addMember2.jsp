<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%String username=(String)session.getAttribute("username"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>�����|���޲z�t��</title>
</head>
<body>
	<form action="addMemberController" method="post">
		<table width=350 align=center border=1>
			<tr>
				<td colspan=2 align=center>�b���G<%=username %>�i�ϥ�<br>���~���J�򥻸�ơA�H�������U
			<tr align=center>
				<td width=70>�m�W
				<td><input type="text" name="name">
			<tr align=center>
				<td width=70>�K�X
				<td><input type="password" name="password">
			<tr align=center>
				<td width=70>�a�}
				<td><input type="text" name="address">
			<tr align=center>
				<td width=70>�q��
				<td><input type="text" name="phone">
			<tr>
				<td colspan=2 align=center><input type="submit" value="���U">
		</table>
	</form>
</body>
</html>