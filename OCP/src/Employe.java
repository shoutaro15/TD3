
public class Employe {

	private final String nom ;
	private final String adresse ;
	private  int nbAnnee;
	
	public int getNbAnnee() {
		return nbAnnee;
	}

	public void setNbAnnee(int nbAnnee) {
		this.nbAnnee = nbAnnee;
	}

	Employe(String nom,String adresse,int nbAnnee)
	{
		this.nom=nom;
		this.adresse=adresse;
		this.nbAnnee = nbAnnee;
	}
	


	public String getNom() {
		return nom;
	}

	public String getAdresse() {
		return adresse;
	}

}
