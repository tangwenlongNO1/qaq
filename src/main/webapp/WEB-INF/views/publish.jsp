<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>

<head>
<%@ include file="/WEB-INF/inc/base_path.jsp"%>
<meta charset="UTF-8" />
<title>发布</title>
<%@ include file="/WEB-INF/inc/top.jsp"%>



</head>

<body>




	<!-- Start of Page Container -->
	<div class="page-container">
		<div class="container">
			<div class="row">

				<!-- start of page content -->
				<div class="span8 page-content">

					<article class=" type-page  hentry clearfix">
						<h1 class="post-title">发布问题</h1>

						<hr>
					</article>


					<div id="respond">


						<form action="b/add" method="post" id="commentform">

							<div>
								<label for="author">主题 </label><p>*输入对应的数字  1：交流  2：生活  3：考研  4：兼职</p> <input class="span4" type="text"
									name="plateId" id="author" value="" size="22">
							</div>



							<div>
								<label for="comment">内容</label>
								<textarea class="span8" name="details" id="comment" cols="58"
									rows="10"></textarea>
							</div>

							<div>
								<input class="btn" name="submit" type="submit" id="submit"
									value="发布">
							</div>

						</form>

					</div>
				</div>
				<!-- end of page content -->



			</div>
		</div>
	</div>
	<!-- End of Page Container -->


	<!-- 底部 -->
	<%@ include file="/WEB-INF/inc/foot.jsp"%>
</body>

</html>