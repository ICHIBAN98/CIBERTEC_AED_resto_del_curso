package hijos;

import padre.Chofer;

public class ChoferASueldoFijo extends Chofer{
	private int categoria;

	public ChoferASueldoFijo(int codigo, int aniosExp, String nombre, String tipoLicencia, int categoria) {
		super(codigo, aniosExp, nombre, tipoLicencia);
		this.categoria = categoria;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public double sueldo() {
		if(categoria==1) {
			return 1600;
		}else if(categoria == 2) {
			return 1750;
		}else if(categoria==3) {
			return 1900;
		}else {
			return 2050;
		}
	}
	
	public String caracterizar() {
		return super.caracterizar()+"-"+categoria;
	}
}
