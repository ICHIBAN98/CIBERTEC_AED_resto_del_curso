package padre;

public class Licencia {
	protected String clase, categoria, fechaEmision, fechaRenovacion;

	public Licencia(String clase, String categoria, String fechaEmision, String fechaRenovacion) {
		this.clase = clase;
		this.categoria = categoria;
		this.fechaEmision = fechaEmision;
		this.fechaRenovacion = fechaRenovacion;
	}
	
	public String datosCompletos()  {
		return "clase: " + clase + "\n" + 
			   "categoría: " + categoria + "\n" +
			   "fecha de emision: " + fechaEmision + "\n" + 
			   "fecha de renovacion: " + fechaRenovacion + "\n" + 
			   "código: " + codigoGenerado();
	}
	
	private String codigoGenerado() {
		return clase+fechaEmision;
	}
	
}
