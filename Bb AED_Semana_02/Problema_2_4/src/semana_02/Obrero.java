package semana_02;

public class Obrero {
	private int codigo, horasTrabajadas;
	private String nombre;
	private double tarifaPorHora;
	
	public Obrero(int codigo, int horasTrabajadas, String nombre, double tarifaPorHora) {
		super();
		this.codigo = codigo;
		this.horasTrabajadas = horasTrabajadas;
		this.nombre = nombre;
		this.tarifaPorHora = tarifaPorHora;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTarifaPorHora() {
		return tarifaPorHora;
	}
	public void setTarifaPorHora(double tarifaPorHora) {
		this.tarifaPorHora = tarifaPorHora;
	}
	
	public double sueldoBruto() {
		return horasTrabajadas*tarifaPorHora;
	}
	public double dsctoAFP() {
		return 0.1*sueldoBruto();
	}
	public double dsctoEPS() {
		return 0.05*sueldoBruto();
	}
	public double sueldoNeto() {
		return sueldoBruto()-dsctoAFP()-dsctoEPS();
	}
}
