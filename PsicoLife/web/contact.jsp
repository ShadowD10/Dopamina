<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Contacto</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
</head>
<body>
    <%@include file="WEB-INF/jspf/nav.jspf" %>


    <section class="contact py-5">
        <div class="container py-3">
            <div class="row d-flex align-items-center justify-content-center">
                <div class="col-lg-7">
                    <p class="m-0">Psico-Life</p>
                    <h1>Contactanos</h1>
                    <div class="line2 my-4"></div>
                    <p>Envianos un correo con cualquier consulta que desees aclarar. Saludos.</p>
                    <div class="row py-3">
                        <div class="col-lg-6">
                            <div class="row pt-2">
                                <div class="col-lg-2 col-sm-3 col-2">
                                    <div class="circle">
                                        <span><i class="bi bi-house-fill"></i></span>
                                    </div>
                                </div>
                                <div class="col-lg-8 col-sm-8 col-8 pt-2">
                                    <p>Av. El Sol 235, San Juan de Lurigancho 15096</p>
                                </div>
                            </div>
                            <div class="row pt-2">
                                <div class="col-lg-2 col-sm-3 col-2">
                                    <div class="circle">
                                        <span><i class="bi bi-telephone-fill"></i></span>
                                    </div>
                                </div>
                                <div class="col-lg-8 col-sm-8 col-8 pt-2">
                                    <p>+51 952 826 999</p>
                                </div>
                            </div>
                            <div class="row pt-2">
                                <div class="col-lg-2 col-sm-3 col-2">
                                    <div class="circle">
                                        <span><i class="bi bi-envelope"></i></span>
                                    </div>
                                </div>
                                <div class="col-lg-8 col-sm-8 col-8 pt-2">
                                    <p>psico.life@mail.com</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <form method="POST">
                                <input type="text" placeholder="Nombre...">
                                <input type="text" placeholder="Correo...">
                                <input type="text" placeholder="Telefono...">
                                <textarea placeholder="Mensaje..."></textarea>
                                <button class="cbtn mt-3">Enviar</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <%@include file="WEB-INF/jspf/footer.jspf" %>

</body>
</html>
