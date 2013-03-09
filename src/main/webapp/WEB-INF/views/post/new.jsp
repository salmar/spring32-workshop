<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>New Post</title>
</head>
<body>

	<h2>New Post</h2>
	<form:form modelAttribute="post">
		<label>Title</label><form:input path="title" /><br/>
		<label>Body</label><form:textarea path="body" /><br/>
		<label>Author</label><form:input path="author" /><br/>
		<input type="submit" id="save" value="Save"/>
	</form:form>
</body>
</html>
