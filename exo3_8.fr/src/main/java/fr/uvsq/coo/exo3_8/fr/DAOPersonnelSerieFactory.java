package fr.uvsq.coo.exo3_8.fr;

public class DAOPersonnelSerieFactory {
	public static DAO<Personnel> getPersonneDAO ( ) {
		return new PersonnelDAO();
	}

}
