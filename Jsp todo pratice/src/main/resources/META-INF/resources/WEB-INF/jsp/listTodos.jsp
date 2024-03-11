<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>List todos</title>
	</head>
	<body>
		<h1>List todos page</h1>
		<div>Your todos are: </div>
		<table>
			<thead></thead>
				<tr>
					<th>id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
				</tr>
			<tbody>
				<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.id }</td>
					<td>${todo.description }</td>
					<td>${todo.targetDate }</td>
					<td>${todo.done }</td>
				</tr>
			</tbody>
				
		</table>
	</body>

</html>