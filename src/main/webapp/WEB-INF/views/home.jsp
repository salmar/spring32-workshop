<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h1>Posts</h1>
<p>${greeting}</p>
<a href="<c:url value="/post/new"/>">New post</a>
      <hr>
			<c:forEach items="${posts}" var="post">
				<h2><a href="<c:url value="/post/${post.id}"/>">${post.title} / (${post.author})</a></h2>
    			<p>${post.body }</p>
			</c:forEach>	
</body>
</html>
