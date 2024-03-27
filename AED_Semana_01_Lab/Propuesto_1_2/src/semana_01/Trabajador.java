package semana_01;

public class Trabajador {

	//Atributos públicos
		public int codigo, horasTrabajadas;
		public String nombre;
		public double tarifaHora;
		
		//Operaciones públicas
		public double sueldo() {
			return horasTrabajadas*tarifaHora;
		}
	
}
