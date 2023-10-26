<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            
            <%@include file="WEB-INF/jspf/panelAdministrador.jspf" %>

            <div class="paciente_contenido">
                <h1 class="titulo_paciente">Usuarios Registrados</h1>
                <div class="pacientes_flex">
                    <div class="card_paciente card_titulo">
                        <h2>Correo</h2>
                        <h2>Nombre</h2>
                        <h2>Celular</h2>
                        <h2>Edad</h2>
                    </div>                   
                </div>
                <br/>
                <c:if test="${listaUsuarios!=null}">
                    <c:forEach var="usuario" items="${listaUsuarios}">
                        <div class="pacientes_flex">
                            <div class="card_paciente card_titulo">
                                <h2>${usuario.correo}</h2>
                                <h2>${usuario.username}</h2>
                                <h2>${usuario.numCelular}</h2>
                                <h2>${usuario.edad}</h2>
                            </div>                   
                        </div>
                        <br/>
                    </c:forEach>
                </c:if>
                <c:if test="${mensaje!=null}">
                    <p class="text-center">${mensaje}</p>
                </c:if>

            </div>
        </section>


        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
