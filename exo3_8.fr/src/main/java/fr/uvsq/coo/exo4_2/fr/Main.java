package fr.uvsq.coo.exo4_2.fr;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	private static final String PERSISTENCE_UNIT_NAME = "Personnel" ;
	private static EntityManagerFactory factory ;
	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory (PERSISTENCE_UNIT_NAME) ;
		EntityManager em =factory.createEntityManager( ) ;
		em.getTransaction().begin( ) ;
		Personnel jean = new Personnel();
		//jean.setId(5);
		jean.setNom("jean");
		em.persist(jean);
		em.getTransaction().commit() ;
		em.close( ) ;

	}

}
