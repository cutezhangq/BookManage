<%@ page language="java" contentType="text/html; charset=UTF-8"
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
		<h1>管理员登陆</h1>
		<div class="connect">
			<p>SanJiangLibrary.com</p>
		</div>
		<form action="adlogin.do" method="post" id="adloginForm">
			<div>
				<input type="text"  name="ad_username" id="ad_username" placeholder="用户名" autocomplete="off" />
			</div>
			<div>
				<input type="password" name="ad_password" id="ad_password" placeholder="密码" oncontextmenu="return false" onpaste="return false"/>
			</div>
			<button id="ad_submit" type="submit">管理员登陆</button>
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