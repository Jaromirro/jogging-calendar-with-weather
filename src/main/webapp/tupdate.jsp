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


                <h1>EDYTUJ TRENING</h1>
                <form:form modelAttribute="training" method="post">
                    <form:hidden path="id"/>
                    <label for="title">Nazwa: <form:input path="title" type="text"/>
                        <form:errors path="title" cssClass="error"/>
                    </label><br>
                    <label for="distance">Dystans: <form:input path="distance" type="number" />
                        <form:errors path="distance" cssClass="error"/>
                    </label><br>
                    <label for="date">Data i czas rozpoczęcia: <form:input path="date" type="date"/>
                        <form:errors path="date" cssClass="error"/>
                    </label><br>
                    <%--                    <label for="time">Dystans: <form:input path="time" type="time"/>--%>
                    <%--                        <form:errors path="time" cssClass="error"/>--%>
                    <%--                    </label><br>--%>
                    <%--&lt;%&ndash;                    <label for="timeEnd">Dystans: <form:input path="timeEnd" type="time"/>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                        <form:errors path="timeEnd" cssClass="error"/>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                    </label>&ndash;%&gt;--%>
                    <span>Czas trwania treningu</span><br>
                    <label for="hour">Godziny: <form:input path="hour" type="number"/>
                        <form:errors path="hour" cssClass="error"/></label><br>
                    <label for="minutes">Minuty: <form:input path="minutes" type="number"/>
                        <form:errors path="minutes" cssClass="error"/></label><br>
                    <label for="seconds">Sekundy: <form:input path="seconds" type="number"/>
                        <form:errors path="seconds" cssClass="error"/>
                    </label><br><br>
                    </label>    <input type="submit">
                </form:form>
            </div>
            <div class="clr"></div>
        </div>
    </div>

</div>
<jsp:include page="footer.jsp"/>
</div>
<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>
</html>
