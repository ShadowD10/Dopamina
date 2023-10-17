<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Registrar Paciente</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <link rel="stylesheet" href="styleLogin.css"/>
</head>
<body>
    <%@include file="WEB-INF/jspf/navLogueado.jspf" %>


    <div class="wrapper">
        <div class="container main">
            <div class="row">
                <div class="col-md-6 side-image">
                    <div class="text">
                        <p>Cada historia tiene un camino hacia la felicidad <i>- Psico-Life</i></p>
                    </div>
                </div>

                <div class="col-md-6 right">
                    <div class="input-box">
                        <header>Registrar Paciente</header>
                        <div class="input-field">
                            <input
                                type="text"
                                class="input"
                                id="usuario"
                                required=""
                                autocomplete="off"
                                />
                            <label for="usuario">Nombre</label>
                        </div>
                        <div class="input-field">
                            <input
                                type="text"
                                class="input"
                                id="usuario"
                                required=""
                                autocomplete="off"
                                />
                            <label for="usuario">Parentesco</label>
                        </div>
                        <div class="input-field">
                            <input
                                type="number"
                                class="input"
                                id="usuario"
                                required=""
                                autocomplete="off"
                                />
                            <label for="usuario">Edad</label>
                        </div>
                        <div class="input-field">
                            <input type="submit" class="submit" value="Registrar Paciente" />
                        </div>
                        <div class="signin">
                            <span
                                >¿Ya tiens pacientes registrados? <a href="formularioCitas.jsp">Ingresa aquí</a></span
                            >
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
