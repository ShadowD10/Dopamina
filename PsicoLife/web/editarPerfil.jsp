<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Editar Perfil</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->


    <body>
        <%@include file="WEB-INF/jspf/nav.jspf" %>
        <%@include file="WEB-INF/jspf/validarCuentaUsuario.jspf" %>
        <!-- EDITAR PERFIL -->

        <section class="editar_perfil contenedor">
            <%@include file="WEB-INF/jspf/panelUsuario.jspf" %>

            <div class="editar_perfil_contenido">
                <h1 class="titulo_editar">Edite su Informacion</h1>
                <form action="Usuario" method="POST">
                    <input type="hidden" name="accion" value="UPD">
                    <input type="hidden" name="userID" value="${user.idUsuario}">
                    <div class="editar_informacion">
                        <div class="inputs">
                            <label>Cambiar Usuario:</label>
                            <input type="text" name="username" placeholder="${user.username}"  required="" value="${user.username}"/>
                        </div>
                        <div class="inputs">
                            <label>Cambiar Correo:</label>
                            <input type="email" name="correo" placeholder="${user.correo}" required="" value="${user.correo}"/>
                        </div>
                        <div class="inputs">
                            <label>Cambiar Telefono:</label>
                            <input type="number" name="numeroCelular" placeholder="${user.numCelular}" required="" value="${user.numCelular}"/>
                        </div>
                        <div class="inputs">
                            <label>Cambiar Edad:</label>
                            <input type="number" name="edad" placeholder="${user.edad}" required="" value="${user.edad}"/>
                        </div>
                        <input class="boton_gestor_usuario" type="submit" value="Actualizar">
                        <c:if test="${mensaje!=null}">
                            <p class="text-center">${mensaje}</p>
                        </c:if>
                    </div>   
                </form>
            </div>
        </section>



        <%@include file="WEB-INF/jspf/footer.jspf" %>

    </body>
</html>
