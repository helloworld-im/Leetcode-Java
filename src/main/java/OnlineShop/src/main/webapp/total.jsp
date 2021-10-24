
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Total</title>
</head>
<%
    int t1 = Integer.parseInt(session.getAttribute("item1").toString());
    int t2 = Integer.parseInt(session.getAttribute("item2").toString());
%>
<body>
<h1>Total</h1>

<table>
    <tr>
        <td>Item1 total: </td>
        <td>Rs <%=t1%></td>
    </tr>
    <tr>
        <td>Stationary Total: </td>
        <td>Rs <%=t2%></td>
    </tr>
    <tr>
        <td><b>Grand Total: </b></td>
        <td>Rs <%=t1+t2%></td>
    </tr>

</table>
<p>19BCI0191</p>
</body>
</html>
