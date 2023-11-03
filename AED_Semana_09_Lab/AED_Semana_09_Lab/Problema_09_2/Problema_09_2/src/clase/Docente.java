package clase;

public class Docente {
	private int codigo,hora;
	private String nombre;
	private double tarifa;
	
	public Docente(int codigo, int hora, String nombre, double tarifa) {
		this.codigo = codigo;
		this.hora = hora;
		this.nombre = nombre;
		this.tarifa = tarifa;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	public double sueldo(){
		return hora*tarifa;
	}
	
}
