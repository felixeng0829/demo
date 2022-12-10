<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%
String username=(String)session.getAttribute("name");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>阿飛會員管理系統</title>
</head>
<body>
<h3>敬愛的會員<%=username %>，登入成功</h3>
</body>
</html>