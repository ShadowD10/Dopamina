<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Formulario</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->
    

<body>
    <%@include file="WEB-INF/jspf/nav.jspf" %>
    <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

        if(session.getAttribute("user")==null){
            response.sendRedirect("login.jsp");
        }        
    %>

    <!-- FORMULARIO -->
    <section class="citas_contenedor">
        <div class="form_contenedor">
            <div class="titulo">Reservar Cita</div>
            <div class="contenido">
                <form action="#" method="POST">
                    <div class="usuario-detalles">
                        <div class="input-box">
                            <span class="detalles">Nombre del Paciente</span>
                            <input type="text" name="nombrePaciente" required="" placeholder="Ingrese Nombre del Paciente"/> 
                        </div>
                        
                        <div class="input-box">
                            <span class="detalles">Edad del Paciente</span>
                            <input type="number" name="edadPaciente" required="" placeholder="Ingresar Edad"/> 
                        </div>
                        
                        <div class="input-box">
                            <span class="detalles">Parentezco con el Paciente</span>
                            <select name="parentescoPaciente" required>
                                <option value="" disabled selected>Selecciona el parentezco...</option>
                                <option value="Yo">Yo</option>
                                <option value="Padre">Padre</option>
                                <option value="Madre">Madre</option>
                                <option value="Pareja">Pareja</option>
                                <option value="Abuelo">Abuelo</option>
                                <option value="Abuela">Abuela</option>
                                <option value="Hermano">Hermano</option>
                                <option value="Hermana">Hermana</option>
                                <option value="Hijo">Hijo</option>
                                <option value="Hija">Hija</option>
                                <option value="Tio">Tio</option>
                                <option value="Tia">Tia</option>
                                <option value="Primo">Primo</option>
                                <option value="Prima">Prima</option>
                            </select>
                        </div>

                        <div class="input-box">
                            <span class="detalles">Fecha</span>
                            <input class="fecha" name="fecha" type="datetime-local" required>
                        </div>

                        <div class="input-box">
                            <span class="detalles">Tipo de Terapia</span>
                            <select name="terapia" required>
                                <option value="" disabled selected>Selecciona la Terapia...</option>
                                <c:forEach var="terapia" items="${listaTerapias}">
                                    <option value="${terapia}">${terapia.nombre}</option>
                                </c:forEach>
                            </select>
                        </div>                     
                                          
                    </div>
                    <div class="boton">
                        <input class="btn text-light btn_editar" type="submit" value="Reservar" />
                    </div>                     

                    <!-- <div class="boton">
                        <a href="resumenTerapia.jsp">Registrar Cita</a>
                    </div> -->
                    <c:if test="${mensaje!=null}">
                    <p class="formulario_parrafo_final">${mensaje}</p>
                    </c:if>
                </form>
            </div>
        </div>

    </section>


    <%@include file="WEB-INF/jspf/footer.jspf" %>

</body>
</html>
