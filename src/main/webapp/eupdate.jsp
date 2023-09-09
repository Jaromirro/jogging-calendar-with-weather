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
        <h2 class="form-signin-heading">EDYTUJ SPRZET</h2><br>
        <br><h3>Rodzaj sprzetu</h3><br>
        <form:form modelAttribute="equipment" method="post">
          <form:hidden path="id"/>
          <form:radiobuttons items="${EquipTyp}" path="type" /></label><br>
          <label for="name">Nazwa: <form:input path="name"/>
            <form:errors path="name" cssClass="error"/>
          </label><br><br><br>
          <label for="km">Dystans: <form:input path="km"/>
            <form:errors path="km" cssClass="error"/><br>
            Cieple <form:radiobutton path="weather" value="1"/><br>
            Przejsciowe <form:radiobutton path="weather" value="2"/><br>
            Lekkie <form:radiobutton path="weather" value="3"/><br>
            Nie dotyczy <form:radiobutton path="weather" value="4"/><br>

          </label><br><br>

          <input type="submit">
        </form:form>

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
