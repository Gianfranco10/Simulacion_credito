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
public class ResultadoCotizacionControlador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8493138904503233599L;
private String rut;
private String nombre;
private String fecha;
private String banco;
private int montoSolicitado;
private int cuotas;
private double tasa;
private int costoTotalCredito;
public ResultadoCotizacionControlador(){
	this.rut = "";
	this.nombre = "";
	this.fecha = "";
	this.banco = "";
	this.montoSolicitado = 0;
	this.cuotas = 0;
	this.tasa = 0;
	this.costoTotalCredito = 0;
}
public ResultadoCotizacionControlador(String rut, String nombre, String fecha, String banco, int montoSolicitado, int cuotas, double tasa, int costoTotalCredito){
this.rut = rut;
this.nombre = nombre;
this.fecha = fecha;
this.banco = banco;
this.montoSolicitado = montoSolicitado;
this.cuotas = cuotas;
this.tasa = tasa;
this.costoTotalCredito = costoTotalCredito;
}
public String getRut() {
	return rut;
}
public void setRut(String rut) {
	this.rut = rut;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public String getBanco() {
	return banco;
}
public void setBanco(String banco) {
	this.banco = banco;
}
public int getMontoSolicitado() {
	return montoSolicitado;
}
public void setMontoSolicitado(int montoSolicitado) {
	this.montoSolicitado = montoSolicitado;
}
public int getCuotas() {
	return cuotas;
}
public void setCuotas(int cuotas) {
	this.cuotas = cuotas;
}
public double getTasa() {
	return tasa;
}
public void setTasa(double tasa) {
	this.tasa = tasa;
}
public int getCostoTotalCredito() {
	return costoTotalCredito;
}
public void setCostoTotalCredito(int costoTotalCredito) {
	this.costoTotalCredito = costoTotalCredito;
}

}
