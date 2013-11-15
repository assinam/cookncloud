package com.cncit.firstapp;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.text.DateFormat;
import java.util.*;

import com.cncit.model.Action;
import com.cncit.model.Joueur;
import com.cncit.model.Recette;
import com.googlecode.objectify.ObjectifyService;

public class Service {
	
	static {
        ObjectifyService.register(Joueur.class);
       ObjectifyService.register(Recette.class);// Fait connaître votre classe-entité à Objectify
    
	}
	public void startGame(Recette recetteChoisie, DateFormat heureDebut,
			Joueur joueur){
		ofy().save().entity(recetteChoisie).now();
		ofy().save().entity(joueur).now();
	}
	
	public void approuverRecette(Recette recetteAApprouver){
		recetteAApprouver.setApproved(true);
	    
	}
	
	public List<Action> afficherListeActionEndesordre(ArrayList<Action> listeAction){
		List<Action> listeDesordre ;
		listeDesordre = listeAction ;
		Collections.shuffle(listeDesordre);
		return listeDesordre;
	}
	
	

}
