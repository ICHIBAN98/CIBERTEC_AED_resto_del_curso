package clase;

public class Persona {
		private int codigo;
		private String nombre;
		private double peso,estatura;
		
		public Persona(int codigo, String nombre, double peso, double esatura) {
			this.codigo = codigo;
			this.nombre = nombre;
			this.peso = peso;
			this.estatura = esatura;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

	
		
		public double getEstatura() {
			return estatura;
		}

		public void setEstatura(double estatura) {
			this.estatura = estatura;
		}

		public double imc(){
			return peso/(estatura*estatura);
		}
		
		
		
}
