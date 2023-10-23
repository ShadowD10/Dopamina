<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Editar Psicologo</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->
    <style>
        .editar_perfil{
            margin-top: 50px;
            margin-bottom: 60px;
        }
    </style>

    <body>
        
        <%@include file="WEB-INF/jspf/validarCuentaAdmin.jspf" %>


        <!-- EDITAR PACIENTE -->

        <section class="editar_perfil contenedor">
            <%@include file="WEB-INF/jspf/panelAdministrador.jspf" %>

            <div class="editar_perfil_contenido editar_paciente">
                <h1 class="titulo_editar">Editar Psicologo</h1>
                <form action="Psicologo" method="POST">
                    <input type="hidden" name="accion" value="ACT">
                    <input type="hidden" name="idPsicologo" value="${psicologo.idPsicologo}">
                    <div class="editar_informacion">
                        <div class="inputs">
                            <label>Nombres y Apellidos:</label>
                            <input name="name" type="text" placeholder="${psicologo.nombre}" value="${psicologo.nombre}" required=""/>
                        </div>
                        <div class="inputs">
                            <label>Especialidad:</label>
                            <input name="especialidad" type="text" placeholder="${psicologo.especialidad}" value="${psicologo.especialidad}" required=""/>
                        </div>

                        <div class="inputs">
                            <label>Cod Colegiatura:</label>
                            <input name="numColegiatura" type="number" placeholder="${psicologo.numColegiatura}" value="${psicologo.numColegiatura}" required=""/>
                        </div>
                        <input class="boton_gestor_usuario" type="submit" value="Actualizar">
                    </div>
                </form>
            </div>
        </section>



        <%@include file="WEB-INF/jspf/footer.jspf" %>

    </body>
</html>
