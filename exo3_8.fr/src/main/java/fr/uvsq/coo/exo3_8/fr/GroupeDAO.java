package fr.uvsq.coo.exo3_8.fr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;;

public class GroupeDAO extends DAO<Groupe> {

	@Override
	public Groupe create(Groupe obj) {
		try(Connection connection=DriverManager.getConnection("jdbc:derby:BD;create=true")){
			PreparedStatement prepare = connection.prepareStatement(
			"INSERT INTO groupe (nom) VALUES( ? ) " ) ;
			prepare.setString(1 , obj.nom) ;
			int result = prepare . executeUpdate( ) ;
			assert result == 1 ;
			}catch (SQLException e ) {
			e.printStackTrace ( ) ;
			}
			return obj;
	}

	@Override
	public Groupe find(String id) {
		
		Groupe p = new Groupe(id) ;
		try(Connection connection=DriverManager.getConnection("jdbc:derby:BD;create=true")){
		PreparedStatement prepare = connection.prepareStatement (
		"SELECT ∗ FROM groupe WHERE nom = ? " ) ;
		prepare.setString( 1 , p.nom ) ;
		ResultSet result = prepare.executeQuery ( ) ;
		if(result.first( ) ) {
		p = new Groupe(result.getString(id));
		}
		}catch(SQLException e ) {
		e.printStackTrace ( ) ;
		}
		return p ;
	}

	@Override
	public Groupe update(Groupe obj) {
		try(Connection connection=DriverManager.getConnection("jdbc:derby:BD;create=true")){
			PreparedStatement prepare = connection.prepareStatement (
			"Update groupe set nom =?" ) ;
			prepare.setString(1 ,obj.nom) ;
			}catch(SQLException e ) {
			e.printStackTrace ( ) ;
			}
			return obj ;
		
	}

	@Override
	public void delete(Groupe obj) {
		try(Connection connection=DriverManager.getConnection("jdbc:derby:BD;create=true")){
			PreparedStatement prepare = connection.prepareStatement (
			"Delete groupe where nom =?" ) ;
			prepare.setString(1 ,obj.nom) ;
			}catch(SQLException e ) {
			e.printStackTrace ( ) ;
			}
		
	}
}
