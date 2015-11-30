package fr.uvsq.coo.exo3_8.fr;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel  implements Element {

	private static final long serialVersionUID = 1L;
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
	private  ArrayList<Long> telephone = new ArrayList<Long>();
	private String poste="rien";
	
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

	public void lire() {
		// TODO Auto-generated method stub
		
	}

	public void ecrire() throws IOException {
		private static final long serialVersionUID = 1L;
		private final String nom;
		private final String prenom;
		private final LocalDate dateNaissance;
		private final  ArrayList<Long> telephone;
		private final  String poste;

		try(
				ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("./Test.xml"))))
				{					
					out.writeUTF(nom);
					out.writeUTF(prenom);
					out.writeObject(dateNaissance);
					out.writeInt(telephone.size());
					for(int i=0 ;i<telephone.size();i++)
					{
						out.writeObject(telephone.get(i));
						
					}
					out.writeObject(poste);
				}
	}


}
