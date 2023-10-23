<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Editar Perfil</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <!-- <link rel="stylesheet" href="styleAvance2.css"/> -->


    <body>
        <%@include file="WEB-INF/jspf/navLogueado.jspf" %>


        <!-- EHISTORIAL -->

        <section class="editar_perfil contenedor">
            <div class="panel">
                <div class="panel_contenido">
                    <div class="panel_contenido">
                        <a href="editarPerfil.jsp">Editar Perfil</a>
                        <a href="pacientesUsuario.jsp">Pacientes</a>
                        <a href="historial.jsp">Historial de Citas</a>
                        <a href="index.jsp">Cerrar Sesion</a>
                    </div>
                </div>
            </div>

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
                        <tr>
                            <td>Max Perez</td>
                            <td>2023-10-15</td>
                            <td>Terapia Individual</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max Perez</td>
                            <td>2023-10-15</td>
                            <td>Terapia Individual</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max Perez</td>
                            <td>2023-10-15</td>
                            <td>Terapia Individual</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max Perez</td>
                            <td>2023-10-15</td>
                            <td>Terapia Individual</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max Perez</td>
                            <td>2023-10-15</td>
                            <td>Terapia Individual</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max Perez</td>
                            <td>2023-10-15</td>
                            <td>Terapia Individual</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max Perez</td>
                            <td>2023-10-15</td>
                            <td>Terapia Individual</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max Perez</td>
                            <td>2023-10-15</td>
                            <td>Terapia Individual</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max Perez</td>
                            <td>2023-10-15</td>
                            <td>Terapia Individual</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        
                    </table>
                </div>   
            </div>
        </section>



        <%@include file="WEB-INF/jspf/footer.jspf" %>

    </body>
</html>
