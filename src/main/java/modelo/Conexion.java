/**
 * 
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 * @author Administrador
 *
 */
	public class Conexion {

		private String host;
		private int puerto;
		private String baseDeDatos;
		private String nombre;
		private String password;
		private static Connection instancia = null;
		
		private Conexion() {
			this.host = "localhost"; //127.0.0.1
			this.puerto = 3306;
			this.baseDeDatos = "simulacion_credito";
			this.nombre = "root";
			this.password = "java123";
		}

		public String getHost() {
			return host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public int getPuerto() {
			return puerto;
		}

		public void setPuerto(int puerto) {
			this.puerto = puerto;
		}

		public String getBaseDeDatos() {
			return baseDeDatos;
		}

		public void setBaseDeDatos(String baseDeDatos) {
			this.baseDeDatos = baseDeDatos;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		/**
		 * Obtiene la conexion de la base de datos.
		 * @return
		 * @throws SinConexionException 
		 */
		private static Connection obtenerConexion() throws SinConexionException{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Conexion con = new Conexion();
				Connection connection = DriverManager.
						getConnection(
		"jdbc:mysql://" + con.host+ ":" + 
				con.puerto + "/" + con.baseDeDatos, con.nombre, con.password);
				return connection;
			} catch (Exception e) {
				e.printStackTrace();
				throw new SinConexionException( "No se ha podido realizar "
						+ "la conexion hacia la base de datos " + e.getMessage() );
			}
		}
		
		

		/**
		 * @return the instancia
		 * @throws SinConexionException 
		 */
		public static Connection getInstancia() throws SinConexionException {
			if( instancia == null ){
				instancia = obtenerConexion();
			}
			return instancia;
		}


		
	}


