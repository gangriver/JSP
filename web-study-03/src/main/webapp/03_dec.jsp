<%@page import="java.util.ArrayList"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! //선언문
	String str = "안녕하세요";

	int a=5, b=-5;
	
	public int abs(int n){
		return n>0? n : -n;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a=5, b=-5;
	PrintWriter out2 = null;
	ArrayList list = null;
	
	int c = 100;
	out.println(str + "<br>");
	out.println(c + "<br>");
	out.println(a + "의 절대값 : " + abs(a));
	out.println(b + "의 절대값 : " + abs(b));
%>
<hr>
<%
	c= 120;
	out.println(str + "<br>");
	out.println(c + "<br>");
	out.println(a + "의 절대값 : " + abs(a));
	out.println(b + "의 절대값 : " + abs(b));
%>
</body>
</html>