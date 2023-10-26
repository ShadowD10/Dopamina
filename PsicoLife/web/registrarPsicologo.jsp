<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <%@include file="WEB-INF/jspf/validarCuentaAdmin.jspf" %>



        <!-- REGISTRAR PSICOLOGO -->

        <section class="editar_perfil contenedor">
            <%@include file="WEB-INF/jspf/panelAdministrador.jspf" %>

            <div class="editar_perfil_contenido editar_paciente">
                <h1 class="titulo_editar">Registrar Psicologo</h1>
                <form action="Psicologo" method="POST">
                    <input type="hidden" name="accion" value="ADD">
                    <div class="editar_informacion">
                        <div class="inputs">
                            <label>Nombres y Apellidos:</label>
                            <input type="text" name="name" placeholder="Ingresar Nombres" required=""/>
                        </div>

                        <div class="inputs">
                            <label>Especialidad:</label>
                            <input type="text" name="especialidad" placeholder="Ingresar Especialidad" required=""/>
                        </div>

                        <div class="inputs">
                            <label>Cod. Colegiatura:</label>
                            <input type="number" name="codColegiatura" placeholder="Ingresar Codigo" required=""/>
                        </div>
                        <input class="boton_gestor_usuario" type="submit" value="Registrar"/>
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
