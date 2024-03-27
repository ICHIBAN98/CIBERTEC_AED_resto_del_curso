package semana_06;

public class ArregloTemperaturas {
	private double [] temperatura;
	private int indice;
	
	public ArregloTemperaturas(){
		temperatura = new double [10];
		indice=0;
	}
	
	public int tamanio() {
		return indice;
	}
	
	public double obtener(int i) {
		return temperatura[i];
	}

	private void ampliarArreglo() {
		double[] aux = temperatura;
		temperatura = new double[indice + 10];
		for (int i = 0; i < indice; i++) {
			temperatura[i] = aux[i];
		}
	}
	
	public void adicionar(double n) {
		if (indice == temperatura.length) {
			ampliarArreglo();
		}
		temperatura[indice] = n;
		indice++;
	}
	
	public void eliminarAlFinal() {
		indice--;
	}
	
	public void eliminarTodo() {
		indice = 0;
	}
	
	public double temperaturaMenor() {
		double menor = temperatura[0];
		for(int i=1;i<indice;i++) {
			if(temperatura[i]<menor) {
				menor=temperatura[i];
			}
		}
		return menor;
	}
	
	public int posPrimeraTemperaturaNormal() {
		int contador = 0;
		for(double t:temperatura) {
			if(t>= 36.1 && t<=37.2) {
				return contador;
			}
			contador++;
		}
		return -1;
	}
	
	public void remplazarPrimeraTemperaturaNormal() {
		if(posPrimeraTemperaturaNormal()!=-1) {
			temperatura[posPrimeraTemperaturaNormal()]=temperaturaMenor();
		}
	}
	
	public void incrementarTemperaturas() {
		int contador=0;
		for(double t:temperatura) {
			temperatura[contador] = t + 0.2;
			contador++;
		}
	}
	
}
