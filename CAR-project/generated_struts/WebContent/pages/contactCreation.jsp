<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
    
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>contactCreation</title>
</head>
<body>
    
        <html:form action="addContact">
            <html:text type="text" property="id"/>
<html:text type="text" property="firstName"/>
<html:text type="text" property="lastName"/>
<html:text type="text" property="email"/>

            <html:submit></html:submit>
        </html:form>
    
</body>
</html:html>