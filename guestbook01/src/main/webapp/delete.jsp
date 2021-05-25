<%@page import="com.douzone.guestbook.dao.GuestbookDao"%>
<%@page import="com.douzone.guestbook.vo.GuestbookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
request.setCharacterEncoding("utf-8");

String no = request.getParameter("no");
long num=Long.parseLong(no);
String password = request.getParameter("password");

GuestbookDao gd= new GuestbookDao();

if(gd.password(num,password)==true)
{	
	gd.delete(num);
}
else{
	response.sendRedirect(request.getContextPath());
}
%>