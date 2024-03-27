package semana_03;

public class Empleado {
	private int codigo, categoria, numCel;
	private String nombre;
	
	private static int cantidad;
	private static double suma;
	
	public static final double descuento;
	
	static {
		descuento = 0.15;
		cantidad=0;
		suma=0;
	}

	public Empleado(int codigo, int categoria, int numCel, String nombre) {
		this.codigo = codigo;
		this.categoria = categoria;
		this.numCel = numCel;
		this.nombre = nombre;
		cantidad++;
		suma+=sueldoNeto();
	}
	
	public Empleado(int codigo, String nombre) {
		this(codigo,2,999999999,nombre);
	}
	
	public Empleado() {
		this(4444,"Ninguno");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getNumCel() {
		return numCel;
	}

	public void setNumCel(int numCel) {
		this.numCel = numCel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Empleado.cantidad = cantidad;
	}

	public static double getSuma() {
		return suma;
	}

	public static void setSuma(double suma) {
		Empleado.suma = suma;
	}
	
	public double sueldoBruto() {
		if(categoria==0) {
			return 7200;
		}else if(categoria==1) {
			return 6300;
		}else {
			return 5100;
		}
	}
	
	public double descuento() {
		return sueldoBruto()*descuento;
	}
	
	public double sueldoNeto() {
		return sueldoBruto()-descuento();
	}
}
