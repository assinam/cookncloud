<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cuisiner ou Ajouter</title>
</head>
<body>
 <h1>CookNCloud It!</h1>
          <%UserService userService = UserServiceFactory.getUserService();
    User user = userService.getCurrentUser();%>
    
             <% if (userService.getCurrentUser() == null) { %>
            <p>Bonjour! Veuillez vous <a href="<%= userService.createLoginURL("/") %>">connecter</a> pour jouer au CooknCloud it! 
            Amusez-vous!</p>
         <% }
         else { %>
            <p>Bonjour <%= userService.getCurrentUser().getNickname() %></p>
            <p><a href="<%= userService.createLogoutURL("/") %>">Se déconnecter</a></p>
            <p> Choisis ton avatar </p>
             <table>	
             	<tr>
                	<td><a href="CuisinerAjouter.jsp"> <img alt="homme"  src="/images/Chef_Vector_Character_Holding_a_Tray.png">
                	  </a>             </td>
    				<td></td>
     				<td><img alt="femme"  src="/images/Woman_Chef_Vector_Character.png"></td>
             </tr>
             </table>

            
        <% } %>
</body>
</html>