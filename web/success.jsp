<%@ page import="model.User" %><%--
  Created by IntelliJ IDEA.
  User: sHIVAM
  Date: 9/10/2017
  Time: 5:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% User user = (User)request.getSession().getAttribute("user");%>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <div>
        <h1 style="text-align: center">
            Welcome <%=user.getName()%> !
        </h1>
    </div>
</body>
</html>
