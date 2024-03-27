package semana_05;

public class ArregloPrecios {
	private double [] precio = {240.5, 350.2, 80.4, 100.3, 470.1, 60.0, 330.8, 260.6, 510.9, 200.7};
	public ArregloPrecios(){
	}
	public int tamanio() {
		return precio.length;
	}
	public double obtener(int i) {
		return precio[i];
	}
	public double precioPromedio() {
		double suma=0;
		for(int i=0; i<tamanio();i++) {
			suma+=precio[i];
		}
		return suma/tamanio();
	}
	public double precioMayor() {
		double mayor=precio[0];
		for(int i=1; i<tamanio();i++) {
			if(precio[i]>mayor) {
				mayor=precio[i];
			}
		}
		return mayor;
	}
	public double precioMenor() {
		double menor=precio[0];
		for(int i=1; i<tamanio();i++) {
			if(precio[i]<menor) {
				menor=precio[i];
			}
		}
		return menor;
	}
	public int cantMayoresPrecioPromedio() {
		int cantidad=0;
		for(int i=0; i<tamanio();i++) {
			if(precio[i]>=precioPromedio()) {
				cantidad++;
			}
		}
		return cantidad;
	}
	public int cantMenoresPrecioPromedio() {
		int cantidad=0;
		for(int i=0; i<tamanio();i++) {
			if(precio[i]<precioPromedio()) {
				cantidad++;
			}
		}
		return cantidad;
	}
	public int posPrimerPrecioMayorAlSegundo() {
		for(int i=0; i<tamanio();i++) {
			if(precio[i]>precio[1]) {
				return i;
			}
		}
		return -1;
	}
	public int posUltimoPrecioMenorAlPenultimo() {
		int penultimo=tamanio()-2;
		for(int i=tamanio()-1; i>=0; i--) {
			if(precio[i]<precio[penultimo]) {
				return i;
			}
		}
		return -1;
	}
	public void generarPrecios() {
		for(int i=0; i<tamanio(); i++) {
			precio[i]=aleatorio(99.9, 999.9);
		}
	}
	private double aleatorio(double min, double max) {
		return (double)((max - min + 1) * Math.random()) + min;
	}
}
