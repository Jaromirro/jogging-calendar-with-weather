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


                <h1>Potwierdz usunięcie treningu</h1>
                <a href="/tremove/${trainingId}/confirmed">potwierdzam</a>
                <a href="/training">anuluj</a>
                <br>
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
