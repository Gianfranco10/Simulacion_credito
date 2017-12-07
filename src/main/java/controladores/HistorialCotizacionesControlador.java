/**
 * 
 */
package controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import modelo.Cotizacion;

/**
 * @author Administrador
 *
 */
@ManagedBean
@SessionScoped
public class HistorialCotizacionesControlador implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 6365498526812691581L;
	
private List <Cotizacion> cotizaciones;


public static long getSerialversionuid() {
	return serialVersionUID;
}

public HistorialCotizacionesControlador(){
	this.cotizaciones = new ArrayList<Cotizacion>();
	cotizaciones.add(new Cotizacion(123456789, "12 de septiembre del 2017","Banco de chile", 24, 12.5, 4000000, 100000));
}

public List<Cotizacion> getCotizaciones() {
	return cotizaciones;
}

public void setCotizaciones(List<Cotizacion> cotizaciones) {
	this.cotizaciones = cotizaciones;
}

}


