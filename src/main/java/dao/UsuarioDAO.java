/**
 * 
 */
package dao;

/**
 * @author Administrador
 *
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import modelo.Conexion;
import modelo.ObjetoNoEncontradoException;
import modelo.Perfil;
import modelo.SinConexionException;
import modelo.Usuario;


/**
 * @author jmaldonado
 *
 */
public class UsuarioDAO {

	/**
	 * 
	 * @param usuario
	 * @return
	 * @throws SQLException
	 * @throws SinConexionException
	 */
	public static Usuario validar(Usuario usuario) throws SQLException, SinConexionException {
		PreparedStatement st = Conexion.getInstancia().prepareStatement(
				"select * from usuario where "+
				"email =?  AND "+  
				"hash_password = ?;");
		st.setString(1,  usuario.getEmail() );
		st.setString(2,  usuario.getPassword() );
		ResultSet rs = st.executeQuery();
		if( rs.next() ){
//			Perfil perfil =PerfilDAO.obtenerPerfil( rs.getInt("perfil_nombre") ) ;
			usuario.setPerfil( new Perfil( rs.getString("perfil_nombre") ));
			usuario.setUltimoIngreso( rs.getDate("ultimoIngreso") );
			usuario.setIntentosFallidos(  rs.getInt("intentosFallidos" ) );
			return usuario;
		}
		throw new ObjetoNoEncontradoException("Usuario y/o password incorrectos");
	}

	/**
	 * 
	 * @return
	 * @throws SinConexionException 
	 * @throws SQLException 
	 */
	public static List<Usuario> obtenerUsuarios() throws SQLException, SinConexionException {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		PreparedStatement st = Conexion.getInstancia().prepareStatement(
				"select * from usuario");
		ResultSet rs = st.executeQuery();
		while( rs.next() ){
			Usuario usuario = new Usuario();
			Perfil perfil =PerfilDAO.obtenerPerfil( rs.getInt("perfil_nombre") ) ;
			usuario.setPerfil(perfil);
			usuario.setNombreUsuario( rs.getString("nombre") );
			usuario.setEdad(rs.getInt("edad"));
			usuario.setRut(rs.getInt("rut"));
			usuario.setEmail(rs.getString("email"));
			usuario.setPassword(rs.getString("hash_password"));
			usuario.setUltimoIngreso( rs.getTimestamp("ultimoIngreso") );
			usuario.setIntentosFallidos(  rs.getInt("intentosFallidos" ) );
			usuarios.add( usuario );
		}
		return usuarios;
	}

	/**
	 * 
	 * @param usuario
	 * @throws SinConexionException 
	 * @throws SQLException 
	 */
	public static void eliminarUsuario(Usuario usuario) throws SQLException, SinConexionException {
		PreparedStatement st = Conexion.getInstancia().prepareStatement(
				"delete from usuario where nombre = ?;");
		st.setString(1, usuario.getNombreUsuario() );
		st.executeUpdate();
	}
	
	/**
	 * 
	 * @param usuario
	 * @throws SQLException
	 * @throws SinConexionException
	 */
	public static void actualizarUltimoIngreso( Usuario usuario ) throws SQLException, SinConexionException{
		PreparedStatement st = Conexion.getInstancia().prepareStatement(
				"update usuario set ultimoIngreso=? where nombre = ?;");
		st.setTimestamp(1, new Timestamp( new java.util.Date().getTime()  ));
//		st.setDate(1, new Date( new java.util.Date().getTime() ));
		st.setString( 2, usuario.getNombreUsuario());
		st.executeUpdate();
	}
	public static void agregarUsuario(Usuario usuario) throws SQLException, SinConexionException {
		PreparedStatement st = Conexion.getInstancia().prepareStatement(
				"insert into usuario (rut, hash_password, nombre, email, edad, perfil_nombre) values(?,?,?,?,?,?);");
		st.setInt(1,usuario.getRut()) ;
		st.setString(2,usuario.getPassword() );
		st.setString(3,usuario.getNombreUsuario() );
		st.setString(4,usuario.getEmail() );
		st.setInt(5,usuario.getEdad() );
		st.setString(6, usuario.getPerfil().getNombre());
		st.executeUpdate();
	}
}



