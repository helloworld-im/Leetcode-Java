
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AllMart Groceries</title>
</head>
<%
    String s[] = request.getParameterValues("item1");
    int total = 0;
    for(int i=0; i<s.length; i++) {
        total += Integer.parseInt(s[i]);
    }
    session.setAttribute("item1", total);
    response.sendRedirect("index.jsp");
%>
<body>
</body>
</html>
