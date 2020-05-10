<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>添加书籍页面</title>
</head>
<body>
	<div class="login-container">
		<h1>添加书籍</h1>
		<div class="connect">
			<p>SanJiangLibrary.com</p>
		</div>
		<form action="book_register.do" method="get" id="book_registerForm">
			<div><input type="text" name="book_name" id="book_name" placeholder="请输入书籍名" autocomplete="off" /></div>
			<div><input type="text" name="book_author" id="book_author" placeholder="请输入书籍作者" autocomplete="off" /></div>
			<div><input type="text" name="book_time" id="book_time" placeholder="请输入出版时间" autocomplete="off"/></div>
			<div><input type="text" name="book_price" id="book_price" placeholder="请输入书籍价格" autocomplete="off" /></div>
			<div><input type="text" name="book_press" id="book_press" placeholder="请输入书籍出版社" autocomplete="off" /></div>
			<div><input type="text" name="book_path" id="book_path" placeholder="请输入书籍封面图" autocomplete="off" /></div>
			<button id="book_register" type="submit">添加图书</button>
		</form>
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