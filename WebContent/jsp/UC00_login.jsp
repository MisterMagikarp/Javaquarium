<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="/WEB-INF/tld/struts-bean-1.2.tld" prefix="bean" %>
 <%@ taglib uri="/WEB-INF/tld/struts-html-1.2.tld" prefix="html" %>
 <%@ taglib uri="/WEB-INF/tld/struts-logic-1.2.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page de connexion</title>
</head>
<body>

<html:form action="pageLogin" styleClass="pure-form pure-form-aligned">
	<html:errors/>
	<br/>
	
	<div class="pure-control-group">
	<bean:message key="login.utilisateur"/> <html:text property="utilisateur"/>
	</div>
	
	<div class="pure-control-group">
	<bean:message key="login.motdepasse"/> <html:text property="motDePasse"/>
	</div>
	
	<html:submit property="submit" value="Se Connecter" />
	<html:reset property="reset" value ="Effacer" />
</html:form>

</body>
</html>