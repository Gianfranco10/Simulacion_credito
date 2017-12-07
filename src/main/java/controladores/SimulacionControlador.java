/**
 * 
 */
package controladores;

import java.io.Serializable;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import dao.BancoDAO;
import modelo.Banco;
import modelo.SinConexionException;

/**
 * @author Administrador
 *
 */
@ManagedBean
@RequestScoped
public class SimulacionControlador implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 179522244509249641L;
	private static final Logger LOGGER = Logger.getLogger(SimulacionControlador.class);
	private int rut;
	private int monto;
	private int plazo;
	private String email;
	private int rentaLiquida;
	private String banco;
	private String mensaje;
	private boolean error;

	public SimulacionControlador() {
		this.rut = 0;
		this.monto = 0;
		this.plazo = 0;
		this.email = "";
		this.rentaLiquida = 0;
		this.banco = "";
		this.mensaje = "";
		this.error = true;
	}

	public SimulacionControlador(String mensaje, boolean error, int rut, int monto, int plazo, String email,
			int rentaLiquida, String banco) {
		this.rut = rut;
		this.monto = monto;
		this.plazo = plazo;
		this.email = email;
		this.rentaLiquida = rentaLiquida;
		this.banco = banco;
		this.mensaje = mensaje;
		this.error = error;
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

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void simular() {
		try {
			if (this.rentaLiquida >= 250000){
				Banco banco = BancoDAO.obtenerBanco(this.banco);
				double interesI = this.monto * this.plazo * banco.getTasa();
				int montoPagar = this.monto *
				System.out.println( interesI );
			}
		} catch (Exception e) {
			LOGGER.error("Error desconocido", e);
			this.error = true;
			this.mensaje = "Ocurrio un error inesperado, intente más tarde";
		}
	}
}