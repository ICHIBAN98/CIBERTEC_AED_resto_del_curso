package semana_02;

public class Computadora {
	private int codigo;
	private String marca, color;
	private double precioUSD;

	public Computadora(int codigo, String marca, String color, double precioUSD) {
		this.codigo = codigo;
		this.marca = marca;
		this.color = color;
		this.precioUSD = precioUSD;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecioUSD() {
		return precioUSD;
	}

	public void setPrecioUSD(double precioUSD) {
		this.precioUSD = precioUSD;
	}

	public double precioSoles() {
		return precioUSD * 3.35;
	}

	public double precioEuros() {
		return precioUSD / 1.2;
	}
}
