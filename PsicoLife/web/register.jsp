<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Register</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
    <link rel="stylesheet" href="styleLogin.css"/>
</head>
<body>
    <%@include file="WEB-INF/jspf/nav.jspf" %>


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
                        <header>Registrar</header>
                        <div class="input-field">
                            <input
                                type="text"
                                class="input"
                                id="correo"
                                required=""
                                autocomplete="off"
                                />
                            <label for="correo">Correo</label>
                        </div>
                        <div class="input-field">
                            <input type="text" class="input" id="usuario" required="" />
                            <label for="usuario">Usuario</label>
                        </div>
                        <div class="input-field">
                            <input type="number" class="input" id="usuario" required="" />
                            <label for="usuario">Telefono</label>
                        </div>
                        <div class="input-field">
                            <input type="number" class="input" id="usuario" required="" />
                            <label for="usuario">Edad</label>
                        </div>
                        
                        <div class="input-field">
                            <input type="password" class="input" id="pass" required="" />
                            <label for="pass">Contraseña</label>
                        </div>
                        <div class="input-field">
                            <input type="submit" class="submit" value="Ingresar" />
                        </div>
                        <div class="signin">
                            <span
                                >¿Ya tienes una cuenta? <a href="login.jsp">Ingresa aquí</a></span
                            >
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
