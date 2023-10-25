<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Editar Perfil</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->


    <body>
        <%@include file="WEB-INF/jspf/nav.jspf" %>
        <%@include file="WEB-INF/jspf/validarCuentaUsuario.jspf" %>


        <!-- EHISTORIAL -->

        <section class="editar_perfil contenedor">
            <%@include file="WEB-INF/jspf/panelUsuario.jspf" %>

            <div class="editar_perfil_contenido historial_citas">
                <h1 class="titulo_historial">Historial de Citas</h1>
                <div class="historial_tabla">
                    <table>
                        <tr>
                            <th>Nombre de Paciente</th>
                            <th>Fecha de Cita</th>
                            <th>Tipo de Terapia</th>
                            <th>Psicologo</th>
                            <th>Total</th>
                        </tr>
                        <c:if test="${listaCitas != null}">
                            <c:forEach var="cita" items="${listaCitas}">
                                <tr>
                                    <td>${cita.nombrePaciente}</td>
                                    <td>${cita.fechaHora}</td>
                                    <td>${cita.nombreTipoCita}</td>
                                    <td>${cita.nombrePsicologo}</td>
                                    <td>${cita.precio}</td>
                                </tr>
                            </c:forEach>
                        </c:if>
                        <c:if test="${mensaje != null}">
                            <p class="text-center">${mensaje}</p>
                        </c:if>
                    </table>
                </div>   
            </div>
        </section>



        <%@include file="WEB-INF/jspf/footer.jspf" %>

    </body>
</html>
