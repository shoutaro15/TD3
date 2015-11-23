package fr.uvsq.coo.exo3_8.fr;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel  implements Element{
	private final String nom;
	private final String prenom;
	private final LocalDate dateNaissance;
	private final  ArrayList<Long> telephone;
	private final  String poste;
	
	public static class Builder{
		
	// parametre principaux
	private final String nom;
	private final String prenom;
	private final  LocalDate dateNaissance;
	
	// parametre opti
	private  ArrayList<Long> telephone;
	private String poste;
	
	public Builder(String nom,String prenom,LocalDate date)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = date;
	}
	
	public Builder telephone(ArrayList<Long> numero)
	{
		this.telephone.addAll(numero);
		return this;
		
	}
	
	public Builder poste(String poste)
	{
		this.poste = poste;
		return this;
		
	}

	public Personnel build()
	{
		return new Personnel(this);
	}
	
	}
	

	private Personnel (Builder builder)
	{
		nom = builder.nom;
		prenom = builder.prenom;
		
		dateNaissance = builder.dateNaissance;
		telephone = builder.telephone;
		poste = builder.poste;
		
	}
	
	public void affiche()
	{
		System.out.println(nom);
		
	}
	public void afficheLargeur()
	{
		
	}


}
