package examen;

public class Desarrollador {
	private int codigo, horasTrabajadas;
	private double tarifaHora;
	
	private static int cantidad;
	private static double suma;
	
	public static final double PORDES;
	
	static {
		cantidad=0;
		suma=0;
		PORDES=0.15;
	}

	public Desarrollador(int codigo, int horasTrabajadas, double tarifaHora) {
		this.codigo = codigo;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
		cantidad++;
		suma+=sueldoNeto();
	}
	
	public Desarrollador(int codigo, double tarifaHora) {
		this(codigo,18,tarifaHora);
	}
	
	public Desarrollador() {
		this(999,45,26.95 );
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getTarifaHora() {
		return tarifaHora;
	}

	public void setTarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Desarrollador.cantidad = cantidad;
	}

	public static double getSuma() {
		return suma;
	}

	public static void setSuma(double suma) {
		Desarrollador.suma = suma;
	}
	
	public double sueldoBruto(){
		return tarifaHora*horasTrabajadas;
	}
	
	public double descuento() {
		return PORDES*sueldoBruto();
	}
	
	public double sueldoNeto() {
		return sueldoBruto()-descuento();
	}
	
}
