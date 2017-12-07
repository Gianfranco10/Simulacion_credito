/**
 * 
 */
package controladores;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;


import dao.UsuarioDAO;
import modelo.ObjetoNoEncontradoException;
import modelo.Usuario;
import servicios.ServicioEncriptar;


/**
 * @author Administrador
 *
 */
@ManagedBean
@SessionScoped
public class LoginControlador implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1474955314275171735L;
	private static final Logger LOGGER = Logger.getLogger(LoginControlador.class);
	private String email;
	private String password;
	private boolean error;
	private Usuario usuarioLogeado;
	private String mensaje;
	
	
	public LoginControlador(){
		this.email = "";
		this.password = "";
		this.error = true;
		this.usuarioLogeado = new Usuario();
		this.mensaje = "";
	}
	public LoginControlador(String email, String password, boolean error, Usuario usuarioLogeado, String mensaje){
		this.email = email;
		this.password = password;
		this.error = error;
		this.usuarioLogeado = usuarioLogeado;
		this.mensaje = mensaje;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public Usuario getUsuarioLogeado() {
		return usuarioLogeado;
	}
	public void setUsuarioLogeado(Usuario usuarioLogeado) {
		this.usuarioLogeado = usuarioLogeado;
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
	public static Logger getLogger() {
		return LOGGER;
	}
	public String iniciarSesion(){
		try {
			Usuario usuario = UsuarioDAO.validar(new Usuario(this.email, ServicioEncriptar.encriptar( this.password )));
			usuarioLogeado = usuario;
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);
			LOGGER.info("El usuario " + this.email + " ha iniciado sesion");
			UsuarioDAO.actualizarUltimoIngreso(usuarioLogeado);
			this.mensaje = "";
			this.error = false;
			return "perfilVista?faces-redirect=true";
		} catch (ObjetoNoEncontradoException e) {
			LOGGER.warn( "Error al iniciar sesion, datos no coinciden , " + this.email );
			LOGGER.debug( "Usuario " + this.email + " password " + this.password );
			this.error = true;
			this.mensaje = "Usuario y/o Password incorrectos";
			return "";
		} catch (Exception e) {
			LOGGER.error("Error desconocido", e);
			this.error = true;
			this.mensaje = "Ocurrio un error inesperado, intente más tarde";
			return "";
		}
	}
		
	}


