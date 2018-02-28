<%-- 
    Document   : resultado
    Created on : 28/02/2018, 09:20:22
    Author     : 11161502046
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado:</h1>
        <p>IMC: <% out.print(request.getAttribute("imc")); %></p>
        <p>Situação: <% out.print(request.getAttribute("situacao")); %><p/>
    </body>
</html>
