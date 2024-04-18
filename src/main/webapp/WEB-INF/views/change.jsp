<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>

<head>
<%@ include file="/WEB-INF/inc/base_path.jsp"%>
<meta charset="UTF-8" />
<title>修改密码</title>
<%@ include file="/WEB-INF/inc/top.jsp"%>




</head>

<body>



	<!-- Start of Page Container -->
	<div class="page-container">
		<div class="container">
			<div class="row">

				<!-- start of page content -->
				<div class="span8 page-content">

					<article class="type-page hentry clearfix">
						<h1 class="post-title">修改密码</h1>
						<hr>

					</article>


					<form id="contact-form" class="row" action="user/update"
						method="post">

						<div class="span2">
							<label for="name">Name <span>*</span>
							</label>
						</div>
						<div class="span6">
							<input type="text" name="userId" id="name"
								class="required input-xlarge" value=""
								title="* Please provide your name">
						</div>

						<div class="span2">
							<label for="password">Password<span>*</span></label>
						</div>
						<div class="span6">
							<input type="password" name="userPwd" id="email" value=""
								title="* Please provide a valid email address">
						</div>


						<div class="span6 offset2 bm30">
							<input type="submit" value="确认" class="btn btn-primary">

						</div>

						<div class="span6 offset2 error-container"></div>
						<div class="span8 offset2" id="message-sent"></div>

					</form>
				</div>
				<!-- end of page content -->
			</div>
		</div>
	</div>
	<!-- End of Page Container -->

	<!-- Start of Footer -->
	<%@ include file="/WEB-INF/inc/foot.jsp"%>

</body>

</html>