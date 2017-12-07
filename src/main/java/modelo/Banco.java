/**
 * 
 */
package modelo;

/**
 * @author Administrador
 *
 */
public class Banco {
	private int id_banco;
	private String nombre;
	private double tasa;
	
public Banco(){
	this.id_banco = 0;
	this.nombre = "";
	this.tasa = 0;
}
public Banco (int id_banco, String nombre, double tasa){
	this.id_banco = id_banco;
	this.nombre = nombre;
	this.tasa = tasa;
}
public int getId_banco() {
	return id_banco;
}
public void setId_banco(int id_banco) {
	this.id_banco = id_banco;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getTasa() {
	return tasa;
}
public void setTasa(double tasa) {
	this.tasa = tasa;
}

}
