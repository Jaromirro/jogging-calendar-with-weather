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
          <h2 class="form-signin-heading">Edit Your profile</h2><br>
          <form:form method="POST" modelAttribute="pForm" class="form-signin">
          <div class="form-group ${status.error ? 'has-error' : ''}">
        <br>
        <form:input type="text" path="firstName" class="form-control" placeholder="firstName"
                    autofocus="true"></form:input>
      </div>
          <div class="form-group ${status.error ? 'has-error' : ''}">
            <form:input type="text" path="lastName" class="form-control" placeholder="lastName"
                        autofocus="true"></form:input>

          </div>
          <div class="form-group ${status.error ? 'has-error' : ''}">
              Male <form:radiobutton path="sex" value="1"/><br>
              Female <form:radiobutton path="sex" value="2"/><br>
          </div>
          <div class="form-group ${status.error ? 'has-error' : ''}">
            <form:input type="number" path="weight" class="form-control" placeholder="weight"
                        autofocus="true"></form:input>

          </div>
          <div class="form-group ${status.error ? 'has-error' : ''}">
            <form:input type="number" path="height" class="form-control" placeholder="height"
                        autofocus="true"></form:input>

          </div>
          <div class="form-group ${status.error ? 'has-error' : ''}">
            <form:input type="text" path="city" class="form-control" placeholder="city"
                        autofocus="true"></form:input>
          </div>


          <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
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
