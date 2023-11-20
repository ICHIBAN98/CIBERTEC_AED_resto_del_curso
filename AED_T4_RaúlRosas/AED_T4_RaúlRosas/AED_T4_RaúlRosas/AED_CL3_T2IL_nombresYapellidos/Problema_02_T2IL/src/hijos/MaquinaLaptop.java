package hijos;

public class MaquinaLaptop {
	private int codigo;
	private String marca,procesador;
	private double largo, ancho;
	public MaquinaLaptop(int codigo, String marca, String procesador, double largo, double ancho) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.procesador = procesador;
		this.largo = largo;
		this.ancho = ancho;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	public double areaLaptop() {
		return largo*ancho;
	}
	
	public String mostrarMaquinaLaptop() {
		return "codigo: " + codigo + "\n" +
				"marca: " + marca + "\n" +
				"procesador: " + procesador + "\n" +
				"largo: " + largo + "cm" + "\n" +
				"ancho: " + ancho + "cm";
	}
}
