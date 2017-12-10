<%@ page import="com.sda.service.MyTwitterService" %>
<%@ page import="com.sda.model.Tweet" %>
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
        for (Tweet tweet:service.getMyTweetList()){
            out.print("<tr>");
            out.println("<td>"+ tweet.getUser()+"</td>");
            out.println("<td>"+ tweet.getTime()+"</td>");
            out.println("<td>"+ tweet.getMessage()+"</td>");
            out.print("</tr>");
        }
    %>
</table>

</body>
</html>