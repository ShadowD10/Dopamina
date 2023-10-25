<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Pacientes Usuario</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->
    

<body>
        <%@include file="WEB-INF/jspf/nav.jspf" %>
        <%@include file="WEB-INF/jspf/validarCuentaUsuario.jspf" %>


    <!-- PACIENTES REGISTRADOS -->

    <section class="editar_perfil contenedor">
        <%@include file="WEB-INF/jspf/panelUsuario.jspf" %>

        <div class="paciente_contenido">
            <h1 class="titulo_paciente">Pacientes Registrados</h1>
            <div class="pacientes_flex">
                <div class="card_paciente card_titulo">
                    <h2>Nombre Paciente</h2>
                    <h2>Edad</h2>
                    <h2>Parentezco</h2>
                </div>
                
                <c:if test="${listaPacientes != null}">
                        <c:forEach var="paciente" items="${listaPacientes}">
                            <div class="card_paciente">
                                <h2 class="card_elemento">${paciente.nombre}</h2>
                                <h2 class="card_elemento">${paciente.edad}</h2>
                                <h2 class="card_elemento">${paciente.parentesco}</h2>
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
