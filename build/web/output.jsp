<%-- 
    Document   : output
    Created on : 14 Feb 2025, 11:25:49 AM
    Author     : samuk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Output Page </title>
    </head>
    <body>
        <h1>Output Page For Age Category!</h1>
        
        <%
       
        String catergory =(String) request.getAttribute("catergory");
        
        %>
    </body>
    
    <p>
        
        Category: <%=catergory%>
        <br>
        
        Please click this <a href="index.html"  >link</a> to go tho the main page.
        
    </p>
</html>
