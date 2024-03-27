package semana_01;

public class Expositor {

	//Atributos públicos
	public int codigo, horasTrabajadas;
	public String nombre;
	public double tarifaHora;
	
	//Operaciones públicas
	public double sueldoBruto() {
		return horasTrabajadas*tarifaHora;
	}
	public double dsctoAFP() {
		return sueldoBruto()*0.10;
	}
	public double dsctoEPS() {
		return sueldoBruto()*0.05;
	}
	public double sueldoNeto() {
		return sueldoBruto() - dsctoAFP() - dsctoEPS();
	}
}
