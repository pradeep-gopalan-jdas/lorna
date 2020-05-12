
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<table width="100%">
	<tbody>
		<tr>
			<td>
				<h2>
					<img
						src="https://html-online.com/editor/tinymce/plugins/emoticons/img/smiley-cool.gif"
						alt="cool" />&nbsp;<em><strong>LUCY</strong></em>
				</h2>
			</td>
			<td>asdasdad</td>
		</tr>
	</tbody>
</table>
<table border="2" width="100%" cellspacing="1" cellpadding="1">
	<tbody>
		<tr>
			<td colspan="2">
				<p>
					<strong>Welcome !!</strong>
				</p>
			</td>
		</tr>
		<tr>
			<td colspan="2"><strong>adad</strong></td>
		</tr>
	</tbody>
</table>

<h1>View Employees List</h1>
<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Salary</th>
		<th>Designation</th>
	</tr>
	<c:forEach var="emp" items="${list}">
		<tr>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			<td>${emp.salary}</td>
			<td>${emp.designation}</td>
		</tr>
	</c:forEach>
</table>