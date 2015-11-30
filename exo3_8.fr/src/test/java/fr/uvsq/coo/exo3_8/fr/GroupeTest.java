package fr.uvsq.coo.exo3_8.fr;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class GroupeTest {

	@Test
	public void testLire() {
		
		
	}

	@Test
	public void testEcrire() {
		Groupe a = new Groupe("Test");
		Personnel b = new Personnel.Builder("Argon", "Sophie", LocalDate.now()).build();
		
		
	}

}
