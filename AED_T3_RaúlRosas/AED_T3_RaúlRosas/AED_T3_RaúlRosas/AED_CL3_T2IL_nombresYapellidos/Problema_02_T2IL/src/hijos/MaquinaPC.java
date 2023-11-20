package hijos;

public class MaquinaPC {
	private int codigo, cantidadVentiladores;
	private String marca, procesador;
	public MaquinaPC(int codigo, int cantidadVentiladores, String marca, String procesador) {
		super();
		this.codigo = codigo;
		this.cantidadVentiladores = cantidadVentiladores;
		this.marca = marca;
		this.procesador = procesador;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCantidadVentiladores() {
		return cantidadVentiladores;
	}
	public void setCantidadVentiladores(int cantidadVentiladores) {
		this.cantidadVentiladores = cantidadVentiladores;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	
	public String marcaPC() {
		if(cantidadVentiladores==2) {
			return "Corsair";
		} else if(cantidadVentiladores==4) {
			return "CoolerMaster";
		} else if(cantidadVentiladores==5) {
			return "Cougar";
		} else {
			return "AlienWare";
		}
	}
	
	public String mostrarMaquinaPC() {
		return "codigo: " + codigo + "\n" +
				"cantidad de ventiladores: " + cantidadVentiladores + "\n" +
				"marca: " + marcaPC() + "\n" +
				"procesador: " + procesador;
	}
}
