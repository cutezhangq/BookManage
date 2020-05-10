<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>管理员登陆界面</title>
</head>
<body>
	<div class="login-container">
		<h1>管理员：${ad.admin_name},登陆成功！</h1>
		<div class="connect">
			<p>SanJiangLibrary.com</p>
		</div><br/><br/>
		<p>个人信息管理</p>
		<a href="register.jsp">
            <button type="button">添加用户</button>
        </a> <br/>
        <a href="stu_show.do">
            <button type="button">全部用户查询</button>
        </a> <br/><br/>
        <p>书籍管理</p>
        <a href="book_register.jsp">
            <button type="button">添加书籍</button>
        </a> <br/>
        <a href="show.do">
            <button type="button">全部书籍查询</button>
        </a> <br/>
        <a href="page.do">
            <button type="button">书籍管理</button>
        </a> <br/><br/>
        <p>订单管理</p>
        <a href="#">
            <button type="button">订单管理</button>
        </a> <br/>
	</div>
<script src="js/jquery.min.js"></script>
<script src="js/common.js"></script>
<!--背景图片自动更换-->
<script src="js/supersized.3.2.7.min.js"></script>
<script src="js/supersized-init.js"></script>
<!--表单验证-->
<script src="js/jquery.validate.min.js?var1.14.0"></script>
<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
<p>2020.05.05</p>
</div>

</body>
</html>