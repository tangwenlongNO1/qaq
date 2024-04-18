<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section id="comments">

		<h3 id="comments-title">评论</h3>

		<c:forEach items="${pageInfo.list}" var="c">
			<dl>
				<dt>
					<big>${c.content }</big>
				</dt>
				<hr></hr>
				<b><i><dd>评论者ID：${c.id}&nbsp;&nbsp;&nbsp;评论时间：${c.commentTime}</dd></i></b>

			</dl>
		</c:forEach>

		<div id="respond">

			<h3>留下你的评论</h3>



			<form action="c/add" method="post" id="commentform">

				<div>
					<textarea class="span8" name="content" id="comment" cols="58"
						rows="10"></textarea>
				</div>


				<div>
					<input class="btn" name="submit" type="submit" id="submit"
						value="提交">
				</div>

			</form>

		</div>

	</section>
</body>
</html>