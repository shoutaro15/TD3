package fr.uvsq.coo.exo3_8.fr;

import java.sql.Connection;

public abstract class DAO<T> {
	protected Connection connect = "org.apache.derby.jdbc.EmbeddedDriver";
	public abstract T create (T obj ) ;
	public abstract T find( String id ) ;
	public abstract T update(T obj) ;
	public abstract void delete(T obj) ;
}
