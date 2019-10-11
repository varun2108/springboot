<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
<div class="container">
list of todos<br>

	${name}
	<BR/>
	<table class="table table-striped">
	<tr>
		<th>name</th>
		<th>desc</th>
		<th>done</th>
		</tr>
		<c:forEach items="${todos}" var="item">
		<tr>
		<td>${item.user}</td>
		<td>${item.desc}</td>
		<td>${item.done}</td>
		<td><a type="button" class="btn btn-warning" 
		href="/delete-todo?id=${todo.id}">Delete</a>
		</tr>
		</c:forEach>
		
	</table>
	<a href="/add-todo" class="btn btn-default">Add a Todo</a> 
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>