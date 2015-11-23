package fr.uvsq.coo.exo3_8.fr;

import java.util.ArrayList;

import java.util.Iterator;

public class Groupe implements Element {
	
	public ArrayList<Element> list;
	public String nom;
	
	Groupe(String nom){
		
		list = new ArrayList<Element>();
		this.nom = nom;
		
	}
	
	
	public void affiche()
	{
		System.out.println(nom+"\n");
		for(Element e : list)
		{
			e.affiche();
		}
		
		
		
	}
	
	public void afficheLargeur()
	
	{
		ArrayList<Element> a= new ArrayList<Element>();
		System.out.println(nom);
		for(Element e : list)
		{
			a.add(e);
			e.affiche();
			
			
		}
		
		a.remove(0).afficheLargeur();
		
		
	}
	
	
	

}
