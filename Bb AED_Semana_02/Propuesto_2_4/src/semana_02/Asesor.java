package semana_02;

public class Asesor {
	private String nombre;
	private int codigo, horasTrabajadas;
	private double tarifaHora;

	public Asesor(String nombre, int codigo, int horasTrabajadas, double tarifaHora) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
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
	
	//operaciones
	public double sueldoBruto() {
		return horasTrabajadas*tarifaHora;
	}
	public double descuento() {
		return sueldoBruto()*0.15;
	}
	public double sueldoNeto() {
		return sueldoBruto() - descuento();
	}
}
