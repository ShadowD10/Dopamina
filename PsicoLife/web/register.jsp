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
                        <form action="Usuario" method="POST">
                            <input type="hidden" value="SINGIN" name="accion"/>
                            <div class="input-field">
                                <input
                                    type="text"
                                    class="input"
                                    id="correo"
                                    required=""
                                    autocomplete="off"
                                    name="correo"
                                    />
                                <label for="correo">Correo</label>
                            </div>
                            <div class="input-field">
                                <input type="text" class="input" id="usuario" required="" name="username"/>
                                <label for="usuario">Usuario</label>
                            </div>
                            <div class="input-field">
                                <input type="number" class="input" id="numeroCelular" required="" name="numeroCelular"/>
                                <label for="usuario">Telefono</label>
                            </div>
                            <div class="input-field">
                                <input type="number" class="input" id="edad" required="" name="edad"/>
                                <label for="usuario">Edad</label>
                            </div>

                            <div class="input-field">
                                <input type="password" class="input" id="contraseña" required="" name="contraseña"/>
                                <label for="pass">Contraseña</label>
                            </div>
                            <div class="input-field">
                                <input type="submit" class="submit" value="Ingresar" />
                           
                            </div>
                        </form>
                        <div class="signin">
                            <span
                                >¿Ya tienes una cuenta? <a href="login.jsp">Ingresa aquí</a></span
                            >                            
                        <c:if test="${mensaje != null}">
                            <p class="text-center">
                                ${mensaje}
                            </p>
                        </c:if>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </div>

</body>
</html>
