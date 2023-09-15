package semana_02;

public class Alumno {
	
	//  Atributos privados
	private int codigo, nota1, nota2;
	private String nombre;
	
	
	//  Constructor
	//CLICK DRECHO, SOURCE, GENERATE CONSTRUCTOR USING FIELD, SELECT ALL, GENERATE	
	public Alumno(int codigo, int nota1, int nota2, String nombre) {
		this.codigo = codigo;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nombre = nombre;
	}
	
	//métodos públicos de getters y setters
	//CLICK DERECHO, SOURCE, GENERATE GETTERS AND SETTERS
	//CLICK RERECHO, SOURCE, FORMAT para ordenar todo el código

	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public int getNota1() {
		return nota1;
	}



	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}



	public int getNota2() {
		return nota2;
	}



	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	//  Operaciones públicas
	public double promedio() {
		return (nota1 + nota2) / 2.0;
	}
	
}