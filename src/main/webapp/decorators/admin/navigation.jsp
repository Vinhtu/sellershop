<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <aside class="menu-sidebar d-none d-lg-block">
            <div class="logo">
                <a href="#">
                    <img src="images/icon/logo.png" alt="Cool Admin" />
                </a>
            </div>
            <div class="menu-sidebar__content js-scrollbar1">
                <nav class="navbar-sidebar">
                    <ul class="list-unstyled navbar__list">
                        <li class="active has-sub">
                            <a class="js-arrow" href="/SellerShopMVCDA/admin/dashboard">
                                <i class="fas fa-tachometer-alt"></i>Dashboard</a>
                            
                        </li>
                        <li>
                            <a href="/SellerShopMVCDA/admin/product">
                                <i class="fas fa-chart-bar"></i>Product</a>
                        </li>
                        <li>
                            <a href="/SellerShopMVCDA/admin/order">
                                <i class="fas fa-table"></i>Order</a>
                        </li>
                        <li>
                            <a href="/SellerShopMVCDA/admin/account">
                                <i class="far fa-check-square"></i>Account</a>
                        </li>
                        <li>
                            <a href="/SellerShopMVCDA/admin/customer">
                                <i class="fas fa-calendar-alt"></i>Customer</a>
                        </li>
                        <li>
                            <a href="/SellerShopMVCDA/admin/promotion">
                                <i class="fas fa-map-marker-alt"></i>Promotion</a>
                        </li>
                          <li>
                            <a href="/SellerShopMVCDA/ad/login">
                                <i class="fas fa-map-marker-alt"></i>Login</a>
                        </li>
                              <li>
                            <a href="/SellerShopMVCDA/ad/register">
                                <i class="fas fa-map-marker-alt"></i>Register</a>
                        </li>
                         <li>
                            <a href="/SellerShopMVCDA/ad/forget-password">
                                <i class="fas fa-map-marker-alt"></i>Forget Password</a>
                        </li>
                        
                        
                    </ul>
                </nav>
            </div>
        </aside>
</body>
</html>