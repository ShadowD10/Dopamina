<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Formulario</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->
    

<body>
    <%@include file="WEB-INF/jspf/nav.jspf" %>
    <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

        if(session.getAttribute("user")==null){
            response.sendRedirect("login.jsp");
        }        
    %>

     <!-- RESUMEN CITAS -->

    <section class="resumen contenedor">
        <div class="resumen_grid">
            <div class="resumen_imagen">
                <div class="imagen">
                    <img src="imgs/noche.png" alt="">
                </div>
            </div>
            <div class="resumen_contenido">
                <p class="text-center"><h2>${mensaje}</h2></p>
            </div>
        </div>
    </section>



    <%@include file="WEB-INF/jspf/footer.jspf" %>

</body>
</html>
