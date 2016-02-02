<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="/WEB-INF/tld/struts-bean-1.2.tld" prefix="bean" %>
 <%@ taglib uri="/WEB-INF/tld/struts-html-1.2.tld" prefix="html" %>
 <%@ taglib uri="/WEB-INF/tld/struts-logic-1.2.tld" prefix="logic" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.3.0/pure-min.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--  message de bienvenue, récupére les informations de l'utilisateur dans la page de connection -->
<bean:message key="message.bienvenue"/> <html:text name="utilisateur" property="utilisateur"/>

<table class="pure-table">

<!--  Header du tableau  -->
	<tr>
		<td> <bean:message key="tableau.nom" /> </td>
		<td> <bean:message key="tableau.description" /> </td>
		<td> <bean:message key="tableau.couleur" /> </td>
		<td> <bean:message key="tableau.dimension" /> </td>
		<td> <bean:message key="tableau.prix" /> </td>
		<td> <bean:message key="tableau.detail" /> </td>
		<td> <bean:message key="tableau.monaquarium" /> </td>
		
	</tr>
		
<!--  Contenu du tableau  -->
<logic:iterate name="requestTableauPoisson" id="MonPoisson">
	<tr>
		<td> <bean:write name="MonPoisson" property="espece"/> </td>
		<td> <bean:write name="MonPoisson" property="description"/> </td>
		<td> <bean:write name="MonPoisson" property="couleur"/> </td>
		<td> <bean:write name="MonPoisson" property="dimension"/> </td>
		<td> <bean:write name="MonPoisson" property="prix"/> </td>
		<td> <a href=""> <bean:message key="tableau.lien.details" /> </a> </td>
		<td> <a href=""> <bean:message key="tableau.lien.ajouter" /> </a>
			 <a href=""> <bean:message key="tableau.lien.retirer" /> </a>
		</td>
		
	</tr>
</logic:iterate>
		
		</table>

</body>
</html>