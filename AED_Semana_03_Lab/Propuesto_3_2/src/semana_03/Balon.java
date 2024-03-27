package semana_03;

public class Balon {
	private String marca;
	private double pesoGramos, presionLibras, diametroCm, precio;

	private static int cantidad;
	private static double suma;

	public static final double pi, descuento;

	static {
		pi = 3.1416;
		descuento = 0.05;
		cantidad = 0;
		suma = 0;
	}

	public Balon(String marca, double pesoGramos, double presionLibras, double diametroCm, double precio) {
		this.marca = marca;
		this.pesoGramos = pesoGramos;
		this.presionLibras = presionLibras;
		this.diametroCm = diametroCm;
		this.precio = precio;
		cantidad++;
		suma += precio;
	}

	public Balon(String marca, double pesoGramos, double presionLibras) {
		this(marca, pesoGramos, presionLibras, 18.5, 100.0);
	}

	public Balon() {
		this("Adidas", 1.5, 4.8);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPesoGramos() {
		return pesoGramos;
	}

	public void setPesoGramos(double pesoGramos) {
		this.pesoGramos = pesoGramos;
	}

	public double getPresionLibras() {
		return presionLibras;
	}

	public void setPresionLibras(double presionLibras) {
		this.presionLibras = presionLibras;
	}

	public double getDiametroCm() {
		return diametroCm;
	}

	public void setDiametroCm(double diametroCm) {
		this.diametroCm = diametroCm;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Balon.cantidad = cantidad;
	}

	public static double getSuma() {
		return suma;
	}

	public static void setSuma(double suma) {
		Balon.suma = suma;
	}
	
	public double radio() {
		return diametroCm/2;
	}
	
	public double volumen() {
		return 4 * pi * radio() * radio() * radio() / 3;
	}
	
	public double descuento() {
		return precio*descuento;
	}
	
	public double importePagar() {
		return precio - descuento();
	}

}
