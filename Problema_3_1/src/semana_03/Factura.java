package semana_03;
//OAJSNDSAJNDASJNDSAJDNA
public class Factura {

	private String ruc, empresa;
	private int unidades;
	private double precioUnitario;

	private static int cantidad;
	private static double suma;

	public static final String entidad;

	static {
		entidad = "Sunat";
		cantidad = 0;
		suma = 0;
	}

	public Factura(String ruc, String empresa, int unidades, double precioUnitario) {
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precioUnitario = precioUnitario;
		cantidad++;
		suma += importeFacturado();
	}

	public Factura(String ruc, String empresa) {
		this(ruc, empresa, 10, 50.0);
	}
	public Factura() {
		this("11111111111", "MN-Global SRL");
	}
	public String getRuc() {
		return ruc;
	}
	
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Factura.cantidad = cantidad;
	}

	public static double getSuma() {
		return suma;
	}

	public static void setSuma(double suma) {
		Factura.suma = suma;
	}
	
	public double importeFacturado() {
		return unidades*precioUnitario;
	}
	
}
