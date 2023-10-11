package semana_07;

public class ArregloNotas {

	//  Atributos privados
	private int[] nota;
	private int indice;
	//  Constructor
	public ArregloNotas() {
		nota = new int[10];
		indice = 0;
	}
	//  Operaciones públicas básicas
	public int tamanio() {
		return indice;
	}
	public int obtener(int i) {
		return nota[i];
	}
	public void adicionar(int numero) {
		if (indice == nota.length)
			ampliarArreglo();
		nota[indice] = numero;
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
		int[] aux = nota;
		nota = new int[indice + 10];
		for (int i=0; i<indice; i++)
			nota[i] = aux[i];
	}
	
	
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	
	public void remplazarUltimaNotaAprobatoria() {
		int p = posUltimaNotaAprobatoria();
		if(p!=-1) {
			nota[p]=notaMenor();
		}
	}
	
	public void eliminarPrimeraNotaAprobatoria() {
		int p = posPrimeraNotaAprobatoria();
		if(p!=-1) {
			eliminar(p);
		}
	}
	
	//-----------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------
	
	private int notaMenor(){
		int menor = nota[0];
		for(int i=1; i<indice;i++) {
			if(nota[i]<menor) {
				menor=nota[i];
			}
		}
		return menor;
	}
	
	private int posPrimeraNotaAprobatoria() {
		int i = 0;
		for(int num:nota) {
			if(num>=13 && num<=20) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	
	private int posUltimaNotaAprobatoria(){
		for(int i=indice-1;i>=0;i--) {
			if(nota[i]>=13 && nota[i]<=20) {
				return i;
			}
		}
		return -1;
	}
	
	private void eliminar(int pos) {
		for(int i=pos; i<indice-1;i++) {
			nota[i]=nota[i+1];
		}
		indice--;
	}
	
	
	
}
