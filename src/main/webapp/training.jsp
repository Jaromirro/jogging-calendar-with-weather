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


                    <h1>Lista Treningow</h1>
                    <c:forEach items="${trainings}" var="trainings">
                        <p>${trainings.id}.  ${trainings.title}  (${trainings.distance}km)  ${trainings.hour}h   ${trainings.minutes}min   ${trainings.seconds}s
                            <a href="/tupdate/${trainings.id}">Edytuj</a>
                            <a href="/tremove/${trainings.id}">Usuń</a>
                        </p>
                                  <ul>
                                    <c:forEach items="${trainings.equipment}" var="equipment">
                                      <li>
                                          ${equpimnet.type} ${equpimnet.name}
                                      </li>
                                    </c:forEach>
                                  </ul>
                    </c:forEach>
                <br>
                <a href="tadd">Dodaj trening</a>
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
