<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单详情页</title>
</head>
<body>
<table>
	<tr>
		<td>订单编号</td>
		<td>借阅人姓名</td>
		<td>借阅书籍名</td>
		<td>借阅时间</td>
		<td>借阅备注</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${orders}" var="o">
	<tr>
		<td>${o.order_id}</td>
		<td>${o.stu.stu_name}</td>
		<td>${o.book.book_name}</td>
		<td>${o.order_time}</td>
		<td>${o.order_ceil}</td>
		<td><a></a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>