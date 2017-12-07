/**
 * 
 */
package controladores;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import dao.UsuarioDAO;
import modelo.Perfil;
import modelo.Usuario;
import servicios.ServicioEncriptar;

/**
 * @author Administrador
 *
 */
@ManagedBean
@SessionScoped
public class RegistrarControlador implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5628475247989489509L;
	private static final Logger LOGGER = Logger.getLogger(RegistrarControlador.class);
	private int rut;
	private String password;
	private String repetirPassword;
	private String nombre;
	private String email;
	private int edad;
	private String mensaje;
	private boolean error;
	
	public RegistrarControlador(){
		this.rut = 0;
		this.password = "";
		this.repetirPassword = "";
		this.nombre = "";
		this.email = "";
		this.edad = 0;
		this.mensaje = "";
		this.error = true;
	}
	public RegistrarControlador(boolean error, int rut, String password, String repetirPassword, String nombre, String email, int edad, String mensaje){
		this.rut = rut;
		this.password = password;
		this.repetirPassword = repetirPassword;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.mensaje = mensaje;
		this.error = error;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepetirPassword() {
		return repetirPassword;
	}
	public void setRepetirPassword(String repetirPassword) {
		this.repetirPassword = repetirPassword;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	} 
	
	
	public String registrar(){
		try {
			Usuario usuario = new Usuario();
			usuario.setRut(this.getRut());
			usuario.setNombreUsuario(this.getNombre());
			usuario.setEmail(this.getEmail());
			usuario.setEdad(this.getEdad());
			usuario.setPassword( ServicioEncriptar.encriptar(this.password) );
			usuario.setPerfil( new Perfil( "usuario" ) );
			UsuarioDAO.agregarUsuario(usuario);
			return "login?faces-redirect=true";
		}  catch (Exception e) {
			LOGGER.error("Error desconocido", e);
			this.error = true;
			this.mensaje = "Ocurrio un error inesperado, intente más tarde";
			return "";
		}
	}

}
