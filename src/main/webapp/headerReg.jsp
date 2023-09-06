<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

<head>
    <title>Jogging calendar</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="resources/css/style.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="resources/css/coin-slider.css" />
    <script type="text/javascript" src="resources/js/cufon-yui.js"></script>
    <script type="text/javascript" src="resources/js/cufon-yanone.js"></script>
    <script type="text/javascript" src="resources/js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="resources/js/script.js"></script>
    <script type="text/javascript" src="resources/js/coin-slider.min.js"></script>
    <link rel="stylesheet" href="resources/css/styleCal.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" />
</head>
<body>
<div class="logo">
    <h1><a href="index.html"><small>Run with passion</small> <span>Jogging Calendar</span></a></h1>
</div>
<div class="clr"></div>
<div class="searchform">
    <form id="formsearch" name="formsearch" method="post" action="#">
          <span>
          <input name="editbox_search" class="editbox_search" id="editbox_search" maxlength="80" value="Search our ste:" type="text" />
          </span>
        <input name="button_search" src="resources/images/search.gif" class="button_search" type="image" />
    </form>
</div>
<div class="menu_nav">
    <ul>
        <li class="active"><a href="/"><span>Home Page</span></a></li>
        <li><a href="/calendar"><span>Calendar</span></a></li>
        <li><a href="/equipment"><span>Register</span></a></li>
        <li><a href="/profile"><span>Profile</span></a></li>
        <li><a href="/logout"><span>Log out</span></a></li>
        <li><a href="/about"><span>About Us</span></a></li>
        <li><a href="/contact"><span>Contact Us</span></a></li>
    </ul>
</div>

</body>
</html>
