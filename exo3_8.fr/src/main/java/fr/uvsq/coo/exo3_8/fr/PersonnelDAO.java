package fr.uvsq.coo.exo3_8.fr;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class PersonnelDAO extends DAO<Personnel> {

	@Override
	public Personnel create(Personnel obj) {
		try{
			PreparedStatement prepare = connect.prepareStatement(
			"INSERT INTO personnel (nom,prenom,poste, dateDeNaissance ) VALUES( ?,?,?,? ) " ) ;
			prepare.setString(1 , obj.getNom()) ;
			prepare.setString(2, obj.getPrenom());
			prepare.setString(3,obj.getPoste());
			prepare.setString(4 ,obj.getDateNaissance().toString()) ;
			int result = prepare . executeUpdate( ) ;
			assert result == 1 ;
			}catch (SQLException e ) {
			e.printStackTrace ( ) ;
			}
			return obj;
	}

	@Override
	public  Personnel  find(String nom) {
		Personnel p = new Personnel.Builder(nom, "", LocalDate.now()).build() ;
		try{
		PreparedStatement prepare = connect.prepareStatement (
		"SELECT ∗ FROM personnel WHERE nom = ? " ) ;
		prepare.setString( 1 , nom ) ;
		ResultSet result = prepare.executeQuery ( ) ;
		if(result.first( ) ) {
		p = new Personnel.Builder(result.getString(nom),
				result.getString("prenom"), LocalDate.now()).build();
		}
		}catch(SQLException e ) {
		e.printStackTrace ( ) ;
		}
		return p ;
	}

	@Override
	public Personnel  update(Personnel  obj) {
		Personnel p = obj;
		try{
		PreparedStatement prepare = connect.prepareStatement (
		"Update personnel set nom =? , prenom = ? , poste= ? ,dateDeNaissance=?" ) ;
		prepare.setString(1 ,p.getNom()) ;
		prepare.setString(2 ,p.getPrenom()) ;
		prepare.setString(3 ,p.getPoste()) ;
		prepare.setString(4 ,p.getDateNaissance().toString());
		}catch(SQLException e ) {
		e.printStackTrace ( ) ;
		}
		return p ;
	}

	@Override
	public void delete(Personnel  obj) {
		try{
		PreparedStatement prepare = connect.prepareStatement (
		"Delete personnel where nom =? " ) ;
		prepare.setString(1 ,obj.getNom()) ;
		}catch(SQLException e ) {
		e.printStackTrace ( ) ;
		}
		
	}

}
