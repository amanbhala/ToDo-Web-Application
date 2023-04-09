<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<html>
	<head>
		<title>List ToDos Page</title>
	</head>
	<body>
        <div>Welcome ${name} </div>
        <div>Your todos are: ${todos}</div>
		<table>
			<thead>
				<tr>
					<th>id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
				</tr>
			</thead>
			<c:forEach items="${}" var="todo">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>