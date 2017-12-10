<%@ page import="com.sdatwitter.service.MyTwitterService" %>
<%@ page import="com.google.common.base.Strings" %>
<%@ page import="com.sdatwitter.model.MyTweet" %>
<%@ page import="com.sdatwitter.servlet.PublishServlet" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="utf-8" %>

<html>
<head>
    <title> Publish SDA tweet entry</title>
</head>
<body>

<%
    String error = request.getParameter("error");
   if (error !=null && "".equals((error))) {
       out.print("Brak autora i/lub wiadomosci");
   }

   String author="";
   for ( Cookie cookie:request.getCookies()){
       if (PublishServlet.AUTHOR_COOKIE.equals(cookie.getName())){
           author = cookie.getValue();
       }
   }
%>

<form action="/public" method="post">
    <ul>
        <li>Imie i Nazwisko:<input name="author" type="text" value="<%= author.trim() %>"></li>
        <li>Treść: <textarea name="message" type="text"></textarea></li>
    </ul>
    <input type="submit" value="Submit">
</form>

</body>
</html>