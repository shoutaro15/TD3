package fr.uvsq.coo.exo3_8.fr;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class GroupeTest {

	@Test
	public void testLire() throws FileNotFoundException, IOException, ClassNotFoundException {
		Groupe a = new Groupe("R");
		a.lire();
		int taille = a.list.size();

		assertEquals(a.nom , "Test");
		assertTrue(taille == 1);
		
		
				
		
		
		
	}

	@Before
	public void testEcrire() throws IOException {
		Groupe a = new Groupe("Test");
		Personnel b = new Personnel.Builder("Argon", "Sophie", LocalDate.now()).build();
		a.list.add(b);
		a.ecrire();
		
		
	}

}
