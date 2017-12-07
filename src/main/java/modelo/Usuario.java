/**
 * 
 */
package modelo;

import java.util.Date;

/**
 * @author Administrador
 *
 */
public class Usuario {
		private String nombreUsuario;
		private String password;
		private int rut;
		private String email;
		private int edad;
		private int intentosFallidos;
		private Date ultimoIngreso;
		private Perfil perfil;
		
		public Usuario() {
			
		}
		
		
		/**
		 * @param nombreUsuario
		 * @param password
		 * @param intentosFallidos
		 */
		public Usuario(String nombreUsuario, String password, int rut, String email, int edad) {
			super();
			this.nombreUsuario = nombreUsuario;
			this.password = password;
			this.rut = rut;
			this.email = email;
			this.edad = edad;
		}



		public Usuario(String email, String password) {
			this.password = password;
			this.email = email;
			// TODO Auto-generated constructor stub
		}


		/**
		 * @return the nombreUsuario
		 */
		public String getNombreUsuario() {
			return nombreUsuario;
		}

		/**
		 * @param nombreUsuario the nombreUsuario to set
		 */
		public void setNombreUsuario(String nombreUsuario) {
			this.nombreUsuario = nombreUsuario;
		}

		/**
		 * @return the password
		 */
		public String getPassword() {
			return password;
		}

		/**
		 * @param password the password to set
		 */
		public void setPassword(String password) {
			this.password = password;
		}

		/**
		 * @return the intentosFallidos
		 */
		public int getIntentosFallidos() {
			return intentosFallidos;
		}

		/**
		 * @param intentosFallidos the intentosFallidos to set
		 */
		public void setIntentosFallidos(int intentosFallidos) {
			this.intentosFallidos = intentosFallidos;
		}



		/**
		 * @return the ultimoIngreso
		 */
		public Date getUltimoIngreso() {
			return ultimoIngreso;
		}



		/**
		 * @param ultimoIngreso the ultimoIngreso to set
		 */
		public void setUltimoIngreso(Date ultimoIngreso) {
			this.ultimoIngreso = ultimoIngreso;
		}



		/**
		 * @return the perfil
		 */
		public Perfil getPerfil() {
			return perfil;
		}



		/**
		 * @param perfil the perfil to set
		 */
		public void setPerfil(Perfil perfil) {
			this.perfil = perfil;
		}


		public int getRut() {
			return rut;
		}


		public void setRut(int rut) {
			this.rut = rut;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public int getEdad() {
			return edad;
		}


		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		
		
	}


