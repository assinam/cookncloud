package com.cncit.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

import com.googlecode.objectify.annotation.*;
import com.googlecode.objectify.Key;
@Entity
@Index
@Cache
public class Action {
  @Id
  private Long id;
  @Parent Key<Recette> parent;
  private String libelle;
  private String shortdescription;
  /* ordre des etapes */
  private Long order;
  private String lien_image;
 
  //les deux attributs ci desous ne sont pas des types supportés par le datastore
   //private List ustensileList = new ArrayList(); 
  //private List  ingredientsList = new ArrayList();
 
 
  /* est un Regroupement */
  private Long groupeorder ; //le groupe Order regle le probleme 
  //(par exemple on va demander de sortir l'ensemble des actions pour 
  //l'etape 1 tu comprends ?

  public Action(){};
  public Action (String libelle, String shortdescription) {
    this.libelle = libelle;
    this.shortdescription = shortdescription;
  //  this.ustensileList = ust;
    //this.ingredientsList = ing; 
    
    
  }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getLibelle() {
	return libelle;
}

public void setLibelle(String libelle) {
	this.libelle = libelle;
}

public String getShortdescription() {
	return shortdescription;
}

public void setShortdescription(String shortdescription) {
	this.shortdescription = shortdescription;
}

public Long getOrder() {
	return order;
}

public void setOrder(Long order) {
	this.order = order;
}

public Long getGroupeorder() {
	return groupeorder;
}

public void setGroupeorder(Long groupeorder) {
	this.groupeorder = groupeorder;
}
  
}