package semana_02;

public class Empleado {
	// Atributos PRIVADOS
	private String nombre;
	private int codigo, numCel;
	private double sueldoSoles;

	// constructor
	public Empleado(String nombre, int codigo, int numCel, double sueldoSoles) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.numCel = numCel;
		this.sueldoSoles = sueldoSoles;
	}

	// métodos getters & setters
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

	public int getNumCel() {
		return numCel;
	}

	public void setNumCel(int numCel) {
		this.numCel = numCel;
	}

	public double getSueldoSoles() {
		return sueldoSoles;
	}

	public void setSueldoSoles(double sueldoSoles) {
		this.sueldoSoles = sueldoSoles;
	}

	// operaciones
	public String rango() {
		if (sueldoSoles == 3500) {
			return "sueldo igual a 3500";
		} else if (sueldoSoles > 3500) {
			return "sueldo mayor a 3500";
		} else {
			return "sueldo menor a 3500";
		}
	}

}
