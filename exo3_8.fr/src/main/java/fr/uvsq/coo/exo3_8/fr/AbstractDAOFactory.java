package fr.uvsq.coo.exo3_8.fr;

public abstract class AbstractDAOFactory {
	public enum DaoType { JDBC, Serie; }
	
	public static AbstractDAOFactory getFactory(DaoType type ) {
	if(type == DaoType.Serie) return new DAOSerieFactory( );
	if(type == DaoType.JDBC) return new JDBCDAOFactory ( ) ;
	return null ;
	}

}
