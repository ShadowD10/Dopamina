<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <%@include file="WEB-INF/jspf/validarCuentaAdmin.jspf" %>


        <!-- ADMINISTRADOR VER DOCTORES-->

        <section class="editar_perfil contenedor">
            <%@include file="WEB-INF/jspf/panelAdministrador.jspf" %>

            <div class="paciente_contenido">
                <h1 class="titulo_paciente">Psicologos</h1>
                <div class="pacientes_flex">
                    <div class="card_paciente card_titulo">
                        <h2>Nombre Psicologo</h2>
                        <h2>Especialidad</h2>
                        <h2>Codigo Colegiatura</h2>
                        <h2>Opciones</h2>
                    </div>                    
                    <c:if test="${listaPsicologos!=null}">
                        <c:forEach var="psicologo" items="${listaPsicologos}">
                            <div class="card_paciente card_psicologo">
                                <h2 class="contenido_psicologo">${psicologo.nombre}</h2>
                                <h2 class="contenido_psicologo">${psicologo.especialidad}</h2>
                                <h2 class="contenido_psicologo">${psicologo.numColegiatura}</h2>
                                <div class="btn_pacientes">
                                    <form action="Psicologo" method="POST">
                                        <input type="hidden" name="accion" value="SELEC">
                                        <input type="hidden" name="psicologoId" value="${psicologo.idPsicologo}">
                                        <input class="btn text-light btn_editar" type="submit" value="Editar" />
                                    </form>
                                    <form action="Psicologo" method="POST">
                                        <input type="hidden" name="accion" value="DEL">
                                        <input type="hidden" name="psicologoId" value="${psicologo.idPsicologo}">
                                        <input class="btn text-light btn_eliminar" type="submit" value="Eliminar" onclick="return confirm('¿Desea eliminar?')"/>
                                    </form>
                                </div>
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
