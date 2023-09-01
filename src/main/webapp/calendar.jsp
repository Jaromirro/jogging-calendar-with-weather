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
    <link rel="stylesheet" href="css/styleCal.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" />

</head>
<body>


<div class="main">
    <jsp:include page="header.jsp"/>
    <div class="content">
        <div class="content_resize">
            <div class="mainbar">
                <div class="container">
                    <div class="header">
                        <div id="month"></div>
                        <div>
                            <button id="btnBack"><i class="fa fa-angle-left"></i></button>
                            <button id="btnNext"><i class="fa fa-angle-right"></i></button>
                        </div>
                    </div>
                    <div class="weekdays">
                        <div>Sun</div>
                        <div>Mon</div>
                        <div>Tue</div>
                        <div>Wed</div>
                        <div>Thu</div>
                        <div>Fri</div>
                        <div>Sat</div>
                    </div>
                    <div id="calendar"></div>
                </div>
                <div id="modal"></div>
                <div id="addEvent">
                    <h2>Add Event</h2>
                    <input type="text" id="txtTitle" placeholder="Run Title" /><br>
                    <input type="time" id="txtTime" placeholder="Event Time" /><br>
                    <input type="number" id="txtDurH" placeholder="Event Duration 'Hours'" />
                    <input type="number" id="txtDurM" placeholder="Event Duration 'Minutes'" />
                    <input type="number" id="txtDurS" placeholder="Event Duration 'Seconds'" /><br>
                    <input type="number" id="txtDistance" placeholder="Event Distance" /><br>
                    <button id="btnSave">Save</button>
                    <button class="btnClose">Close</button>
                </div>

                <div id="viewEvent">
                    <h2>Event</h2>
                    <p id="eventText">This is Sample Event</p>
                    <button id="btnDelete">Delete</button>
                    <button class="btnClose">Close</button>
                </div>

                <script src="js/scriptCal.js"></script>
                </div>
                <%--                <div class="article">--%>
                <%--                    <h2><span>We'll Make Sure Template</span> Works For You</h2>--%>
                <%--                    <p class="infopost">Posted <span class="date">on 29 aug 2016</span> by <a href="#">Admin</a> &nbsp;&nbsp;|&nbsp;&nbsp; Filed under <a href="#">templates</a>, <a href="#">internet</a> <a href="#" class="com"><span>7</span></a></p>--%>
                <%--                    <div class="clr"></div>--%>
                <%--                    <div class="img"><img src="images/img2.jpg" width="630" height="140" alt="" class="fl" /></div>--%>
                <%--                    <div class="post_content">--%>
                <%--                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. <a href="#">Morbi tincidunt, orci ac convallis aliquam, lectus turpis varius lorem, eu posuere nunc justo tempus leo.</a> Donec mattis, purus nec placerat bibendum, dui pede condimentum odio, ac blandit ante orci ut diam. Cras fringilla magna. Phasellus suscipit, leo a pharetra condimentum, lorem tellus eleifend magna, eget fringilla velit magna id neque. Curabitur vel urna. In tristique orci porttitor ipsum. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. Morbi tincidunt, orci ac convallis aliquam.</p>--%>
                <%--                        <p><strong>Aenean consequat porttitor adipiscing. Nam pellentesque justo ut tortor congue lobortis. Donec venenatis sagittis fringilla.</strong> Etiam nec libero magna, et dictum velit. Proin mauris mauris, mattis eu elementum eget, commodo in nulla. Mauris posuere venenatis pretium. Maecenas a dui sed lorem aliquam dictum. Nunc urna leo, imperdiet eu bibendum ac, pretium ac massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nulla facilisi. Quisque condimentum luctus ullamcorper.</p>--%>
                <%--                        <p class="spec"><a href="#" class="rm">Read more &raquo;</a></p>--%>
                <%--                    </div>--%>
                <%--                    <div class="clr"></div>--%>
                <%--                </div>--%>
                <p class="pages"><small>Page 1 of 2</small> <span>1</span> <a href="#">2</a> <a href="#">&raquo;</a></p>
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
