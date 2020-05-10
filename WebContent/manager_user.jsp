<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/materialdesignicons.min.css">
<link rel="stylesheet" href="css/style.min.css">
<link rel="stylesheet" href="css/style.css">
<title>用户查询</title>
</head>
<body>
<h1 style="color: #fff;margin-top: 20px;">全部用户查询</h1>
<div class="container-fluid p-t-15">
  <div class="row">
    <div class="col-lg-12">
      <div class="card">
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered">
              <thead>
                <tr>
                  <th>编号</th>
                  <th>学号</th>
                  <th>姓名</th>
                  <th>密码</th>
                  <th>性别</th>
                  <th>年龄</th>
                  <th>电话</th>
                  <th>班级</th>
                  <th>地址</th>
                  <th>路径</th>
                </tr>
              </thead>
              <tbody>
                <!-- EL表达式：${对象} -->
				<c:forEach items="${stuList}" var="u">
					<tr>
						<td>${u.stu_id}</td>
						<td>${u.stu_number}</td>
						<td>${u.stu_name}</td>
						<td>${u.stu_pwd}</td>
						<td>${u.stu_sex}</td>
						<td>${u.stu_age}</td>
						<td>${u.stu_phone}</td>
						<td>${u.stu_class}</td>
						<td>${u.stu_address}</td>
						<td>${u.stu_path}</td>
					</tr>
				</c:forEach>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
	
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.min.js"></script>
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