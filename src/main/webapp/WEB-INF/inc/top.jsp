<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>

<head>

<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>index</title>

<link rel="shortcut icon" href="images/favicon.png" />
<link rel="stylesheet" href="style.css" />
<link rel='stylesheet' id='bootstrap-css-css'
	href='css/bootstrap5152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='responsive-css-css'
	href='css/responsive5152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='pretty-photo-css-css'
	href='js/prettyphoto/prettyPhotoaeb9.css?ver=3.1.4' type='text/css'
	media='all' />
<link rel='stylesheet' id='main-css-css' href='css/main5152.css?ver=1.0'
	type='text/css' media='all' />
<link rel='stylesheet' id='custom-css-css'
	href='css/custom5152.html?ver=1.0' type='text/css' media='all' />



</head>

<body>

	<!-- 导航栏 -->
	<div class="header-wrapper">
		<header>
			<div class="container">


				<div class="logo-container">

					<span class="tag-line"><a href="/qaq/b/list"><font
							color=lavenderblush>校园问答平台</font></a></span>
				</div>
				<nav class="main-nav">
					<div class="menu-top-menu-container">
						<ul id="menu-top-menu" class="clearfix">

							<li><a href="/qaq/tologin">登录</a></li>

							<li><a href="/qaq/tochange">修改信息</a></li>
							<li><a href="/qaq/topublish">发布问题</a></li>
						</ul>
					</div>
				</nav>

			</div>
		</header>
	</div>

	<!-- 搜索框 -->
	<div class="search-area-wrapper">
		<div class="search-area container">


			<form id="search-form" class="search-form clearfix" method="get"
				action="b/list" autocomplete="off">
				<input class="search-term required" type="text" id="s"
					name="plateId" placeholder="*输入对应的数字  1：交流  2：生活  3：考研  4：兼职"
					title="* Please enter a search term!" /> <input class="search-btn"
					type="submit" value="Search" />
				<div id="search-error-container"></div>
			</form>
		</div>
	</div>
</body>
</html>