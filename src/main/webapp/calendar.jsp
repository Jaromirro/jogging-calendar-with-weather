<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
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

                <script src="resources/js/scriptCal.js"></script>
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
