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
private String nuevaContrase�a;
private String repetirContrase�a;

public ModificarPerfilControlador (){
	this.nuevoNombre = "";
	this.nuevoPassword = "";
	this.nuevaContrase�a = "";
	this.repetirContrase�a = "";
	
}
public ModificarPerfilControlador (String nuevoNombre, String nuevoPassword, String nuevaContrase�a, String repetirContrase�a){
	this.nuevoNombre = nuevoNombre;
	this.nuevoPassword = nuevoPassword;
	this.nuevaContrase�a = nuevaContrase�a;
	this.repetirContrase�a = repetirContrase�a;
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
public String getNuevaContrase�a() {
	return nuevaContrase�a;
}
public void setNuevaContrase�a(String nuevaContrase�a) {
	this.nuevaContrase�a = nuevaContrase�a;
}
public String getRepetirContrase�a() {
	return repetirContrase�a;
}
public void setRepetirContrase�a(String repetirContrase�a) {
	this.repetirContrase�a = repetirContrase�a;
}

}
