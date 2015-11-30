package fr.uvsq.coo.exo3_8.fr;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public interface Element  extends  Serializable{
	public void affiche();
	public void afficheLargeur();
	public void lire() throws FileNotFoundException, IOException, ClassNotFoundException;
	public void ecrire() throws IOException;

	

}
