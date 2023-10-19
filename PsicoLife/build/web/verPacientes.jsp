<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Ver Pacientes</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->

    <style>
        .editar_perfil{
            margin-top: 50px;
            margin-bottom: 60px;
        }
    </style>

    <body>


        <!-- ADMINISTRADOR VER PACIENTES-->

        <!-- PACIENTES REGISTRADOS -->

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

            <div class="paciente_contenido">
                <h1 class="titulo_paciente">Pacientes Registrados</h1>
                <div class="pacientes_flex">
                    <div class="card_paciente card_titulo">
                        <h2>Nombre Paciente</h2>
                        <h2>Edad</h2>
                        <h2>Parentezco</h2>
                        <h2>Fecha y Hora</h2>
                        <h2>Terapia</h2>
                        <h2>Psicologo</h2>
                    </div>

                    <div class="card_paciente">
                        <h2 class="card_elemento">Juan Carlos Osorio</h2>
                        <h2 class="card_elemento">27 años</h2>
                        <h2 class="card_elemento">Hijo</h2>
                        <h2 class="card_elemento">19/10/2023 19:28:32</h2>
                        <h2 class="card_elemento">Terapia Individual</h2>
                        <h2 class="card_elemento">Dr Mendez</h2>
                    </div>

                    <div class="card_paciente">
                        <h2 class="card_elemento">Juan Carlos Osorio</h2>
                        <h2 class="card_elemento">27 años</h2>
                        <h2 class="card_elemento">Hijo</h2>
                        <h2 class="card_elemento">19/10/2023 19:28:32</h2>
                        <h2 class="card_elemento">Terapia Individual</h2>
                        <h2 class="card_elemento">Dr Mendez</h2>
                    </div>

                    <div class="card_paciente">
                        <h2 class="card_elemento">Juan Carlos Osorio</h2>
                        <h2 class="card_elemento">27 años</h2>
                        <h2 class="card_elemento">Hijo</h2>
                        <h2 class="card_elemento">19/10/2023 19:28:32</h2>
                        <h2 class="card_elemento">Terapia Individual</h2>
                        <h2 class="card_elemento">Dr Mendez</h2>
                    </div>

                    <div class="card_paciente">
                        <h2 class="card_elemento">Juan Carlos Osorio</h2>
                        <h2 class="card_elemento">27 años</h2>
                        <h2 class="card_elemento">Hijo</h2>
                        <h2 class="card_elemento">19/10/2023 19:28:32</h2>
                        <h2 class="card_elemento">Terapia Individual</h2>
                        <h2 class="card_elemento">Dr Mendez</h2>
                    </div>

                </div>

            </div>
        </section>


        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
