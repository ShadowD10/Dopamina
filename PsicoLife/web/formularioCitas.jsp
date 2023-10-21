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
                            <input type="text" placeholder="Ingrese Nombre del Paciente"/> 
                        </div>
                        
                        <div class="input-box">
                            <span class="detalles">Edad del Paciente</span>
                            <input type="text" placeholder="Ingresar Edad"/> 
                        </div>
                        
                        <div class="input-box">
                            <span class="detalles">Parentezco con el Paciente</span>
                            <select required>
                                <option value="" disabled selected>Selecciona el parentezco...</option>
                                <option value="">Padre</option>
                                <option value="">Madre</option>
                                <option value="">Esposa</option>
                                <option value="">Abuelo</option>
                                <option value="">Abuela</option>
                                <option value="">Hermano</option>
                                <option value="">Hermana</option>
                                <option value="">Hijo</option>
                                <option value="">Hija</option>
                                <option value="">Tio</option>
                                <option value="">Tia</option>
                                <option value="">Primo</option>
                                <option value="">Prima</option>
                            </select>
                        </div>

                        <div class="input-box">
                            <span class="detalles">Fecha</span>
                            <input class="fecha" type="datetime-local" required>
                        </div>

                        <div class="input-box">
                            <span class="detalles">Tipo de Terapia</span>
                            <select required>
                                <option value="" disabled selected>Selecciona la Terapia...</option>
                                <option value="">Terapia 1</option>
                                <option value="">Terapia 1</option>
                                <option value="">Terapia 1</option>
                                <option value="">Terapia 1</option>
                            </select>
                        </div>

                        <div class="input-box">
                            <span class="detalles">Psicologo</span>
                            <select required>
                                <option value="" disabled selected>Selecciona el Psicologo...</option>
                                <option value="">Psicologo 1</option>
                                <option value="">Psicologo 1</option>
                                <option value="">Psicologo 1</option>
                                <option value="">Psicologo 1</option>
                                <option value="">Psicologo 1</option>
                            </select>
                        </div>

                        <div class="input-box">
                            <span class="detalles">Descripción</span>
                            <textarea></textarea>
                        </div>
                    </div>

                    <div class="boton">
                        <a href="resumenTerapia.jsp">Registrar Cita</a>
                    </div>

                    <p class="formulario_parrafo_final">Recuerda Iniciar Sesión para empezar a registrar las Citas.</p>
                </form>
            </div>
        </div>

    </section>



    <%@include file="WEB-INF/jspf/footer.jspf" %>

</body>
</html>
