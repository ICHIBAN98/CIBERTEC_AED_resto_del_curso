package semana_03;

public class Movil {
	private int numero, segundos;
	private String nombre;
	private double precioS;
	
	private static int cantidad;
	private static double suma;
	
	public static final double IGV;
	
	static {
		IGV=0.18;
		cantidad=0;
		suma=0;
	}

	public Movil(int numero, int segundos, String nombre, double precioS) {
		this.numero = numero;
		this.segundos = segundos;
		this.nombre = nombre;
		this.precioS = precioS;
		cantidad++;
		suma+=importePagar();
	}
	
	public Movil(int numero, String nombre) {
		this(numero, 75, nombre, 0.28);
	}
	
	public Movil() {
		this(987656789,"Juan");
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioS() {
		return precioS;
	}

	public void setPrecioS(double precioS) {
		this.precioS = precioS;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Movil.cantidad = cantidad;
	}

	public static double getSuma() {
		return suma;
	}

	public static void setSuma(double suma) {
		Movil.suma = suma;
	}
	
	public double costoConsumo() {
		return segundos*precioS;
	}
	
	public double IGV() {
		return IGV*costoConsumo();
	}
	
	public double importePagar() {
		return costoConsumo() + IGV();
	}
}
