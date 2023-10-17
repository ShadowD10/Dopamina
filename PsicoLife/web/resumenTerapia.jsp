<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Formulario</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->
    

<body>
    <%@include file="WEB-INF/jspf/nav.jspf" %>


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
                        <h3>Nombre de Paciente:</h3>
                        <p>Paciente</p>
                    </div>

                    <div class="resumen_datos">
                        <h3>Fecha de Cita:</h3>
                        <p>......</p>
                    </div>

                    <div class="resumen_datos">
                        <h3>Tipo de Terapia:</h3>
                        <p>Terapia 1</p>
                    </div>

                    <div class="resumen_datos">
                        <h3>Psicologo:</h3>
                        <p>Psicologo 1</p>
                    </div>

                    <div class="resumen_datos">
                        <h3>Total a Pagar:</h3>
                        <p>S/....</p>
                    </div>
                </div>

                <a class="boton_resumen" href="#">Confirmar Pago</a>
            </div>
        </div>
    </section>



    <%@include file="WEB-INF/jspf/footer.jspf" %>

</body>
</html>
