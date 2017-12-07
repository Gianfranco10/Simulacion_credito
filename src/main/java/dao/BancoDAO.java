package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Banco;
import modelo.Conexion;
import modelo.SinConexionException;

public class BancoDAO {
	public static List<Banco> obtenerBancos() throws SQLException, SinConexionException {
		List<Banco> bancos = new ArrayList<Banco>();
		PreparedStatement st = Conexion.getInstancia().prepareStatement("select * from banco");
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			Banco banco = new Banco();
			banco.setId_banco(rs.getInt("id_banco"));
			banco.setNombre(rs.getString("nombre"));
			banco.setTasa(rs.getDouble("tasa"));
			bancos.add(banco);
		}
		return bancos;

	}
	
	/**
	 * 
	 * @param nombreBanco
	 * @return
	 * @throws SQLException
	 * @throws SinConexionException
	 */
	public static Banco obtenerBanco( String nombreBanco ) throws SQLException, SinConexionException {
		PreparedStatement st = Conexion.getInstancia().prepareStatement("select * from banco where id_banco = ?");
		st.setString(1, nombreBanco);
		ResultSet rs = st.executeQuery();
		if (rs.next()) {
			Banco banco = new Banco();
			banco.setId_banco(rs.getInt("id_banco"));
			banco.setNombre(rs.getString("nombre"));
			banco.setTasa(rs.getDouble("tasa"));
			return banco;
		}
		return null;

	}

}
