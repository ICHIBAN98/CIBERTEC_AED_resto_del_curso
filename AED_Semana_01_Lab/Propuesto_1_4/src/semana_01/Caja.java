package semana_01;

public class Caja {

	//Atributos públicos
	public double largoCm, anchoCm, altoCm, pesoKg;
	
	//Operaciones públicas
	public double volumenCajaCc() {
		return largoCm*altoCm*anchoCm;
	}
	public double pesoVolKg() {
		return volumenCajaCc()/5000;
	}
	public double pesoFacturable() {
		if(pesoKg > pesoVolKg()) {
			return pesoKg;
		} else {
			return pesoVolKg();
		}
	}
	
}
