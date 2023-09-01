<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Jogging calendar</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href='<c:url value="css/style.css"/>' rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
    <script type="text/javascript" src="js/cufon-yui.js"></script>
    <script type="text/javascript" src="js/cufon-yanone.js"></script>
    <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <script type="text/javascript" src="js/coin-slider.min.js"></script>
    <link rel="stylesheet" href="dist/calendar.js.css" />
    <script src="dist/calendar.js"></script>
</head>
<body>
<div class="main">
    <div class="header">
        <div class="header_resize">
            <jsp:include page="header.jsp"/>
            <div class="clr"></div>
            <div class="clr"></div>
        </div>
    </div>

</div>
<div class="content">
    <div class="content_resize">
        <div class="mainbar">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 offset-md-3">

                        <div th:if="${param.error}">
                            <div class="alert alert-danger">Invalid Email or Password</div>
                        </div>
                        <div th:if="${param.logout}">
                            <div class="alert alert-success"> You have been logged out.</div>
                        </div>

                        <div class="card">
                            <div class="card-header">
                                <h2 class="text-center">Login Form</h2>
                            </div>
                            <div class="card-body">
                                <form
                                        method="post"
                                        role="form"
                                        th:action="@{/login}"
                                        class="form-horizontal"
                                >
                                    <div class="form-group mb-3">
                                        <label class="control-label"> Email</label>
                                        <input
                                                type="text"
                                                id="username"
                                                name="username"
                                                class="form-control"
                                                placeholder="Enter email address"
                                        />
                                    </div>

                                    <div class="form-group mb-3">
                                        <label class="control-label"> Password</label>
                                        <input
                                                type="password"
                                                id="password"
                                                name="password"
                                                class="form-control"
                                                placeholder="Enter password"
                                        />
                                    </div>
                                    <div class="form-group mb-3">
                                        <button type="submit" class="btn btn-primary" >Submit</button>
                                        <span> Not registered ?
                                <a th:href="@{/register}">Register/Signup here</a>
                            </span>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%--            <div class="sidebar">--%>
        <%--                <div class="gadget">--%>
        <%--                    <h2 class="star"><span>Sidebar</span> Menu</h2>--%>
        <%--                    <div class="clr"></div>--%>
        <%--                    <ul class="sb_menu">--%>
        <%--                        <li><a href="#">Home</a></li>--%>
        <%--                        <li><a href="#">TemplateInfo</a></li>--%>
        <%--                        <li><a href="#">Style Demo</a></li>--%>
        <%--                        <li><a href="#">Blog</a></li>--%>
        <%--                        <li><a href="#">Archives</a></li>--%>
        <%--                        <li><a href="#">Web Templates</a></li>--%>
        <%--                    </ul>--%>
        <%--                </div>--%>
        <%--                <div class="gadget">--%>
        <%--                    <h2 class="star"><span>Sponsors</span></h2>--%>
        <%--                    <div class="clr"></div>--%>
        <%--                    <ul class="ex_menu">--%>
        <%--                        <li><a href="http://www.dreamtemplate.com/">DreamTemplate</a><br />--%>
        <%--                            Over 6,000+ Premium Web Templates</li>--%>
        <%--                        <li><a href="http://www.templatesold.com/">TemplateSOLD</a><br />--%>
        <%--                            Premium WordPress &amp; Joomla Themes</li>--%>
        <%--                        <li><a href="http://www.imhosted.com/">ImHosted.com</a><br />--%>
        <%--                            Affordable Web Hosting Provider</li>--%>
        <%--                        <li><a href="http://www.megastockphotos.com/">MegaStockPhotos</a><br />--%>
        <%--                            Unlimited Amazing Stock Photos</li>--%>
        <%--                        <li><a href="http://www.evrsoft.com/">Evrsoft</a><br />--%>
        <%--                            Website Builder Software &amp; Tools</li>--%>
        <%--                        <li><a href="http://www.csshub.com/">CSS Hub</a><br />--%>
        <%--                            Premium CSS Templates</li>--%>
        <%--                    </ul>--%>
        <%--                </div>--%>
        <%--            </div>--%>
        <div class="clr"></div>
    </div>
</div>
<jsp:include page="footer.jsp"/>
</div>
<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>
</html>
