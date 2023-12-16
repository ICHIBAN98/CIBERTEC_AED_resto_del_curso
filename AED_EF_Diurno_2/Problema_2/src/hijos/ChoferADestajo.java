package hijos;

import padre.Chofer;

public class ChoferADestajo extends Chofer{
	private int numViajes;
	private double tarifaPorViaje;
	
	public ChoferADestajo(int codigo, int aniosExp, String nombre, String tipoLicencia, int numViajes, double tarifaPorViaje) {
		super(codigo, aniosExp, nombre, tipoLicencia);
		this.numViajes = numViajes;
		this.tarifaPorViaje = tarifaPorViaje;
	}

	public int getNumViajes() {
		return numViajes;
	}

	public void setNumViajes(int numViajes) {
		this.numViajes = numViajes;
	}

	public double getTarifaPorViaje() {
		return tarifaPorViaje;
	}

	public void setTarifaPorViaje(double tarifaPorViaje) {
		this.tarifaPorViaje = tarifaPorViaje;
	}

	public double sueldo() {
		return numViajes*tarifaPorViaje;
	}	
	
	public String caracterizar() {
		return super.caracterizar()+"-"+numViajes+"-"+tarifaPorViaje;
	}
	
}
