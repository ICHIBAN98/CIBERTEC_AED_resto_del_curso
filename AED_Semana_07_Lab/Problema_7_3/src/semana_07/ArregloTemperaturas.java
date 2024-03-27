package semana_07;

public class ArregloTemperaturas {
	
	//  Atributos privados
	private double[] temperatura;
	private int indice;
	//  Constructor
	public ArregloTemperaturas() {
		temperatura = new double[10];
		indice = 0;
	}
	//  Operaciones públicas básicas
	public int tamanio() {
		return indice;
	}
	public double obtener(int i) {
		return temperatura[i];
	}
	public void adicionar(double numero) {
		if (indice == temperatura.length)
			ampliarArreglo();
		temperatura[indice] = numero;
		indice ++;
	}
	//  Operaciones públicas complementarias
	public void eliminarAlFinal() {
		indice --;
	}
	public void eliminarTodo() {
		indice = 0;
	}
	//  Operaciones privadas
	private void ampliarArreglo() {
		double[] aux = temperatura;
		temperatura = new double[indice + 10];
		for (int i=0; i<indice; i++)
			temperatura[i] = aux[i];
	}
	
	//----------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------
	
	private double temperaturaPromedio() {
		double promedio;
		double suma=0;
		for(int i=0; i<tamanio(); i++) {
			suma+=temperatura[i];
		}
		promedio=suma/tamanio();
		return promedio;
	}
	
	private int posPrimeraTemperaturaFebril() {
		for(int i=0; i<tamanio();i++) {
			double t = temperatura[i];
			if(t>37.2) {
				return i;
			}
		}
		return -1;
	}
	
	private int buscarUltimaTemperaturaFebril() {
		for(int i=tamanio()-1;i>=0;i--) {
			double t = temperatura[i];
			if(t>37.2) {
				return i;
			}
		}
		return -1;
	}
	
	private void eliminar(int pos) {
		for(int i=pos; i<tamanio()-1;i++) {
			temperatura[i]=temperatura[i+1];
		}
		indice--;
	}
	
	//----------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------
	
	public void remplazarPrimeraTemperaturaFebril() {
		int posPrim = posPrimeraTemperaturaFebril();
		int posUlt = buscarUltimaTemperaturaFebril();
		if(posPrim!=-1 && posUlt!=-1) {
			temperatura[posPrim]=temperatura[posUlt];
		}
	}
	
	public void remplazarUltimaTemperaturaFebril() {
		int posUlt = buscarUltimaTemperaturaFebril();
		if(posUlt!=-1) {
			temperatura[posUlt]=temperaturaPromedio();
		}
	}
	
	public void eliminarPrimeraTemperaturaFebril() {
		int posPrim = posPrimeraTemperaturaFebril();
		if(posPrim!=-1) {
			eliminar(posPrim);
		}
	}
	
}
