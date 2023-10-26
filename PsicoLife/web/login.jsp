<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Login</title>
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
                    <form action="Usuario" method="POST">
                        <input type="hidden" name="accion" value="LOGIN">
                        <div class="input-box">
                            <header>Iniciar Sesion</header>
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
                                <input type="password" class="input" id="pass" name="contraseña" required="" />
                                <label for="pass">Contraseña</label>
                            </div>
                            <div class="input-field">
                                <input type="submit" class="submit" value="Ingresar" />
                            </div>
                            <c:if test="${mensaje!=null}">
                                <p class="text-center">${mensaje}</p>
                            </c:if>
                            <div class="signin">
                                <span
                                    >¿No tienes una cuenta? <a href="register.jsp">Ingresa aquí</a></span
                                >
                            </div>
                        </div>  
                    </form>

                </div>
            </div>
        </div>
    </div>

</body>
</html>
