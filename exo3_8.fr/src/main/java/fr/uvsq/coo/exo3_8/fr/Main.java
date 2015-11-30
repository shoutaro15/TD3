package fr.uvsq.coo.exo3_8.fr;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Personnel a = new Personnel.Builder("Jean", "Potiche",LocalDate.now()).build();
		Personnel b = new Personnel.Builder("Maxime", "Potiche",LocalDate.now()).build();
		Personnel c = new Personnel.Builder("Sophie", "Potiche",LocalDate.now()).build();

		Groupe a1 = new Groupe("Groupe Hoche");
		Groupe b1 = new Groupe("Test");
		
		Groupe a2 = new Groupe("Groupe Petrie");
		Groupe a3 = new Groupe("Groupe Arbre");
		
		a1.list.add(a);
		a1.list.add(b);
		a1.list.add(c);
		
		a2.list.add(c);
		
		a3.list.add(a);
		a3.list.add(b);
		a3.list.add(a2);
		a3.list.add(a1);
		
		a1.ecrire();
		b1.lire();
		System.out.print(b1.nom);
		System.out.print(b1.list.get(0));

		
		

	}

}
