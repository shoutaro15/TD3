package fr.uvsq.coo.exo4_2.fr;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Personnel")
public class Personnel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	@Column
	private  String nom;
	

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	
	
	
	
	
	

	
}

	




