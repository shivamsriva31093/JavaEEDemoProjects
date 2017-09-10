<%--
  Created by IntelliJ IDEA.
  User: sHIVAM
  Date: 9/10/2017
  Time: 12:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <div align="center" style="border: 1px solid #ff2977;">
        <h2>Multiplication Table Generator</h2>
        <form action="/generate" method="get">
            <table cellpadding="2" cellspacing="5">
                <tr>
                    <td align="left">
                        <h3> Enter a number</h3>
                    </td>
                    <td>
                        <input type="number" name="argument">
                    </td>
                </tr>
                <tr>
                    <td>
                    </td>
                </tr>
            </table>
            <input type="submit" value="Submit">
        </form>

        <%--<div align="center" style="display: inline-block; border: dashed 1px rebeccapurple">--%>
            <%--<form action="/home"><input type="submit" value="Reset"></form>--%>
        <%--</div>--%>
    </div>
    <% int n = (int)request.getAttribute("args"); %>
    <% if(n == 0) {%>
    <div align="center" style="border: dotted 1px #ff3c6a;">
        <h4 align="center" > Submit a number to view table!</h4>
    </div>
    <%} else { %>
    <div align="center" style="border: dotted 1px #ff3c6a; display: inline-block">
        <table cellspacing="5" cellpadding="2">
            <tbody>
                <% for (int i=1; i<11; i++) { %>
                    <tr>
                        <td align="left">
                            <%=n%>*<%=i%> =
                        </td>
                        <td>
                            <%=(n*i)%>
                        </td>
                    </tr>
                <%}%>
            </tbody>
        </table>
    </div>
<%}%>
</body>
</html>
