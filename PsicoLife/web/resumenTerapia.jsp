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
                <h2 class="resumen_titulo">Resumen de Pago</h2>

                <div class="resumen_contenedor_datos">
                    <div class="resumen_datos">
                        <h3>Nombre de Paciente: </h3>
                        <p> ${cita.paciente.nombre}</p>
                    </div>

                    <div class="resumen_datos">
                        <h3>Fecha de Cita: </h3>
                        <p> ${cita.fechaHora}</p>
                    </div>

                    <div class="resumen_datos">
                        <h3>Tipo de Terapia: </h3>
                        <p> ${cita.tipoCita.nombre}</p>
                    </div>

                    <div class="resumen_datos">
                        <h3>Psicologo: </h3>
                        <p> ${cita.tipoCita.psicologo.nombre}</p>
                    </div>

                    <div class="resumen_datos">
                        <h3>Total a Pagar: </h3>
                        <p> S/${cita.tipoCita.precio}</p>
                    </div>
                </div>
                    <form action="Cita" method="POST">
                        <input type="hidden" name="accion" value="REGCITA"/>
                        <input type="hidden" name="fecha" value="${cita.fechaHora}"/>
                        <input type="hidden" name="terapia" value="${cita.tipoCita.idTipoCita}"/>
                        <input type="hidden" name="pacienteId" value="${cita.paciente.idPaciente}"/>
                        <input type="submit" class="btn btn_editar" value="Confirmar Pago" />
                    </form>                
            </div>
        </div>
    </section>



    <%@include file="WEB-INF/jspf/footer.jspf" %>

</body>
</html>
