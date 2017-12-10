<%@ page contentType="text/html" pageEncoding="utf-8" %>

<html>
<head>
    <title>Log_In</title>
</head>
<body>

<h2>Log in</h2>

<%
    String error = request.getParameter("error");
    if (error != null && error.equals("1")) {
        out.println("Wrong login and/or password!" + "<br><br>");
    }
%>

<form action="/loginServlet" method="post">

    <label>nick:<br>
        <input name="nick">
    </label> <br>

    <label>password:<br>
        <input name="password">
    </label> <br><br>
    <input type="submit" value="Loguj">
</form>

<br>

<a href="/index.jsp">Strona główna</a><br><br>

</body>
</html>