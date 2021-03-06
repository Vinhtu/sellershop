<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
       
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">
    <title>Dashboard</title>
    <link href="<c:url value="/assets/admin/css/font-face.css" />" rel="stylesheet" media="all">
    <link href="<c:url value="/assets/admin/vendor/font-awesome-4.7/css/font-awesome.min.css" />" rel="stylesheet" media="all">
    <link href="<c:url value="/assets/admin/vendor/font-awesome-5/css/fontawesome-all.min.css" />" rel="stylesheet" media="all">
    <link href="<c:url value="/assets/admin/vendor/vendor/mdi-font/css/material-design-iconic-font.min.css" />" rel="stylesheet" media="all">
    <link href="<c:url value="/assets/admin/vendor/bootstrap-4.1/bootstrap.min.css" />" rel="stylesheet" media="all">
    <link href="<c:url value="/assets/admin/vendor/animsition/animsition.min.css" />" rel="stylesheet" media="all">
    <link href="<c:url value="/assets/admin/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" />" rel="stylesheet" media="all">
    <link href="<c:url value="/assets/admin/vendor/wow/animate.css" />" rel="stylesheet" media="all">
    <link href="<c:url value="/assets/admin/vendor/css-hamburgers/hamburgers.min.css" />" rel="stylesheet" media="all">
    <link href="<c:url value="/assets/admin/vendor/slick/slick.css" />" rel="stylesheet" media="all">
    <link href="<c:url value="/assets/admin/vendor/select2/select2.min.css" />" rel="stylesheet" media="all">
    <link href="<c:url value="/assets/admin/vendor/perfect-scrollbar/perfect-scrollbar.css" />" rel="stylesheet" media="all">
    <link href="<c:url value="/assets/admin/css/theme.css" />" rel="stylesheet" media="all">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0"></script>

</head>

<body >
    <div class="page-wrapper">
        <!-- HEADER MOBILE-->
        <header class="header-mobile d-block d-lg-none">
            <div class="header-mobile__bar">
                <div class="container-fluid">
                    <div class="header-mobile-inner">
                        <a class="logo" href="index.html">
                            <img src="images/icon/logo.png" alt="CoolAdmin" />
                        </a>
                        <button class="hamburger hamburger--slider" type="button">
                            <span class="hamburger-box">
                                <span class="hamburger-inner"></span>
                            </span>
                        </button>
                    </div>
                </div>
            </div>
            <nav class="navbar-mobile">
                <div class="container-fluid">
                    <ul class="navbar-mobile__list list-unstyled">
                        <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fas fa-tachometer-alt"></i>Dashboard</a>
                          
                        </li>
                        <li>
                            <a href="chart.html">
                                <i class="fas fa-chart-bar"></i>Product</a>
                        </li>
                        <li>
                            <a href="table.html">
                                <i class="fas fa-table"></i>Order</a>
                        </li>
                        <li>
                            <a href="form.html">
                                <i class="far fa-check-square"></i>Account</a>
                        </li>
                        <li>
                            <a href="calendar.html">
                                <i class="fas fa-calendar-alt"></i>Calendar</a>
                        </li>
                        <li>
                            <a href="map.html">
                                <i class="fas fa-map-marker-alt"></i>Maps</a>
                        </li>
                        <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fas fa-copy"></i>Pages</a>
                            <ul class="navbar-mobile-sub__list list-unstyled js-sub-list">
                                <li>
                                    <a href="login.html">Login</a>
                                </li>
                                <li>
                                    <a href="register.html">Register</a>
                                </li>
                                <li>
                                    <a href="forget-pass.html">Forget Password</a>
                                </li>
                            </ul>
                        </li>
                        <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fas fa-desktop"></i>UI Elements</a>
                            <ul class="navbar-mobile-sub__list list-unstyled js-sub-list">
                                <li>
                                    <a href="button.html">Button</a>
                                </li>
                                <li>
                                    <a href="badge.html">Badges</a>
                                </li>
                                <li>
                                    <a href="tab.html">Tabs</a>
                                </li>
                                <li>
                                    <a href="card.html">Cards</a>
                                </li>
                                <li>
                                    <a href="alert.html">Alerts</a>
                                </li>
                                <li>
                                    <a href="progress-bar.html">Progress Bars</a>
                                </li>
                                <li>
                                    <a href="modal.html">Modals</a>
                                </li>
                                <li>
                                    <a href="switch.html">Switchs</a>
                                </li>
                                <li>
                                    <a href="grid.html">Grids</a>
                                </li>
                                <li>
                                    <a href="fontawesome.html">Fontawesome Icon</a>
                                </li>
                                <li>
                                    <a href="typo.html">Typography</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
        <!-- END HEADER MOBILE-->

        <!-- MENU SIDEBAR-->
          <%@include file="./admin/navigation.jsp" %>
        <!-- END MENU SIDEBAR-->

        <!-- PAGE CONTAINER-->
        <div class="page-container">
            <!-- HEADER DESKTOP-->
              <%@include file="./admin/header.jsp" %>
            <!-- HEADER DESKTOP-->
            <!-- MAIN CONTENT-->
              <decorator:body />
            <!-- END MAIN CONTENT-->
            <!-- END PAGE CONTAINER-->
        </div>

    </div>

    <!-- Jquery JS-->
    <script src="vendor/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap JS-->
    <script src="<c:url value="/assets/admin/vendor/bootstrap-4.1/popper.min.js" />"></script>
    <script src="<c:url value="/assets/admin/vendor/bootstrap-4.1/bootstrap.min.js" />"></script>
    <!-- Vendor JS       -->
    <script src="<c:url value="/assets/admin/vendor/slick/slick.min.js" />">
    </script>
    <script src="<c:url value="/assets/admin/vendor/wow/wow.min.js" />"></script>
    <script src="<c:url value="/assets/admin/vendor/animsition/animsition.min.js" />"></script>
    <script src="<c:url value="/assets/admin/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js" />">
    </script>
    <script src="<c:url value="/assets/admin/vendor/counter-up/jquery.waypoints.min.js" />"></script>
    <script src="<c:url value="/assets/admin/vendor/counter-up/jquery.counterup.min.js" />">
    </script>
    <script src="<c:url value="/assets/admin/vendor/circle-progress/circle-progress.min.js" />"></script>
    <script src="<c:url value="/assets/admin/vendor/perfect-scrollbar/perfect-scrollbar.js" />"></script>
    <script src="<c:url value="/assets/admin/vendor/chartjs/Chart.bundle.min.js" />"></script>
    <script src="<c:url value="/assets/admin/vendor/select2/select2.min.js" />">
    
    </script>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

    <!-- Main JS-->
    <script src="js/main.js"></script>

</body>

</html>
<!-- end document-->



