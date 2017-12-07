/**
 * 
 */
package controladores;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Administrador
 *
 */
@ManagedBean
@SessionScoped
public class ModificarPerfilControlador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7167490020012569745L;
private String nuevoNombre;
private String nuevoPassword;
private String nuevaContraseña;
private String repetirContraseña;

public ModificarPerfilControlador (){
	this.nuevoNombre = "";
	this.nuevoPassword = "";
	this.nuevaContraseña = "";
	this.repetirContraseña = "";
	
}
public ModificarPerfilControlador (String nuevoNombre, String nuevoPassword, String nuevaContraseña, String repetirContraseña){
	this.nuevoNombre = nuevoNombre;
	this.nuevoPassword = nuevoPassword;
	this.nuevaContraseña = nuevaContraseña;
	this.repetirContraseña = repetirContraseña;
}
public String getNuevoNombre() {
	return nuevoNombre;
}
public void setNuevoNombre(String nuevoNombre) {
	this.nuevoNombre = nuevoNombre;
}
public String getNuevoPassword() {
	return nuevoPassword;
}
public void setNuevoPassword(String nuevoPassword) {
	this.nuevoPassword = nuevoPassword;
}
public String getNuevaContraseña() {
	return nuevaContraseña;
}
public void setNuevaContraseña(String nuevaContraseña) {
	this.nuevaContraseña = nuevaContraseña;
}
public String getRepetirContraseña() {
	return repetirContraseña;
}
public void setRepetirContraseña(String repetirContraseña) {
	this.repetirContraseña = repetirContraseña;
}

}
