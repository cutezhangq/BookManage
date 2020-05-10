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
<title>书籍信息列表</title>
</head>
<body>
<h1 style="color: #fff;margin-top: 20px;">全部图书查询</h1>
<div class="container-fluid p-t-15">
  <div class="row">
    <div class="col-lg-12">
      <div class="card">
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered">
              <thead>
                <tr>
                  <th>书籍编号</th>
                  <th>书籍名字</th>
                  <th>书籍作者</th>
                  <th>出版时间</th>
                  <th>书籍价格</th>
                  <th>书籍出版社</th>
                  <th>书籍封面路径</th>
                </tr>
              </thead>
              <tbody>
                <!-- EL表达式：${对象} -->
				<c:forEach items="${bookList}" var="b">
					<tr>
						<td>${b.book_id}</td>
						<td>${b.book_name}</td>
						<td>${b.book_author}</td>
						<td>${b.book_time}</td>
						<td>${b.book_price}</td>
						<td>${b.book_press}</td>
						<td>${b.book_path}</td>
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