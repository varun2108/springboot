<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
ADD Todo Page for ${name}

<div class="container">
		<a:form method="post" modelAttribute="todo">
		<a:hidden path="id"/>
			<fieldset class="form-group">
				<a:label path="desc">Description</a:label>
				<a:input path="desc" type="text" class="form-control" required="required"/>
				<a:errors path="desc" class="alert-warning"></a:errors>
			</fieldset>
				<fieldset class="form-group">
				<a:label path="targetDate">Target Date</a:label>
				<a:input path="targetDate" id="targetDate" type="text" class="form-control"
					required="required" />
				<a:errors path="targetDate" cssClass="text-warning" />
			</fieldset>
			<input type="submit" />
		</a:form>
	</div>
	<%@ include file="common/footer.jspf" %>