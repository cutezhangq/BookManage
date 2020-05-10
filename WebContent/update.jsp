<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>书籍修改页面</title>
</head>
<body>
	<div class="login-container">
		<h1 style="color: #fff;margin-top: 20px;">修改书籍</h1>
		<div class="connect">
			<p>SanJiangLibrary.com</p>
		</div>
		<form action="update.do" method="post" id="book_updateForm">
			<div><input type="hidden" name="book_id" value="${b.book_id}"/></div>
			<div>书名：<input type="text" name="book_name" value="${b.book_name}"/></div>
			<div>作者：<input type="text" name="book_author" value="${b.book_author}"/></div>
			<div>出版时间：<input type="text" name="book_time" value="${b.book_time}"/></div>
			<div>图书价格：<input  type="text" name="book_price" value="${b.book_price}"/></div>
			<div>出版社：<input type="text" name="book_press" value="${b.book_press}"/></div>
			<div>图片路径：<input type="text" name="book_path" value="${b.book_path}"/></div>
			<button id="book_update" type="submit">更新</button>
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