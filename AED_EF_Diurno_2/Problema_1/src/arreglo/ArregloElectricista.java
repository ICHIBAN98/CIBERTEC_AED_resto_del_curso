package arreglo;

import java.util.ArrayList;

import clases.Electricista;


public class ArregloElectricista {
	private ArrayList<Electricista> ele;
	
	public ArregloElectricista() {
		ele = new ArrayList<Electricista>();
		adicionar(new Electricista("Juan", 45, 12.5, 20));
		adicionar(new Electricista("Mario", 57, 11.0, 25));
		adicionar(new Electricista("Julio", 35, 10.0, 10));
		adicionar(new Electricista("Pedro", 43, 8.0, 12));
		adicionar(new Electricista("Roberto", 23, 13.0, 20));
	}
	
	public void adicionar(Electricista x) {
		ele.add(x);
	}
	
	public Electricista obtener(int p) {
		return ele.get(p);
	}
	
	public int tamanio() {
		return ele.size();
	}
	
	public void eliminarUltimo() {
		ele.remove(tamanio() - 1);
	}
	
	public void eliminarTodo() {
		ele.clear();
	}
	
	public double tarifaPromedio() {
		int cont = 0;
		double sumaTarifas = 0.0;
		for(int i = 0; i<tamanio(); i++) {
			if(obtener(i).getEdad()<45) {
				sumaTarifas+=obtener(i).getTarifa();
				cont++;
			}
		}
		return sumaTarifas/cont;
	}
	
	public String nombrePrimerElectricistaMayorQue10() {
		for(int i = 0; i<tamanio(); i++) {
			if(obtener(i).getConexiones()>10) {
				return obtener(i).getNombre();
			}
		}
		return null;
	}
	
	
}
