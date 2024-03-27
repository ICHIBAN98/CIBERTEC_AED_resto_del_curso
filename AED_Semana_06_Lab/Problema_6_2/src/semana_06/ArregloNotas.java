package semana_06;

public class ArregloNotas {
	private int[] nota;
	private int indice;

	public ArregloNotas() {
		nota = new int[10];
		indice = 0;
	}

	public int tamanio() {
		return indice;
	}

	public int obtener(int i) {
		return nota[i];
	}

	private void ampliarArreglo() {
		int[] aux = nota;
		nota = new int[indice + 10];
		for (int i = 0; i < indice; i++) {
			nota[i] = aux[i];
		}
	}

	public void adicionar(int n) {
		if (indice == nota.length) {
			ampliarArreglo();
		}
		nota[indice] = n;
		indice++;
	}

	public void eliminarAlFinal() {
		indice--;
	}

	public void eliminarTodo() {
		indice = 0;
	}

	public int posUltimaNotaDesaprobatoria() {
		for (int i = indice - 1; i >= 0; i--) {
			if (nota[i] < 13) {
				return i;
			}
		}
		return -1;
	}

	public void decrementarUltimaNotaDesaprobatoria() {
		if (posUltimaNotaDesaprobatoria() != -1) {
			int nuevaNota = nota[posUltimaNotaDesaprobatoria()] - 2;

			if (nuevaNota < 0) {
				nota[posUltimaNotaDesaprobatoria()] = 0;
			} else {
				nota[posUltimaNotaDesaprobatoria()] = nuevaNota;
			}

		}
	}

	public void remplazarUltimaNotaDesaprobatoria() {
		if(posUltimaNotaDesaprobatoria()!=-1) {
			nota[posUltimaNotaDesaprobatoria()]=nota[indice-1];
		}
	}
	
}
