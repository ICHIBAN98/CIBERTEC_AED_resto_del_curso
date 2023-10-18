package examen;

public class ArregloLongitudes {
	private double longitud[];
	private int indice;

	public ArregloLongitudes() {
		longitud = new double[10];
		indice = 0;
	}

	public int tamaño() {
		return indice;
	}

	public double obtener(int p) {
		return longitud[p];
	}

	public void adicionar(double lon) {
		if (indice == tamaño()) {
			ampliarArreglo();
		}
		longitud[indice] = lon;
		indice++;
	}

	private void ampliarArreglo() {
		double aux[] = longitud;
		longitud = new double[indice + 10];
		for (int i = 0; i < indice; i++)
			longitud[i] = aux[i];
	}
	
	private int posicionPrimeraLongitudMayor120() {
		for(int i=0; i<indice; i++) {
			if(longitud[i]>120.0) {
				return i;
			}
		}
		return -1;
	}
	
	private double sumarLongitudes() {
		double suma=0;
		for(double valor:longitud) {
			suma+=valor;
		}
		return suma;
	}
	
	public boolean reemplazarLongitudMayor120() {
		int posMayor=posicionPrimeraLongitudMayor120();
		if(posMayor!=-1) {
			longitud[posMayor]=sumarLongitudes();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean incrementarLongitudMayor120() {
		int posMayor=posicionPrimeraLongitudMayor120();
		if(posMayor!=-1) {
			longitud[posMayor]+=longitud[0]*0.25;
			return true;
		} else {
			return false;
		}
	}
	
	public void intercambiarLongitudes() {
		int posMayor = posicionPrimeraLongitudMayor120();
		if(posMayor!=-1) {
			double aux = longitud[posMayor];
			longitud[posMayor]=longitud[indice-1];
			longitud[indice-1]=aux;
		}
	}

}
