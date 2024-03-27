package semana_02;

public class Paciente {
	// Atributos PRIVADOS
	private String nombre, apellido;
	private int edad;
	private double tallaMetros, peso;

	// constructor
	public Paciente(String nombre, String apellido, int edad, double tallaMetros, double peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.tallaMetros = tallaMetros;
		this.peso = peso;
	}

	// métodos getters 6 setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getTallaMetros() {
		return tallaMetros;
	}

	public void setTallaMetros(double tallaMetros) {
		this.tallaMetros = tallaMetros;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// operaciones
	public String mayorMenor() {
		if (edad > 18) {
			return "Mayor de edad";
		} else {
			return "Menor de edad";
		}
	}
}
