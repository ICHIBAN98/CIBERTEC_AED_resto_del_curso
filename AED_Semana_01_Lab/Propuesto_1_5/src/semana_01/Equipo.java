package semana_01;

public class Equipo {

	//Atributos p�blicos
	public int codigo;
	public String marca, color;
	public double precioUSD;
	
	//Operaciones p�blicas
	public double precioSoles() {
		return precioUSD*3.59;
	}
	public double precioEuros() {
		return precioUSD/1.20;
	}
	
}
