<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Ver Doctores</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->

    <style>
        .editar_perfil{
            margin-top: 50px;
            margin-bottom: 60px;
        }
    </style>

    <body>


        <!-- ADMINISTRADOR VER DOCTORES-->

        <section class="editar_perfil contenedor">
            <div class="panel">
                <div class="panel_contenido">
                    <a href="#" class="text-center fs-2">PSICO-LIFE</a>
                    <a href="verPacientes.jsp">Ver Pacientes</a>
                    <a href="verCitas.jsp">Ver Citas</a>
                    <a href="registrarPsicologo.jsp">Registrar Psicologos</a>
                    <a href="verPsicologos.jsp">Ver Psicologos</a>
                    <a href="index.jsp">Cerrar Sesion</a>
                </div>
            </div>

            <div class="paciente_contenido">
                <h1 class="titulo_paciente">Psicologos</h1>
                <div class="pacientes_flex">
                    <div class="card_paciente card_titulo">
                        <h2>Nombre Psicologo</h2>
                        <h2>Especialidad</h2>
                        <h2>Codigo Colegiatura</h2>
                        <h2>Opciones</h2>
                    </div>

                    <div class="card_paciente card_psicologo">
                        <h2 class="contenido_psicologo">Juan Pedro Solar Enriquez</h2>
                        <h2 class="contenido_psicologo">Terapeuta Infantil</h2>
                        <h2 class="contenido_psicologo">123456789</h2>
                        <div class="btn_pacientes">
                            <a class="btn_editar" href="editarPsicologo.jsp">Editar</a>
                            <a class="btn_eliminar" href="#">Eliminar</a>
                        </div>
                    </div>
                    
                    <div class="card_paciente card_psicologo">
                        <h2 class="contenido_psicologo">Juan Pedro Solar Enriquez</h2>
                        <h2 class="contenido_psicologo">Terapeuta Infantil</h2>
                        <h2 class="contenido_psicologo">123456789</h2>
                        <div class="btn_pacientes">
                            <a class="btn_editar" href="editarPsicologo.jsp">Editar</a>
                            <a class="btn_eliminar" href="#">Eliminar</a>
                        </div>
                    </div>
                    
                    <div class="card_paciente card_psicologo">
                        <h2 class="contenido_psicologo">Juan Pedro Solar Enriquez</h2>
                        <h2 class="contenido_psicologo">Terapeuta Infantil</h2>
                        <h2 class="contenido_psicologo">123456789</h2>
                        <div class="btn_pacientes">
                            <a class="btn_editar" href="editarPsicologo.jsp">Editar</a>
                            <a class="btn_eliminar" href="#">Eliminar</a>
                        </div>
                    </div>
                    
                    <div class="card_paciente card_psicologo">
                        <h2 class="contenido_psicologo">Juan Pedro Solar Enriquez</h2>
                        <h2 class="contenido_psicologo">Terapeuta Infantil</h2>
                        <h2 class="contenido_psicologo">123456789</h2>
                        <div class="btn_pacientes">
                            <a class="btn_editar" href="editarPsicologo.jsp">Editar</a>
                            <a class="btn_eliminar" href="#">Eliminar</a>
                        </div>
                    </div>
                    
                    <div class="card_paciente card_psicologo">
                        <h2 class="contenido_psicologo">Juan Pedro Solar Enriquez</h2>
                        <h2 class="contenido_psicologo">Terapeuta Infantil</h2>
                        <h2 class="contenido_psicologo">123456789</h2>
                        <div class="btn_pacientes">
                            <a class="btn_editar" href="editarPsicologo.jsp">Editar</a>
                            <a class="btn_eliminar" href="#">Eliminar</a>
                        </div>
                    </div>

                </div>

            </div>
        </section>


        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
