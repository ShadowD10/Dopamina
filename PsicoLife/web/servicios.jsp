<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Servicios</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
</head>
<body>
    <%@include file="WEB-INF/jspf/nav.jspf" %>


    <section class="store py-5 text-center">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 m-auto">
                    <p class="m-0">Clinica Psico-Life</p>
                    <h1>Nuestros Servicios</h1>
                    <div class="line my-4"></div>
                    <p>Ofrecemos un espacio seguro y confidencial donde las personas pueden explorar sus pensamientos, emociones y desafíos personales. Nuestro equipo de terapeutas altamente calificados trabaja en estrecha colaboración con cada paciente para desarrollar estrategias efectivas que promuevan la resiliencia y el crecimiento personal. </p>
                    <div class="botones_hero">
                        <a href="Terapia?accion=REGCITA" class="mbtn1 mt-4">Reservar Cita</a>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-3 mt-2">
                    <div class="card py-3">
                        <div class="card-body">
                            <span><i class="bi bi-patch-check"></i></span>
                            <h5 class="head1 py-3">Evaluación Psicológica</h5>
                            <p class="per1">Tiene el propósito de diagnosticar, comprender y planificar el tratamiento de problemas de salud mental.</p>
                            <p>S/80.00</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 mt-2">
                    <div class="card py-3">
                        <div class="card-body">
                            <span><i class="bi bi-patch-check"></i></span>
                            <h5 class="head1 py-3">Terapia Individual</h5>
                            <p class="per1">Tiene el propósito de resolver problemas emocionales, mejorar la salud mental y promover el crecimiento personal.</p>
                            <p>S/100.00</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 mt-2">
                    <div class="card py-3">
                        <div class="card-body">
                            <span><i class="bi bi-patch-check"></i></span>
                            <h5 class="head1 py-3">Terapia de Parejas</h5>
                            <p class="per1">Diseñado para ayudar a las parejas a abordar conflictos, mejorar la comunicación y fortalecer su relación.</p>
                            <p>S/200.00</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 mt-2">
                    <div class="card py-3">
                        <div class="card-body">
                            <span><i class="bi bi-patch-check"></i></span>
                            <h5 class="head1 py-3">Terapia para Niños y Adolescentes</h5>
                            <p class="per1">Especializado para ayudar a jóvenes a abordar desafíos emocionales y de desarrollo.</p>
                            <p>S/150.00</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <%@include file="WEB-INF/jspf/footer.jspf" %>

</body>
</html>
