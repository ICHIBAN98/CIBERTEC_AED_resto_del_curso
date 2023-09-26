package semana_02;

public class Edificio {
	private int codigo, numeroApartamentos,cantPisos;
	private double precioDptoUSD;
	public Edificio(int codigo, int numeroApartamentos, int cantPisos, double precioDptoUSD) {
		this.codigo = codigo;
		this.numeroApartamentos = numeroApartamentos;
		this.cantPisos = cantPisos;
		this.precioDptoUSD = precioDptoUSD;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumeroApartamentos() {
		return numeroApartamentos;
	}
	public void setNumeroApartamentos(int numeroApartamentos) {
		this.numeroApartamentos = numeroApartamentos;
	}
	public int getCantPisos() {
		return cantPisos;
	}
	public void setCantPisos(int cantPisos) {
		this.cantPisos = cantPisos;
	}
	public double getPrecioDptoUSD() {
		return precioDptoUSD;
	}
	public void setPrecioDptoUSD(double precioDptoUSD) {
		this.precioDptoUSD = precioDptoUSD;
	}
	
	public double precioUSDEdificio() {
		return numeroApartamentos*precioDptoUSD;
	}
}
