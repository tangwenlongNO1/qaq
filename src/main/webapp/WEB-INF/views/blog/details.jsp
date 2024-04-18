<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/inc/base_path.jsp"%>
<meta charset="UTF-8">
<title>详情</title>
<%@ include file="/WEB-INF/inc/top.jsp"%>
</head>
<body>
	<div class="page-container">
		<div class="container">
			<div class="row">

				<!-- start of page content -->
				<div class="span8 page-content">

					<article class=" type-post format-standard hentry clearfix">

						<h1 class="post-title">${blog.details }</h1>

						<div class="post-meta clearfix">

							<span class="category"><a href="/qaq/b/list?plateId=${blog.plateId }"
								title="View all posts in Server &amp; Database">${blog.plateId }</a></span> <span
								class="comments"><a href="#"
								title="Comment on Integrating WordPress with Your Website">3
									评论</a></span> <span class="like-count">66</span>
						</div>

						<p>${blog.details }</p>



					</article>

					<div class="like-btn">

						<form id="like-it-form" action="#" method="post">
							<span class="like-it ">66</span> <input type="hidden"
								name="post_id" value="99"> <input type="hidden"
								name="action" value="like_it">
						</form>

						<span class="tags"> <strong>Tags:&nbsp;&nbsp;</strong><a
							href="/qaq/b/list?plateId=${blog.plateId }" rel="tag">学习</a>
						</span>

					</div>
					<%@ include file="/WEB-INF/views/comment/comment.jsp"%>

					<!-- end of comments -->

				</div>
				<!-- end of page content -->


				<!-- 侧边栏 -->
				<%@ include file="/WEB-INF/inc/side.jsp"%>
				<!-- end of sidebar -->
			</div>
		</div>
	</div>
	<%@ include file="/WEB-INF/inc/foot.jsp"%>
</body>
</html>