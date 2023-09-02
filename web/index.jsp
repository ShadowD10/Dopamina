<%-- 
    Document   : index
    Created on : 1 set. 2023, 15:17:40
    Author     : Denni Medina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/jspf/enlaces.jspf" %>        
        <title>Fino señores 🧐☕</title>
    </head>
    <body class="container-fluid fondo-general">
        <%@include file="WEB-INF/jspf/encabezado.jspf"%>
        <%@include file="WEB-INF/jspf/menu.jspf"%>
        <main class="bg-header mt-5 mb-3">
            <div class="row  container-fluid">
                <div class="col-xl-5">
                    <img src="img/fondo-nirvana.jpg" width="730" height="400"/>
                    <!-- fotitos de dopamina -->
                </div>
                <div class="col-xl-7 fondo-encabezado">
                    <h1>La dopamina</h1>
                    <p>En Dopamina ofrecemos citas psicologicas y diversas terapias para ayudar al mejoramiento del bienestar mental.</p>
                </div>
            </div>
            <div class="row  container-fluid">
                <!-- fotitos de dopamina -->
            </div>
        </main>
        <%@include file="WEB-INF/jspf/pie.jspf"%>
    </body>
</html>
