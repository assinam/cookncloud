package com.cncit.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

import com.googlecode.objectify.annotation.*;

@Entity
@Index
@Cache
public class Recette {
  @Id
  private Long id;
  private String nom; 
  private String shortdescription;
  private String longdescription; 
  private String lien_image; 
  boolean approved;
  /*List des Actions pour une recette donnee */
  private List<Action> etapeList = new ArrayList<Action>(); 
  private int typeRecette  ; // 0=> Entree ,  1 => Resistance , 2 => Dessert , 3 => Autres

  public Recette(){};
 
  public Recette(String nom, String shortdescription,
		  String longdescription, String lien_image ,  int typeRecette) {
    this.nom = nom;
    this.longdescription = longdescription;
    this.shortdescription = shortdescription;
    this.lien_image = lien_image;
    this.approved = false;
    this.typeRecette = typeRecette;
  }

public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getShortdescription() {
	return shortdescription;
}

public void setShortdescription(String shortdescription) {
	this.shortdescription = shortdescription;
}


public String getLongdescription() {
	return longdescription;
}


public void setLongdescription(String longdescription) {
	this.longdescription = longdescription;
}


public String getLien_image() {
	return lien_image;
}


public void setLien_image(String lien_image) {
	this.lien_image = lien_image;
}


public boolean isApproved() {
	return approved;
}


public void setApproved(boolean approved) {
	this.approved = approved;
}

@OneToMany
public List<Action> getEtapeList() {
	return etapeList;
}


public void setEtapeList(List<Action> etapeList) {
	this.etapeList = etapeList;
}


public int getTypeRecette() {
	return typeRecette;
}


public void setTypeRecette(int typeRecette) {
	this.typeRecette = typeRecette;
}
  
}