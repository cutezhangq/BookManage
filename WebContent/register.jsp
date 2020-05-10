<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>添加用户页面</title>
</head>
<body>
	<div class="login-container">
		<h1>添加用户</h1>
		<div class="connect">
			<p>SanJiangLibrary.com</p>
		</div>
		<form action="register.do" method="get" id="user_registerForm">
			<div><input type="text" name="stu_number" id="stu_number" placeholder="请输入学号" autocomplete="off" /></div>
			<div><input type="text" name="stu_name" id="stu_name" placeholder="请输入姓名" autocomplete="off" /></div>
			<div><input type="password" name="stu_pwd" id="stu_pwd1" placeholder="请输入密码" oncontextmenu="return false" onpaste="return false"/></div>
			<div><input type="text" name="stu_sex" id="stu_sex" placeholder="请输入性别" autocomplete="off" /></div>
			<div><input type="text" name="stu_age" id="stu_age" placeholder="请输入年龄" autocomplete="off" /></div>
			<div><input type="text" name="stu_phone" id="stu_phone" placeholder="请输入电话" autocomplete="off" /></div>
			<div><input type="text" name="stu_class" id="stu_class" placeholder="请输入班级" autocomplete="off" /></div>
			<div><input type="text" name="stu_adress" id="stu_adress" placeholder="请输入宿舍" autocomplete="off" /></div>
			<div><input type="text" name="stu_path" id="stu_path" placeholder="请输入路径" autocomplete="off" /></div>
			<button id="user_register" type="submit">用户注册</button>
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