<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Editar Perfil</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->


    <body>
        <%@include file="WEB-INF/jspf/navLogueado.jspf" %>


        <!-- EDITAR PERFIL -->

        <section class="editar_perfil contenedor">
            <div class="panel">
                <div class="panel_contenido">
                    <a href="editarPerfil.jsp">Editar Perfil</a>
                    <a href="pacientesUsuario.jsp">Pacientes</a>
                    <a href="historial.jsp">Historial de Citas</a>
                    <a href="index.jsp">Cerrar Sesion</a>
                </div>
            </div>

            <div class="editar_perfil_contenido">
                <h1 class="titulo_editar">Edite su Informacion</h1>
                <form method="POST">
                    <div class="editar_informacion">

                        <div class="inputs">
                            <label>Cambiar Usuario:</label>
                            <input type="text" placeholder="Cambiar Usuario" />
                        </div>

                        <div class="inputs">
                            <label>Cambiar Correo:</label>
                            <input type="email" placeholder="Cambiar Correo" />
                        </div>

                        <div class="inputs">
                            <label>Cambiar Telefono:</label>
                            <input type="number" placeholder="Cambiar Telefono" />
                        </div>

                        <div class="inputs">
                            <label>Cambiar Edad:</label>
                            <input type="number" placeholder="Cambiar Edad" />
                        </div>

                        <div class="inputs">
                            <label>Cambiar Contraseña:</label>
                            <input type="password" placeholder="Cambiar Contraseña" />
                        </div>

                        <input class="boton_gestor_usuario" type="submit" value="Actualizar">
                    </div>   
                </form>

            </div>
        </section>



        <%@include file="WEB-INF/jspf/footer.jspf" %>

    </body>
</html>
