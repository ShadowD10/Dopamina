<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Ver Usuarios</title>
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


        <!-- ADMINISTRADOR VER PACIENTES-->

        <!-- USUARIOS REGISTRADOS -->

        <section class="editar_perfil contenedor">
            <div class="panel panel_administrador">
                <div class="panel_contenido">
                    <a href="#" class="text-center fs-2">PSICO-LIFE</a>
                    <a href="verUsuarios.jsp">Ver Usuarios</a>
                    <a href="verPacientes.jsp">Ver Pacientes</a>
                    <a href="verCitas.jsp">Ver Citas</a>
                    <a href="registrarPsicologo.jsp">Registrar Psicologos</a>
                    <a href="verPsicologos.jsp">Ver Psicologos</a>
                    <a href="Usuario?accion=LOGOUT">Cerrar Sesion</a>
                </div>
            </div>

            <div class="paciente_contenido">
                <h1 class="titulo_paciente">Usuarios Registrados</h1>
                <div class="pacientes_flex">
                    <div class="card_paciente card_titulo">
                        <h2>Correo</h2>
                        <h2>Usuario</h2>
                        <h2>Telefono</h2>
                        <h2>Edad</h2>
                    </div>

                    <div class="card_paciente">
                        <h2 class="card_elemento">juan.osorio@gmail.com</h2>
                        <h2 class="card_elemento">JuanO</h2>
                        <h2 class="card_elemento">962475128</h2>
                        <h2 class="card_elemento">30 años</h2>
                    </div>
                    
                    <div class="card_paciente">
                        <h2 class="card_elemento">juan.osorio@gmail.com</h2>
                        <h2 class="card_elemento">JuanO</h2>
                        <h2 class="card_elemento">962475128</h2>
                        <h2 class="card_elemento">30 años</h2>
                    </div>
                    
                    <div class="card_paciente">
                        <h2 class="card_elemento">juan.osorio@gmail.com</h2>
                        <h2 class="card_elemento">JuanO</h2>
                        <h2 class="card_elemento">962475128</h2>
                        <h2 class="card_elemento">30 años</h2>
                    </div>
                    
                    <div class="card_paciente">
                        <h2 class="card_elemento">juan.osorio@gmail.com</h2>
                        <h2 class="card_elemento">JuanO</h2>
                        <h2 class="card_elemento">962475128</h2>
                        <h2 class="card_elemento">30 años</h2>
                    </div>
                    
                    <div class="card_paciente">
                        <h2 class="card_elemento">juan.osorio@gmail.com</h2>
                        <h2 class="card_elemento">JuanO</h2>
                        <h2 class="card_elemento">962475128</h2>
                        <h2 class="card_elemento">30 años</h2>
                    </div>
                    
                </div>

            </div>
        </section>


        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
