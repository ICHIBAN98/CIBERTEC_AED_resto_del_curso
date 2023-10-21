package semana_08;

public class Arreglo {
	
	//  Atributos privados
	private int[] n;
	private int indice;
	//  Constructor
	public Arreglo() {
		n = new int[10];
		indice = 0;
	}
	//  Operaciones p�blicas b�sicas
	public int tamanio() {
		return indice;
	}
	public int obtener(int i) {
		return n[i];
	}
	public void adicionarDistintoYordenar(int numero) {
		adicionarDistinto(numero);
		ordenarMenorAmayor();
	}
	//  Operaciones privadas
	private void ampliarArreglo() {
		int[] aux = n;
		n = new int[indice + 10];
		for (int i=0; i<indice; i++)
			n[i] = aux[i];
	}
	public void adicionar(int numero) {
		if (indice == n.length)
			ampliarArreglo();
		n[indice] = numero;
		indice ++;
	}
	
	

	private int buscarIgual(int numero) {
		for(int i=0; i<indice; i++) {
			int numArreglo=obtener(i);
			if(numArreglo==numero) {
				return i;
			}
		}
		return -1;
	}
	public void adicionarDistinto(int numero) {
		int resultadoBusqueda=buscarIgual(numero);
		if(resultadoBusqueda==-1) {
			adicionar(numero);
		}
	}
	private void intercambiar(int pos1,int pos2) {
		int aux = n[pos1];
		n[pos1]=n[pos2];
		n[pos2]=aux;
	}
	private void ordenarMenorAmayor(){
		for(int i=0; i<indice; i++) {
			for(int j=0; j<indice; j++) {
				if(n[i]<n[j]) {
					intercambiar(i,j);
				}
			}
		}
	}
}