<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<body>
<div class="main">
    <div class="header">
        <div class="header_resize">
            <jsp:include page="headerReg.jsp"/>
            <div class="clr"></div>
            <div class="slider"><br><br><br><br><br>
                Witaj!

                <ul>
                    <li class="active"><a href="/"><span>Home Page</span></a></li>
                    <li><a href="/pedit"><span>Edytuj profil</span></a></li>
                    <li><a href="/training"><span>Training</span></a></li>
                    <li><a href="/elist"><span>Equipment</span></a></li>
                    <li><a href="/profile"><span>Profile</span></a></li>
                    <li><a href="/logout"><span>Log out</span></a></li>
                    <li><a href="/about"><span>About Us</span></a></li>
                    <li><a href="/contact"><span>Contact Us</span></a></li>
                </ul>

                <div class="clr"></div>
            </div>
            <div class="clr"></div>
        </div>
    </div>

</div>
<jsp:include page="footer.jsp"/>
</div>
<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>
</html>
