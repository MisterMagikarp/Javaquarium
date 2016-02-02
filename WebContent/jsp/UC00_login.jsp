<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="/WEB-INF/tld/struts-bean-1.2.tld" prefix="bean" %>
 <%@ taglib uri="/WEB-INF/tld/struts-html-1.2.tld" prefix="html" %>
 <%@ taglib uri="/WEB-INF/tld/struts-logic-1.2.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<html:form action="login">
	<html:errors/>
	<br/>
	
	<bean:message key="login.utilisateur"/> <html:text property="utilisateur"/>
	<bean:message key="login.motdepasse"/> <html:text property="motDePasse"/>
	
	<html:submit property="submit" value="Se Connecter" />
	<html:reset property="reset" value ="Effacer" />
</html:form>

</body>
</html>