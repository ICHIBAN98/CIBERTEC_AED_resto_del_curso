package arreglo;

import java.util.ArrayList;

import clase.Libro;

public class ArregloLibros {
//  Atributo privado
	private ArrayList <Libro> lib;
	
	public ArregloLibros(){
		lib = new ArrayList <Libro> ();
    	adicionar(new Libro(123, "Viaje al centro de la tierra", "Norma", 324));
    	adicionar(new Libro(234, "La casa verde", "Alfaguara", 219));
    	adicionar(new Libro(345, "Olive Twist", "DeBolsillo", 150));
    	adicionar(new Libro(456, "La rebelión en la granja", "Planeta Lector", 228));
	}
//  Operaciones públicas básicas
	public void adicionar(Libro x) {
		lib.add(x);
	}
    public int tamanio() {
		return lib.size();
	}
	public Libro obtener(int i) {
		return lib.get(i);
	}
	
	public Libro buscar (int codigo) {
		for(int i=0; i<tamanio(); i++) {
			if(codigo==obtener(i).getCodigo()) {
				return obtener(i);
			}
		}
		return null;
	}
	public void eliminar(Libro x) {
		lib.remove(x);
	}
}
