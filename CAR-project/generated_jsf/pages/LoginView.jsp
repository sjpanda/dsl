<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginView</title>
</head>
<body>
<f:view>
  <f:loadBundle basename="messages" var="messages" />
  <h:form>
  	
    <h:panelGrid columns="2">
      <h:outputLabel value="#{messages.user}"></h:outputLabel>
<h:inputText value="#{User.name}">
<f:validator validatorId="LoginValidator" />
</h:inputText>
<h:outputLabel value="#{messages.password}"></h:outputLabel>
<h:inputSecret value="#{User.password}">
</h:inputSecret>

    </h:panelGrid>
    <h:commandButton action="#{User.login}" value="#{messages.login}"></h:commandButton>

    <h:messages layout="table"></h:messages>

  </h:form>
</f:view>
</body>
</html>