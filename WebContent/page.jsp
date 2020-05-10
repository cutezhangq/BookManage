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
<title>书籍管理页面</title>
<style type="text/css">
	#image{
		witdh:40px;
		height:80px;
		margin: auto;	
	}
	td{
		text-align: center;	
	}
</style>
</head>
<body>
<h1 style="color: #fff;margin-top: 20px;">书籍管理</h1>
<div class="container-fluid p-t-15">
  <div class="row">
    <div class="col-lg-12">
      <div class="card">
        <div class="card-toolbar clearfix">
          <form class="pull-right search-bar" action="findByName.do" method="post" role="form">
            <div class="input-group">
              <div class="input-group-btn">
                <input type="hidden" name="search_field" id="search-field" value="title">
                <button class="btn btn-default dropdown-toggle" id="search-btn" data-toggle="dropdown" type="button" 
                aria-haspopup="true" aria-expanded="false" style="width: 67px;height: 37px;">
                	书名 <span class="caret"></span>
                </button>
                <ul class="dropdown-menu">
                  <li> <a tabindex="-1" href="javascript:void(0)" data-field="title">书名</a> </li>
                  <li> <a tabindex="-1" href="javascript:void(0)" data-field="bk_author">作者</a>
                  <li> <a tabindex="-1" href="javascript:void(0)" data-field="bk_press">出版社</a> </li>
                </ul>
              </div>
              <input type="text" class="form-control" value="" name="book_name" 
              style="width: 213px;" placeholder="请输入搜索的书名">
            </div>
          </form>
          <div class="toolbar-btn-action">
            <a class="btn btn-primary m-r-5" href="book_register.jsp"><i class="mdi mdi-plus"></i> 新增书籍</a>
          </div>
        </div>
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
                  <th>操作</th>
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
						<td><img src="${b.book_path}" alt="" id="image"></td>
						<td><div class="btn-group">
                      		<a class="btn btn-xs btn-default" href="findId.do?id=${b.book_id}" title="修改" data-toggle="tooltip"><i class="mdi mdi-pencil">修改</i></a>
                      		<a class="btn btn-xs btn-default" href="delete.do?id=${b.book_id}" title="删除" data-toggle="tooltip"><i class="mdi mdi-window-close">删除</i></a>
                    		<!-- 点击借阅，将 book_id传过去-->
                    		<a class="btn btn-xs btn-default" href="order.jsp?id=${b.book_id}" title="借阅" data-toggle="tooltip"><i class="mdi mdi-window-close">借阅</i></a>
                    	</div></td>
					</tr>
				</c:forEach>
              </tbody>
            </table>
          </div>
          
          <ul class="pagination">
            <c:if test="${index>1}">
            	<!-- 跳转到 page.do页面并传递参数index   ？是占位符-->
				<a href="page.do?index=1">首页</a>
            	<a href="page.do?index=${index-1}">上一页</a>
            </c:if>
            <c:if test="${total>index}">
            	<a href="page.do?index=${index+1}">下一页</a>
				<a href="page.do?index=${total }">末页</a>
            </c:if>	
          </ul>
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