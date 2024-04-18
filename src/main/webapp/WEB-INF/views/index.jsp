<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>

<head>
<%@ include file="/WEB-INF/inc/base_path.jsp"%>
<meta charset="UTF-8" />


<title>首页</title>

<%@ include file="/WEB-INF/inc/top.jsp"%>
</head>



<!-- Start of Page Container -->
<div class="page-container">
	<div class="container">
		<div class="row">

			<!-- start of page content -->
			<div class="span8 main-listing">

				<article class="format-standard type-post hentry clearfix">

					<header class="clearfix">
<c:forEach items="${pageInfo.list}" var="b"><dl><h3 class="post-title">
				<dt>
					<a href="b/detail/${b.blogId}"><big>${b.details }</big></a>
				</dt></h3>
				<hr></hr>
				<b><i><dd>发布者ID：${b.id}&nbsp;&nbsp;&nbsp;发布时间：${b.time }</dd></i></b>
				<dd class="cheng">
					<b><i>模块${b.plateId }</i></b>
				</dd>
			</dl>
		</c:forEach>
</header>
</article>
</div>



			<!-- 侧边栏 -->
			<%@ include file="/WEB-INF/inc/side.jsp"%>
			<!-- end of sidebar -->
		</div>
	</div>
</div>
<!-- End of Page Container -->



<!-- 底部 -->
<%@ include file="/WEB-INF/inc/foot.jsp"%>

</body>

</html>