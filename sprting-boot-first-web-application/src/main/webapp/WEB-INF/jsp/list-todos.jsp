
<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
list of todos<br>

	${name}
	<BR/>
	<table class="table table-striped">
	<tr>
		<th>name</th>
		<th>desc</th>
		<th>done</th>
		<th>date</th>
		<th></th>
		<th></th>
		</tr>
		<c:forEach items="${todos}" var="item">
		<tr>
		<td>${item.user}</td>
		<td>${item.desc}</td>
		<td>${item.done}</td>
		<td><fmt:formatDate value="${item.targetDate}" pattern="dd/MM/yyyy"/></td>
		<td><a type="button" class="btn btn-success" href="/update-todo?id=${item.id}">Update</a></td>
		<td><a type="button" class="btn btn-warning" 
		href="/delete-todo?id=${item.id}">Delete</a></td>
		</tr>
		</c:forEach>
		
	</table>
	<a href="/add-todo" class="btn btn-default">Add a Todo</a> 
</div>
<%@ include file="common/footer.jspf" %>
