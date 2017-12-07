/**
 * 
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Conexion;
import modelo.ObjetoNoEncontradoException;
import modelo.Perfil;
import modelo.SinConexionException;

/**
 * @author Administrador
 *
 */
public class PerfilDAO {
	public static Perfil obtenerPerfil(int id) throws SQLException, SinConexionException {
		PreparedStatement st = Conexion.getInstancia().prepareStatement(
				"select * from perfil where idperfil =? ;");
		st.setInt(1,  id );
		ResultSet rs = st.executeQuery();
		if( rs.next() ){
			Perfil perfil = new Perfil();
			perfil.setId( rs.getInt("idperfil") );
			perfil.setNombre( rs.getString("nombre") );
			perfil.setPermisos( PermisoDAO.obtenerPermisos(perfil) );
			return perfil;
		}
		throw new ObjetoNoEncontradoException("El perfil no existe");
	}

}
