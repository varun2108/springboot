<%@taglib uri="http://www.springframework.org/tags/form" prefix="c"%>
<html>

<head>
<title>First Web Application</title>
</head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
<body>
ADD Todo Page for ${name}

<div class="container">
		<c:form method="post" modelAttribute="todo">
			<fieldset class="form-group">
				<c:label path="desc">Description</c:label>
				<c:input path="desc" type="text" class="form-control" required="required"/>
				<c:errors path="desc" class="alert-warning"></c:errors>
			</fieldset>
			<input type="submit" />
		</c:form>
	</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>