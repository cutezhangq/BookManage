<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>用户登陆界面</title>
</head>
<body>
<div class="login-container">
	<h1>用户：${stu.stu_name},登陆成功！</h1>
	<div class="connect">
		<p>SanJiangLibrary.com</p>
	</div><br/><br/>
	<p>图书馆</p>
		<a href="show.do">
            <button type="button">全部书籍</button>
        </a> <br/>
		<a href="#">
            <button type="button">借书</button>
        </a> <br/>
        <a href="#">
            <button type="button">还书</button>
        </a> <br/>
        <a href="#">
            <button type="button">延长借阅日期</button>
        </a> <br/> <br/>
    <p>操作</p>
	<a href="index.jsp">
      <button type="button">返回</button>
    </a>
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