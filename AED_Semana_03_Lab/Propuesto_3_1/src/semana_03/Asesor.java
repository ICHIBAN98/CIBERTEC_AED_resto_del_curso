package semana_03;

public class Asesor {
	// Atributos privados
	private String nombreAsesor;
	private int dni, codigo;
	private double remuneracionDolares;

	// Variables privadas de clase
	private static int cantidadAsesores;
	private static double sumaRemuneraciones;

	// Variable pública constante de clase
	public static final String nombreInstitucion;

	// Bloque de inicialización para variables static
	static {
		nombreInstitucion = "Cibertec";
		cantidadAsesores = 0;
		sumaRemuneraciones = 0;
	}

	// Constructores
	public Asesor(String nombreAsesor, int dni, int codigo, double remuneracionDolares) {
		this.nombreAsesor = nombreAsesor;
		this.dni = dni;
		this.codigo = codigo;
		this.remuneracionDolares = remuneracionDolares;
		cantidadAsesores++;
		sumaRemuneraciones += remuneracionDolares;
	}

	public Asesor(String nombreAsesor, int dni) {
		this(nombreAsesor, dni, 55555, 2000.0);
	}

	public Asesor() {
		this("NN", 88888888);
	}

	// Métodos set & get
	public String getNombreAsesor() {
		return nombreAsesor;
	}

	public void setNombreAsesor(String nombreAsesor) {
		this.nombreAsesor = nombreAsesor;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getRemuneracionDolares() {
		return remuneracionDolares;
	}

	public void setRemuneracionDolares(double remuneracionDolares) {
		this.remuneracionDolares = remuneracionDolares;
	}

	public static int getCantidadAsesores() {
		return cantidadAsesores;
	}

	public static void setCantidadAsesores(int cantidadAsesores) {
		Asesor.cantidadAsesores = cantidadAsesores;
	}

	public static double getSumaRemuneraciones() {
		return sumaRemuneraciones;
	}

	public static void setSumaRemuneraciones(double sumaRemuneraciones) {
		Asesor.sumaRemuneraciones = sumaRemuneraciones;
	}
}
