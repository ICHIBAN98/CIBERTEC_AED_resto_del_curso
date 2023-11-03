package arreglo;

import java.util.ArrayList;

import clase.Docente;

public class ArregloDocentes {

	private ArrayList<Docente> doc;

	public ArregloDocentes() {
		doc = new ArrayList<Docente>();
		doc.add(new Docente(1001, 20, "John Smith", 30.0));
		doc.add(new Docente(2002, 25, "Alice Johnson", 35.0));
		doc.add(new Docente(3003, 18, "Michael Brown", 28.0));
		doc.add(new Docente(4004, 22, "Emily Davis", 32.0));
		doc.add(new Docente(5005, 30, "James Wilson", 40.0));
		doc.add(new Docente(6006, 15, "Linda Miller", 25.0));
		doc.add(new Docente(7007, 28, "David Lee", 38.0));
		doc.add(new Docente(8008, 24, "Susan White", 34.0));
	}

	// Operaciones públicas básicas
	public void adicionar(Docente x) {
		doc.add(x);
	}

	public int tamanio() {
		return doc.size();
	}

	public Docente obtener(int i) {
		return doc.get(i);
	}
	
	public double sueldoProm(){
		double suma=0;
		for(int i=0; i<tamanio(); i++){
			suma+= obtener(i).sueldo();
		}
		return suma/tamanio();
	}
	public double sueldoMayor(){
		double mayor=0;
		for(int i=0; i<tamanio(); i++){
			if(mayor<obtener(i).sueldo()){
				mayor = obtener(i).sueldo();
			}
		}
		return mayor;
	}
	public double sueldoMenor(){
		double menor=obtener(0).sueldo();
		for(int i=1; i<tamanio(); i++){
			if(menor>obtener(i).sueldo()){
				menor = obtener(i).sueldo();
			}
		}
		return menor;
	}
	public double tarifaMayor(){
		double mayor=0;
		for(int i=0; i<tamanio(); i++){
			if(mayor<obtener(i).getTarifa()){
				mayor = obtener(i).getTarifa();
			}
		}
		return mayor;
	}
	public double tarifaMenor(){
		double menor=obtener(0).getTarifa();
		for(int i=1; i<tamanio(); i++){
			if(menor>obtener(i).getTarifa()){
				menor = obtener(i).getTarifa();
			}
		}
		return menor;
	}
	
}
