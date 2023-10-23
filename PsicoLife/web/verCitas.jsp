<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Ver Citas</title>
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


        <!-- ADMINISTRADOR VER CITAS-->
        <!-- Prueba de commit-->



        <section class="editar_perfil contenedor">
            <%@include file="WEB-INF/jspf/panelAdministrador.jspf" %>

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
                            <td>Max</td>
                            <td>2023-10-15</td>
                            <td>Corte de Pelo</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max</td>
                            <td>2023-10-15</td>
                            <td>Corte de Pelo</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max</td>
                            <td>2023-10-15</td>
                            <td>Corte de Pelo</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max</td>
                            <td>2023-10-15</td>
                            <td>Corte de Pelo</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max</td>
                            <td>2023-10-15</td>
                            <td>Corte de Pelo</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max</td>
                            <td>2023-10-15</td>
                            <td>Corte de Pelo</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max</td>
                            <td>2023-10-15</td>
                            <td>Corte de Pelo</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max</td>
                            <td>2023-10-15</td>
                            <td>Corte de Pelo</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max</td>
                            <td>2023-10-15</td>
                            <td>Corte de Pelo</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max</td>
                            <td>2023-10-15</td>
                            <td>Corte de Pelo</td>
                            <td>Dr. Juan Pablo</td>
                            <td>50.00</td>
                        </tr>
                        <tr>
                            <td>Max</td>
                            <td>2023-10-15</td>
                            <td>Corte de Pelo</td>
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
