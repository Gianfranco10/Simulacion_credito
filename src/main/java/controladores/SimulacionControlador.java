/**
 * 
 */
package controladores;

/**
 * @author Administrador
 *
 */
public class SimulacionControlador {
private int rut;
private int monto;
private int plazo;
private String email;
private int rentaLiquida;
private String banco;

public SimulacionControlador(){
	this.rut = 0;
	this.monto = 0;
	this.plazo = 0;
	this.email = "";
	this.rentaLiquida= 0;
	this.banco = "";
}

public SimulacionControlador(int rut, int monto, int plazo, String email, int rentaLiquida, String banco){
	this.rut = rut;
	this.monto = monto;
	this.plazo = plazo;
	this.email = email;
	this.rentaLiquida = rentaLiquida;
	this.banco = banco;
}

public int getRut() {
	return rut;
}

public void setRut(int rut) {
	this.rut = rut;
}

public int getMonto() {
	return monto;
}

public void setMonto(int monto) {
	this.monto = monto;
}

public int getPlazo() {
	return plazo;
}

public void setPlazo(int plazo) {
	this.plazo = plazo;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getRentaLiquida() {
	return rentaLiquida;
}

public void setRentaLiquida(int rentaLiquida) {
	this.rentaLiquida = rentaLiquida;
}

public String getBanco() {
	return banco;
}

public void setBanco(String banco) {
	this.banco = banco;
}
public void Simular(){
	
}
}
