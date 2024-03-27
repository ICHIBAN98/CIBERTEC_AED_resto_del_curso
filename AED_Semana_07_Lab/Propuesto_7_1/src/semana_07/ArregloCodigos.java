package semana_07;

public class ArregloCodigos {
	private int [] codigo;
	private int indice;
	
	public ArregloCodigos() {
		codigo = new int [10];
		indice = 0;
	}
	
	public int tamanio() {
		return indice;
	}
	
	public int obtener(int pos) {
		return codigo[pos];
	}
	
	private void ampliarArreglo() {
		int[] aux = codigo;
		codigo = new int[indice + 10];
		for(int i=0; i<indice; i++) {
			codigo[i] = aux[i];
		}
	}
	
	public void adicionar(int in) {
		if(tamanio()==codigo.length) {
			ampliarArreglo();
		}
		codigo[indice]=in;
		indice++;
	}
	
	public void intercambiarSegPen() {
		int aux = codigo[1];
		codigo[1]=codigo[tamanio()-2];
		codigo[tamanio()-2]=aux;
	}
	
	public void eliminarPrimero() {
		eliminar(0);
	}
	
	public void intercambiarCodigo() {
		int u = posCodigo();
		if(u!=-1 && tamanio()>=4) {
			intercambiar(u,2);
		}
	}
	
	public void eliminarCodigo() {
		int pos=posCodigo();
		if(pos!=-1) {
			eliminar(pos);
		}
	}
		
	//-------------------------------------------------------------------
	//-------------------------------------------------------------------
	
	private void eliminar(int pos){
		for(int i=pos; i<tamanio()-1;i++) {
			codigo[i]=codigo[i+1];
		}
		indice--;
	}
	
	private int posCodigo() {
		for(int i=indice-1; i>=0; i--) {
			int cod = codigo[i];
			if(cod>=1000 && cod<=1111) {
				return i;
			}
		}
		return -1;
	}
	
	private void intercambiar(int pos1, int pos2) {
		int aux = codigo[pos1];
		codigo[pos1]=codigo[pos2];
		codigo[pos2]=aux;
	}
}
