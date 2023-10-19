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



        <!-- REGISTRAR PSICOLOGO -->

        <section class="editar_perfil contenedor">
            <div class="panel panel_administrador">
                <div class="panel_contenido">
                    <a href="#" class="text-center fs-2">PSICO-LIFE</a>
                    <a href="verUsuarios.jsp">Ver Usuarios</a>
                    <a href="verPacientes.jsp">Ver Pacientes</a>
                    <a href="verCitas.jsp">Ver Citas</a>
                    <a href="registrarPsicologo.jsp">Registrar Psicologos</a>
                    <a href="verPsicologos.jsp">Ver Psicologos</a>
                    <a href="index.jsp">Cerrar Sesion</a>
                </div>
            </div>

            <div class="editar_perfil_contenido editar_paciente">
                <h1 class="titulo_editar">Registrar Psicologo</h1>
                <form method="POST">
                    <div class="editar_informacion">
                        <div class="inputs">
                            <label>Nombres y Apellidos:</label>
                            <input type="text" placeholder="Ingresar Nombres" />
                        </div>

                        <div class="inputs">
                            <label>Especialidad:</label>
                            <input type="text" placeholder="Ingresar Especialidad" />
                        </div>

                        <div class="inputs">
                            <label>Cod Colegiatura:</label>
                            <input type="number" placeholder="Ingresar Codigo" />
                        </div>

                        <input class="boton_gestor_usuario" type="submit" value="Actualizar">
                    </div>
                </form>

            </div>
        </section>



        <%@include file="WEB-INF/jspf/footer.jspf" %>

    </body>
</html>
