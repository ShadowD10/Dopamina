<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Psico-Life Nosotros</title>
    <%@include file="WEB-INF/jspf/enlaces.jspf" %>
</head>
<body>
    <%@include file="WEB-INF/jspf/nav.jspf" %>
  

    <section class="about py-5">
        <div class="container py-5">
            <div class="row py-5">
                <div class="col-lg-5 py-5 offset-lg-7 col-md-6 col-sm-12 col-12 contenedor_about">
                    <p class="m-0">¿Quienes somos?</p><br>
                    <h1>Psico-Life</h1>
                    <div class="line my-5   "></div>
                    <p>"Somos una clínica comprometida con el bienestar emocional y psicológico. 
                        Nuestra filosofía se basa en la excelencia clínica, la empatía y la confidencialidad. 
                        Ofrecemos un espacio seguro donde explorar tus pensamientos y emociones. Nuestro equipo calificado trabaja 
                        contigo para desarrollar estrategias que fomenten la resiliencia y el crecimiento personal en tu búsqueda de una vida más saludable y significativa."</p>

                    <div class="botones_hero">
                        <a href="formularioCitas.jsp" class="mbtn1 mt-4">Reservar</a>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="welocome text-center pb-5">
        <div class="container py-5">
            <div class="row py-5">
                <div class="col-lg-6 m-auto">
                    <p class="m-0">Clinica Psico-Life</p>
                    <h1>Nuestros principios</h1>
                    <div class="line2 my-4"></div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4">
                    <div class="card py-3">
                        <div class="card-body">
                            <span><i class="bi bi-clipboard2-pulse"></i></span>
                            <h2>Misión</h2>
                            <p>"Promovemos el bienestar emocional a través de terapias basadas en la empatía y la excelencia clínica, ayudando a las personas a vivir vidas más saludables."</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="card py-3">
                        <div class="card-body">
                            <span><i class="bi bi-heart-pulse"></i></span>
                            <h2>Visión</h2>
                            <p>"Aspiramos a ser líderes en el campo de la salud mental, reconocidos por nuestra excelencia clínica y nuestro compromiso con el bienestar de las personas."</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="card py-3">
                        <div class="card-body">
                            <span><i class="bi bi-hospital"></i></span>
                            <h2>Valores</h2>
                            <p>"Priorizamos a nuestros pacientes y buscamos la excelencia, la empatía, la confidencialidad y la colaboración en nuestro enfoque terapéutico."</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <%@include file="WEB-INF/jspf/footer.jspf" %>

</body>
</html>
