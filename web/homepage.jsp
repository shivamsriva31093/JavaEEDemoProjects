<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
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

    <div align="center" style="border: dotted 1px #ff3c6a;">
        <h4 align="center" > Submit a number to view table!</h4>
    </div>
</body>
</html>