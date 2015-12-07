package fr.uvsq.coo.exo3_8.fr;

public class DAOGroupeSerieFactory {
	public static DAO<Groupe> getGroupeDAO ( ) {
		return new GroupeDAO();
	}
	

}
