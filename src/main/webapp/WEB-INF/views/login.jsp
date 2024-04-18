<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="/WEB-INF/inc/base_path.jsp" %>

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>登录</title>
	<link rel="shortcut icon" href="images/favicon.png" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />

	<meta property="og:title" content="" />
	<meta property="og:image" content="" />
	<meta property="og:url" content="" />
	<meta property="og:site_name" content="" />
	<meta property="og:description" content="" />
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />


	<link rel="shortcut icon" href="favicon.ico">

	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/style.css">
	<script src="js/modernizr-2.6.2.min.js"></script>

</head>

<body style="background:url(images/wallhaven-rd2dx7_1600x1000.jpg)">

	<div class="container">


		<div class="row">
			<div class="col-md-4 col-md-offset-4">

				<form action="user/login" method="get"  class="fh5co-form animate-box" data-animate-effect="fadeIn">
					<h2>登录</h2>

					<div class="form-group">
						<label for="username" class="sr-only">用户名</label>用户名
						<input type="text" class="form-control" id="username" name="userId"  placeholder="Username" autocomplete="off">
					</div>


					<div class="form-group">
						<label for="password" class="sr-only">密码</label>密码
						<input type="password" class="form-control" id="password" name="userPwd" placeholder="Password"
							autocomplete="off">
					</div>


					<div class="form-group">
						<p><a href="/qaq/toreg">注册</a> &nbsp;<a href="/qaq/b/list">主页</a></p>
					</div>



					<div class="form-group">
						<input type="submit" value="登录" class="btn btn-primary">
					</div>


				</form>
			</div>
		</div>
	</div>





	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Placeholder -->
	<script src="js/jquery.placeholder.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="js/main.js"></script>


</body>

</html>