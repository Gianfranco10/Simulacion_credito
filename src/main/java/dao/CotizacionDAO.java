/**
 * 
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import modelo.Conexion;
import modelo.Cotizacion;
import modelo.SinConexionException;

/**
 * @author Administrador
 *
 */
public class CotizacionDAO {
		public static List<Cotizacion> obtenerCotizacion() throws SQLException, SinConexionException {
			List<Cotizacion> cotizaciones = new ArrayList<Cotizacion>();
			PreparedStatement st = Conexion.getInstancia().prepareStatement("select * from banco");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Cotizacion cotizacion = new Cotizacion();
				cotizacion.setId(rs.getInt("id"));
				cotizacion.setFecha(rs.getString("fecha"));
				cotizacion.setBanco(rs.getString("banco"));
				cotizacion.setCuotas(rs.getInt("cuotas"));
				cotizacion.setTasa(rs.getDouble("tasa"));
				cotizacion.setMonto(rs.getInt("monto"));
				cotizacion.setCostoTotal(rs.getInt("costoTotal"));
				cotizaciones.add(cotizacion);
			}
			return cotizaciones;
		}
}
