package fr.uvsq.coo.exo4_2.fr;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personnel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	private final String nom;
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public ArrayList<Long> getTelephone() {
		return telephone;
	}

	public String getPoste() {
		return poste;
	}

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

	public void lire() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream("./Personnel.txt") ) ) ) {
				String nom = in.readUTF();
				String prenom = in.readUTF();
				LocalDate dateNaissance = (LocalDate) in.readObject();
				
				System.out.println("Le nom est :"+nom +"\n Le prenom est :"+prenom+
						"\n La date de naissance est:"+dateNaissance);
				
				int taille = in.readInt();
				
				ArrayList<Long> tele = new ArrayList<Long>();
				
				for(int i=0 ; i<taille ;i++)
				{
					tele.add( (Long)  in.readObject() );
					System.out.println(tele.get(i));
					
				}
				
				}
		
				
		
	}

	public void ecrire() throws IOException {

		try(
				ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("./Personnel.xml"))))
				{					
					out.writeUTF(nom);
					out.writeUTF(prenom);
					out.writeObject(dateNaissance);
					out.writeInt(telephone.size());
					for(int i=0 ;i<telephone.size();i++)
					{
						out.writeObject(telephone.get(i));
						
					}
					out.writeUTF(poste);
				}
	}

}


