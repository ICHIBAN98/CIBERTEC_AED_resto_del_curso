package arreglo;

import java.util.ArrayList;
import clase.Persona;

public class ArregloPersonas {

	ArrayList<Persona> per;

	public ArregloPersonas() {
		per = new ArrayList<Persona>();
		adicionar(new Persona(123, "Ana", 67, 1.62));
		adicionar(new Persona(456, "Juan", 80, 1.76));
		adicionar(new Persona(789, "Pedro", 78, 1.80));
		adicionar(new Persona(302, "David", 54, 1.54));
		adicionar(new Persona(417, "Carlos", 72, 1.71));
	}

	// Operaciones públicas básicas
	public void adicionar(Persona x) {
		per.add(x);
	}

	public int tamanio() {
		return per.size();
	}

	public Persona obtener(int i) {
		return per.get(i);
	}
	
	public Persona buscar(int codigo) {
		for (int i=0; i<tamanio(); i++){
			if (obtener(i).getCodigo() == codigo){
				return obtener(i);
			}
		}
		return null;
	}
	public void eliminar(Persona x) {
		per.remove(x);
	}
}
