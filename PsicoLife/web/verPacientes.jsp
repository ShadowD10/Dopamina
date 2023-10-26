<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <%@include file="WEB-INF/jspf/validarCuentaAdmin.jspf" %>


        <!-- ADMINISTRADOR VER PACIENTES-->

        <!-- PACIENTES REGISTRADOS -->

        <section class="editar_perfil contenedor">
            <%@include file="WEB-INF/jspf/panelAdministrador.jspf" %>

            <div class="paciente_contenido">
                <h1 class="titulo_paciente">Pacientes Registrados</h1>
                <div class="pacientes_flex">
                    <div class="card_paciente card_titulo">
                        <h2>Nombre Paciente</h2>
                        <h2>Edad</h2>
                        <h2>Parentezco</h2>
                        <h2>Paciente a Cargo</h2>
                    </div>     
 
                    <c:if test="${listaPacientes != null}">
                        <c:forEach var="paciente" items="${listaPacientes}">
                            <div class="card_paciente">
                                <h2 class="card_elemento">${paciente.nombre}</h2>
                                <h2 class="card_elemento">${paciente.edad}</h2>
                                <h2 class="card_elemento">${paciente.parentesco}</h2>
                                <h2 class="card_elemento">${paciente.usuario.username}</h2>
                            </div>
                        </c:forEach>
                    </c:if>
                    <c:if test="${mensaje!=null}">
                        <p class="text-center">${mensaje}</p>
                    </c:if> 
                </div>
            </div>
        </section>


        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
