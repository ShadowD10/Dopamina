<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Pacientes Usuario</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->
    

<body>
    <%@include file="WEB-INF/jspf/navLogueado.jspf" %>


    <!-- PACIENTES REGISTRADOS -->

    <section class="editar_perfil contenedor">
        <div class="panel">
            <div class="panel_contenido">
                <a href="editarPerfil.jsp">Editar Perfil</a>
                <a href="pacientesUsuario.jsp">Pacientes</a>
                <a href="historial.jsp">Historial de Citas</a>
                <a href="index.jsp">Cerrar Sesion</a>
            </div>
        </div>

        <div class="paciente_contenido">
            <h1 class="titulo_paciente">Pacientes Registrados</h1>
            <div class="pacientes_flex">
                <div class="card_paciente">
                    <h2>Paciente 1</h2>
                    <div class="btn_pacientes">
                        <a class="btn_editar" href="editarPaciente.jsp">Editar</a>
                        <a class="btn_eliminar" href="#">Eliminar</a>
                    </div>
                </div>

                <div class="card_paciente">
                    <h2>Paciente 1</h2>
                    <div class="btn_pacientes">
                        <a class="btn_editar" href="editarPaciente.jsp">Editar</a>
                        <a class="btn_eliminar" href="#">Eliminar</a>
                    </div>
                </div>
                
                <div class="card_paciente">
                    <h2>Paciente 1</h2>
                    <div class="btn_pacientes">
                        <a class="btn_editar" href="editarPaciente.jsp">Editar</a>
                        <a class="btn_eliminar" href="#">Eliminar</a>
                    </div>
                </div>
                
                <div class="card_paciente">
                    <h2>Paciente 1</h2>
                    <div class="btn_pacientes">
                        <a class="btn_editar" href="editarPaciente.jsp">Editar</a>
                        <a class="btn_eliminar" href="#">Eliminar</a>
                    </div>
                </div>


            </div>

        </div>
    </section>



    <%@include file="WEB-INF/jspf/footer.jspf" %>

</body>
</html>
