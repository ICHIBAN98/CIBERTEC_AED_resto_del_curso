package hijos;
import padre.Licencia;

public class Particular extends Licencia{
	private int dni;

	public Particular(String clase, String categoria, String fechaEmision, String fechaRenovacion, int dni) {
		super(clase, categoria, fechaEmision, fechaRenovacion);
		this.dni = dni;
	}
	
	public String datosCompletos()  {
		return super.datosCompletos() + "\n" + 
				"DNI: " + dni + "\n" +
				"segundo código: " + segundoCodigo();
	}
	
	private String segundoCodigo() {
		return categoria + dni;
	}
}
