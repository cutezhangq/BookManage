<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>借阅备注填写页面</title>
</head>
<body>
<%
	//从page页面传参过来的
   String idStr=request.getParameter("id");
    int id=0;
    if(idStr!=null){
    	id=Integer.parseInt(idStr);
    }
%>
<!-- jsp页面相当于servlet页面，在里面写逻辑需要使用<和%这种关键字符 -->
<form action="addOrder.do" method="post">
图书编号<input type="text" name="book_id" value="<%=id%>"><br>
学生编号<input type="text" name="stu_id" value="${s.stu_id}"><br>
<p>备注:<input type="text" name="order_ceil"></p>
<input type="submit" value="立即借书">
</form>
</body>
</html>