/**
 * 
 */
package modelo;

/**
 * @author Administrador
 *
 */
public class Cotizacion {
	private int id;
	private String fecha;
	private String banco;
	private int cuotas;
	private double tasa;
	private int monto;
	private int costoTotal;

	public Cotizacion(){
		this.id = 0;
		this.fecha = "";
		this.banco = "";
		this.cuotas = 0;
		this.tasa = 0;
		this.monto = 0;
		this.costoTotal = 0;
	}
	public Cotizacion(int id, String fecha, String banco, int cuotas, double tasa, int monto, int costoTotal){
		this.id = id;
		this.fecha = fecha;
		this.banco = banco;
		this.cuotas = cuotas;
		this.tasa = tasa;
		this.monto = monto;
		this.costoTotal = costoTotal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public int getCostoTotal() {
		return costoTotal;
	}
	public void setCostoTotal(int costoTotal) {
		this.costoTotal = costoTotal;
	}
	
}
