package com.cncit.firstapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cncit.model.Action;
import com.cncit.model.Ingredients;
import com.cncit.model.Joueur;
import com.cncit.model.Recette;
import com.cncit.model.Ustensile;
import com.google.appengine.api.datastore.*;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

import static com.googlecode.objectify.ObjectifyService.ofy;
@SuppressWarnings("serial")

public class CooknCloudItDataStore extends HttpServlet {
	Joueur joueur1 = new Joueur("nyota","Dessert");


	static {
        ObjectifyService.register(Joueur.class);
      ObjectifyService.register(Recette.class);// Fait connaître votre classe-entité à Objectify
        ObjectifyService.register(Action.class);
        ObjectifyService.register(Ustensile.class);
        ObjectifyService.register(Ingredients.class);
        
	
	}
	 	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

	//DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

	Joueur joueur1 = new Joueur("nyota","Dessert");
	ofy().save().entity(joueur1).now();
	Joueur joueur2 = new Joueur("assimay","Plat");
	ofy().save().entity(joueur2).now();
	Recette recette1 = new Recette("nom","description1","description2","description3",2	);
    ofy().save().entity(recette1).now();
    Ustensile ustensile1 = new Ustensile ("Couteau","http:");
    ofy().save().entity(ustensile1).now();
    Ingredients ing1 = new Ingredients("oeufs","http:");
    ofy().save().entity(ing1).now();
    //List  ust = new ArrayList <Ustensile>();
    //ust.add(ustensile1);
    //List  ing = new ArrayList <Ingredients>();
    //ing.add(ing1);
    
    Action action1 = new Action("Casser les oeufs","Ici on casse à l'aide d'une fourchette");
    ofy().save().entity(action1).now();
    
/*    Entity joueur = new Entity("Joueur");
    joueur.setProperty("nickname", "assimay");
    joueur.setProperty("continet", "Afrique");
    joueur.setProperty("pays", "RDC");
    

    Entity joueur1 = new Entity("Joueur");
    joueur1.setProperty("nickname", "nyota");
    joueur1.setProperty("continet", "Afrique");
    joueur1.setProperty("pays", "Kenya");
    
    // Enregistre l'entité dans le Datastore
    datastore.put(joueur); 
   datastore.put(joueur1); */
 }

}
