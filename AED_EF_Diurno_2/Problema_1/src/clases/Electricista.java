package clases;

public class Electricista {
	private String nombre;
	private int edad;
	private double tarifa;
	private int conexiones;

	public Electricista(String nombre, int edad, double tarifa, int conexiones) {
		this.nombre = nombre;
		this.edad = edad;
		this.tarifa = tarifa;
		this.conexiones = conexiones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public int getConexiones() {
		return conexiones;
	}

	public void setConexiones(int conexiones) {
		this.conexiones = conexiones;
	}

	public double sueldo() {
		return tarifa * conexiones;
	}
}
