<%@ page import="javax.servlet.*" %>
<html>
<head><title>Hello World</title></head>
<body>
Hello World!<br/>
<%
    System.out.println("Your IP address is " + request.getRemoteAddr());
%>
</body>
</html>