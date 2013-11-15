package com.cncit.model;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;
import com.googlecode.objectify.Key;

@Entity
@Index
@Cache

public class Ingredients {
	@Id private Long id;
	
	String nom;
	String lien_image;
	public Ingredients(){
		
	}
	public Ingredients(String nom, String lien_image) {
		
		this.nom = nom;
		this.lien_image = lien_image;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLien_image() {
		return lien_image;
	}
	public void setLien_image(String lien_image) {
		this.lien_image = lien_image;
	}
	
	
	
}
