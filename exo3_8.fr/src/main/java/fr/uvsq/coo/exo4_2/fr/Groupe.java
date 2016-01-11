package fr.uvsq.coo.exo4_2.fr;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fr.uvsq.coo.exo3_8.fr.Element;

//@Entity
public class Groupe {
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
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


	public void lire() throws FileNotFoundException, IOException, ClassNotFoundException {
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream("./Test.txt") ) ) ) {
				this.nom = in.readUTF();
				int taille = in.readInt();
				
				for(int i=0 ; i<taille ;i++)
				{
					this.list.add((Element) in.readObject());	
					
				}
				}
	}

	public void ecrire() throws IOException {
		try(
		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("./Test.txt"))))
		{			
			
			out.writeUTF(nom);
			out.writeInt(list.size());
			
			for(int i =0 ;i<list.size();i++)
			{
		
				out.writeObject(list.get(i));
				
			}
		
		}
	
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public ArrayList<Element> getList() {
		return list;
	}


	public void setList(ArrayList<Element> list) {
		this.list = list;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

	
	
}	
	





