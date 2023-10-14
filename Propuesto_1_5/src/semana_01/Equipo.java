package semana_01;

public class Equipo {

	//Atributos públicos
	public int codigo;
	public String marca, color;
	public double precioUSD;
	
	//Operaciones públicas
	public double precioSoles() {
		return precioUSD*3.59;
	}
	public double precioEuros() {
		return precioUSD/1.20;
	}
	
}
