package semana_03;

public class Consultor {
	private String nombre;
	private int codigo, horasTrabajadas;
	private double tarifaHora;

	private static int cantidad;
	private static double suma;

	public static final double dsctoAfp, dsctoEps;

	static {
		dsctoAfp = 0.1;
		dsctoEps = 0.05;
		cantidad = 0;
		suma = 0;
	}

	public Consultor(String nombre, int codigo, int horasTrabajadas, double tarifaHora) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
		cantidad++;
		suma += sueldoNeto();
	}

	public Consultor(int codigo, String nombre, int horasTrabajadas) {
		this(nombre, codigo, horasTrabajadas, 65.0);
	}

	public Consultor() {
		this(333, "Juan", 30);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		Consultor.cantidad = cantidad;
	}

	public static double getSuma() {
		return suma;
	}

	public static void setSuma(double suma) {
		Consultor.suma = suma;
	}
	
	public double sueldoBruto() {
		return horasTrabajadas*tarifaHora;
	}
	
	public double descuentoAFP() {
		return sueldoBruto() * dsctoAfp;
	}
	
	public double descuentoEPS() {
		return sueldoBruto() * dsctoEps;
	}
	
	public double sueldoNeto() {
		return sueldoBruto() - descuentoAFP() - descuentoEPS();
	}
}
