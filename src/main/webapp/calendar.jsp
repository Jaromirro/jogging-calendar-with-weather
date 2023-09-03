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
                <p class="pages"><small>Page 1 of 2</small> <span>1</span> <a href="#">2</a> <a href="#">&raquo;</a></p>
            </div>
            <div class="clr"></div>
        </div>
    </div>
    <jsp:include page="footer.jsp"/>
</div>
<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>
</html>
