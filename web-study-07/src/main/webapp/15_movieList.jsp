<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String[] movieList = {"타이타닉", "시네마천국", "혹성 탈출", "킹콩"};
	pageContext.setAttribute("movieList2", movieList);
%>

<table border="1" style="width: 100%, text-align: center;">
	<tr>
		<th>index</th>
		<th>count</th>
		<th>title</th>
	</tr>

<c:forEach items="${movieList2}" var="movie" varStatus="status">
 	<tr>
		<td>${status.index}</td>
		<td>${status.count}</td>
		<td>${status.title}</td>
	</tr>
</c:forEach>
	
</table>


</body>
</html>