package com.cncit.model;

import java.text.DateFormat;
import java.util.List;

import com.googlecode.objectify.annotation.*;
import com.google.appengine.api.users.*;


@Entity
@Index
@Cache
public class Joueur  {
	@Id private Long id;
		  private String nickname;
		  private DateFormat  lastconnection;
		  private int lastHighScore;
		  private String last_level;  
		  private String countrycode;
		  private String continent;
		  private UserService userService;
		  @Unindex private boolean estConnecte = false;
		  
		 public Joueur() {}
		 public Joueur (String nickname, String last_level) {
		    this.nickname = nickname;
		    this.last_level = last_level;
		       }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public DateFormat getLastconnection() {
			return lastconnection;
		}
		public void setLastconnection(DateFormat lastconnection) {
			this.lastconnection = lastconnection;
		}
		public int getLastHighscore() {
			return lastHighScore;
		}
		public void setLastHighScore(int lasthightscore) {
			this.lastHighScore = lasthightscore;
		}
		public String getLast_level() {
			return last_level;
		}
		public void setLast_level(String last_level) {
			this.last_level = last_level;
		}
		public String getCountrycode() {
			return countrycode;
		}
		public void setCountrycode(String countrycode) {
			this.countrycode = countrycode;
		}
		public String getContinent() {
			return continent;
		}
		public void setContinent(String continent) {
			this.continent = continent;
		}
		
		// les fonctions 
		
		public boolean estConnecte(){
			boolean estConnect ;
			userService = UserServiceFactory.getUserService();
		    if (userService.getCurrentUser() == null) { 
	            return false; 
	            }
	         else { 
	          return   true;  
	         }
		}
		public void seConnecter(){
			String lienConnexion;
		    
		    if (!estConnecte()) { 
		    	
		    	//quand il n'est pas connecté, il doit être renvoyé sur 
		    	//la page de connexion google
		            lienConnexion =userService.createLoginURL("/"); 
		            }
		         else { 
		        	 //s'il est connecté, on a déjà son nickname
		        	 //et on a le lien de la page de déconnexion 
		           this.nickname = userService.getCurrentUser().getNickname() ;
		            lienConnexion = userService.createLogoutURL("/") ;
		         }
		            
		    
			
		}
		
		public void choixPays (String countrycode){
		this.countrycode = countrycode;	
		}
		public Recette ajouterUneRecette(String nom, String shortdescription,
				  String longdescription, String lien_image ,  int typeRecette){
		  
			Recette rec = new Recette(nom,  shortdescription,
		  longdescription, lien_image ,  typeRecette); 
			return rec;
			
		}
		
		public Action ajouterAction(String libelle, String shortdescription, List<Ustensile> ust, 
				List<Ingredients> ing){
			Action act = new Action ( libelle,  shortdescription);
			return act;
			
		}
}
