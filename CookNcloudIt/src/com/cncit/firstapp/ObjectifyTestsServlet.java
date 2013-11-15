package com.cncit.firstapp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

import com.cncit.model.Joueur;
import com.googlecode.objectify.ObjectifyService;

@SuppressWarnings("serial")
public class ObjectifyTestsServlet extends HttpServlet {
    static {
        ObjectifyService.register(Joueur.class); // Fait conna�tre votre classe-entit� � Objectify
    }
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
        // ...
    }
}