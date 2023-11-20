package clase;

public class Libro {
	private int codigo;
	private String titulo, editorial;
	private double precio;
	public Libro(int codigo, String titulo, String editorial, double precio) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.editorial = editorial;
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String tituloDeVenta(){
		return titulo + " | " + editorial + " TM";
	}
	
	
}
