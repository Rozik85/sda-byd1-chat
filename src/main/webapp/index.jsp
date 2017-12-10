<%@ page import="com.google.common.base.Strings" %>
<%@ page import="com.sdatwitter.model.MyTweet" %>
<%@ page import="com.sdatwitter.service.MyTwitterService" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="utf-8" %>

<html>
<body>
<p>
    <a href=" public.jsp"> Publish tweet</a>
</p>
<%! MyTwitterService service = MyTwitterService.getInstance(); %>

<table border="1">
    <tr>
    <th width="100px">Author</th>
    <th width="200px">Date</th>
    <th width="300px">Message</th>
    </tr>
    <%
        for (MyTweet tweet:service.getMyTweetList()){
            out.print("<tr>");
            out.println("<td>"+ tweet.getAuthor()+"</td>");
            out.println("<td>"+ tweet.getTime()+"</td>");
            out.println("<td>"+ tweet.getTweet()+"</td>");
            out.print("</tr>");
        }
    %>
</table>




<%--<form action="/index.jsp" method="post">--%>
<%--</form>--%>
<%--<%--%>
    <%--for (MyTweet Tweet : service.getMyTweetList()) {--%>
        <%--out.println("Tweet Author: " + Tweet.getAuthor() + "<br>");--%>
        <%--out.println("Tweet message: " + Tweet.getTweet() + "<br>");--%>
        <%--out.println("Tweet time: " + Tweet.getTime() + "<br><br>");--%>
    <%--}--%>
<%--%>--%>


</body>
</html>