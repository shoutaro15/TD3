package fr.uvsq.coo.exo3_8.fr;

import java.util.ArrayList;

import java.util.Iterator;

public class Groupe implements Element {
	
	public ArrayList<Element> list;
	public String nom;
	
	Groupe(){
		
		
	}
	
	
	public void affiche()
	{
		System.out.println(nom+"\n");
		for(Element e : list)
		{
			e.affiche();
		}
		
	}
	
	

}
