package semana_02;

public class Pelota {
	private String marca;
	private double pesoGramos, presionLibras, diametroCentimetros, precio;
	
	public Pelota(String marca, double pesoGramos, double presionLibras, double diametroCentimetros, double precio) {
		super();
		this.marca = marca;
		this.pesoGramos = pesoGramos;
		this.presionLibras = presionLibras;
		this.diametroCentimetros = diametroCentimetros;
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPesoGramos() {
		return pesoGramos;
	}
	public void setPesoGramos(double pesoGramos) {
		this.pesoGramos = pesoGramos;
	}
	public double getPresionLibras() {
		return presionLibras;
	}
	public void setPresionLibras(double presionLibras) {
		this.presionLibras = presionLibras;
	}
	public double getDiametroCentimetros() {
		return diametroCentimetros;
	}
	public void setDiametroCentimetros(double diametroCentimetros) {
		this.diametroCentimetros = diametroCentimetros;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//operaciones
	public double radio() {
		return diametroCentimetros/2;
	}
	public double volumen() {
		return 4 * 3.1416 * radio() * radio() * radio() / 3;
	}
	public double dscto() {
		return precio*0.1;
	}
	public double importePagar() {
		return precio-dscto();	
	}
}
