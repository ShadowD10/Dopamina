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
                    <a href="verDoctores.jsp">Ver Doctores</a>
                    <a href="index.jsp">Cerrar Sesion</a>
                </div>
            </div>

            <div class="paciente_contenido">
                <h1 class="titulo_paciente">Psicologos</h1>
                <div class="pacientes_flex">
                    <div class="card_paciente">
                        <h2>Psicologo 1</h2>
                        <div class="btn_pacientes">
                            <a class="btn_editar" href="editarPsicologo.jsp">Editar</a>
                            <a class="btn_eliminar" href="#">Eliminar</a>
                        </div>
                    </div>
                    
                    <div class="card_paciente">
                        <h2>Psicologo 2</h2>
                        <div class="btn_pacientes">
                            <a class="btn_editar" href="editarPsicologo.jsp">Editar</a>
                            <a class="btn_eliminar" href="#">Eliminar</a>
                        </div>
                    </div>
                    
                    <div class="card_paciente">
                        <h2>Psicologo 3</h2>
                        <div class="btn_pacientes">
                            <a class="btn_editar" href="editarPsicologo.jsp">Editar</a>
                            <a class="btn_eliminar" href="#">Eliminar</a>
                        </div>
                    </div>
                    
                    <div class="card_paciente">
                        <h2>Psicologo 4</h2>
                        <div class="btn_pacientes">
                            <a class="btn_editar" href="editarPsicologo.jsp">Editar</a>
                            <a class="btn_eliminar" href="#">Eliminar</a>
                        </div>
                    </div>
                    
                    <div class="card_paciente">
                        <h2>Psicologo 5</h2>
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
