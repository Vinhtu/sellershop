<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<title><decorator:title default="Trang Chủ" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<c:url value="/assets/user/css/style.css" />" rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value="/assets/user/css/form.css" />" rel="stylesheet" type="text/css" media="all" />
<link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="<c:url value="/assets/user/js/jquery1.min.js" />"></script>
<!-- start menu -->
<link href="<c:url value="/assets/user/css/megamenu.css" />" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="<c:url value="/assets/user/js/megamenu.js" />"></script>
<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>
<!--start slider -->
    <link rel="stylesheet" href="<c:url value="/assets/user/css/fwslider.css" />" media="all">
    <script src="<c:url value="/assets/user/js/jquery-ui.min.js" />"></script>
    <script src="<c:url value="/assets/user/js/css3-mediaqueries.js" />"></script>
    <script src="<c:url value="/assets/user/js/fwslider.js" />"></script>
      <script src="<c:url value="/assets/user/js/pagination.js" />"></script>
<!--end slider -->
<script src="<c:url value="/assets/user/js/jquery.easydropdown.js" />"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
     
     <%@include file="./user/header.jsp" %>
        <decorator:body />
      <%@include file="./user/footer.jsp" %>
   
</body>
</html>