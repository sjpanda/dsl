<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trainer</title>
</head>
<body>
<f:view>
  <f:loadBundle basename="messages" var="messages" />
  <h:form>
  	
    <h:panelGrid columns="2">
      <h:outputLabel value="#{messages.left}"></h:outputLabel>
<h:inputText value="#{Card.left}">
</h:inputText>
<h:outputLabel value="#{messages.right}"></h:outputLabel>
<h:inputText value="#{User.right}">
</h:inputText>

    </h:panelGrid>
    <h:commandButton action="#{Card.show}" value="#{messages.show}"></h:commandButton>
<h:commandButton action="#{Card.clear}" value="#{messages.reset}"></h:commandButton>

    <h:messages layout="table"></h:messages>

  </h:form>
    <h:panelGrid columns="1">
      <h:outputLabel value="#{messages.result}"></h:outputLabel>
<h:inputText value="#{Card.result}">
</h:inputText>

    </h:panelGrid>
    
	
</f:view>
</body>
</html>