package semana_01;

public class Trabajador {

	//Atributos p�blicos
		public int codigo, horasTrabajadas;
		public String nombre;
		public double tarifaHora;
		
		//Operaciones p�blicas
		public double sueldo() {
			return horasTrabajadas*tarifaHora;
		}
	
}
