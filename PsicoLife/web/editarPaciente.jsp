<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Editar Pacientes</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
        <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->
    

<body>
    <%@include file="WEB-INF/jspf/navLogueado.jspf" %>


    <!-- EDITAR PACIENTE -->
    
    <section class="editar_perfil contenedor">
        <div class="panel">
            <div class="panel_contenido">
                <a href="editarPerfil.jsp">Editar Perfil</a>
                <a href="pacientesUsuario.jsp">Pacientes</a>
                <a href="historial.jsp">Historial de Citas</a>
                <a href="index.jsp">Cerrar Sesion</a>
            </div>
        </div>

        <div class="editar_perfil_contenido editar_paciente">
            <h1 class="titulo_editar">Edite su Paciente Registrado</h1>
            <div class="editar_informacion">
                <div class="inputs">
                    <label>Nombre:</label>
                    <input type="text" placeholder="Cambiar Nombre" />
                </div>
                
                <div class="inputs">
                    <label>Parentezco:</label>
                    <input type="text" placeholder="Cambiar Parentezco" />
                </div>
                
                <div class="inputs">
                    <label>Edad:</label>
                    <input type="number" placeholder="Cambiar Edad" />
                </div>

                <input class="boton_gestor_usuario" type="submit" value="Actualizar">
            </div>   
        </div>
    </section>



    <%@include file="WEB-INF/jspf/footer.jspf" %>

</body>
</html>
