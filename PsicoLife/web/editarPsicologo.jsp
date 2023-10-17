<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Editar Psicologo</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->


    <body>
        <%@include file="WEB-INF/jspf/navLogueado.jspf" %>


        <!-- EDITAR PACIENTE -->

        <section class="editar_perfil contenedor">
            <div class="panel">
                <div class="panel_contenido">
                    <a href="#" class="text-center fs-2">PSICO-LIFE</a>
                    <a href="verPacientes.jsp">Ver Pacientes</a>
                    <a href="verCitas.jsp">Ver Citas</a>
                    <a href="verDoctores.jsp">Ver Doctores</a>
                    <a href="index.jsp">Cerrar Sesion</a>
                </div>
            </div>

            <div class="editar_perfil_contenido editar_paciente">
                <h1 class="titulo_editar">Editar Psicologo</h1>
                <div class="editar_informacion">
                    <div class="inputs">
                        <label>Nombre:</label>
                        <input type="text" placeholder="Cambiar Nombre" />
                    </div>

                    <div class="inputs">
                        <label>Especialidad:</label>
                        <input type="text" placeholder="Cambiar Parentezco" />
                    </div>

                    <div class="inputs">
                        <label>Cod Colegiatura:</label>
                        <input type="number" placeholder="Cambiar Edad" />
                    </div>

                    <input class="boton_gestor_usuario" type="submit" value="Actualizar">
                </div>   
            </div>
        </section>



        <%@include file="WEB-INF/jspf/footer.jspf" %>

    </body>
</html>
