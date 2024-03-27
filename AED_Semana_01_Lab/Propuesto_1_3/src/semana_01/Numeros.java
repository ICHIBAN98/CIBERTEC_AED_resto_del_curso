package semana_01;

public class Numeros {

	//Atributos públicos
	public int numero1, numero2, numero3;
	
	//Operaciones públicas
	
	public int numeroMayor() {
		if (numero1 > numero2 && numero1 > numero3) {
			return numero1;
		} else if (numero2 > numero1 && numero2 > numero3) {
			return numero2;
		} else {
			return numero3;
		}
	}
		
	public int numeroMenor() {
		if(numero1 < numero2 && numero1 < numero3) {
			return numero1;
		} else if(numero2 < numero1 && numero2 < numero3) {
			return numero2;
		} else {
			return numero3;
		}	
	}
	
	public int numeroMedio() {
		
		if(numero1 != numeroMayor() && numero1 != numeroMenor()) {
			return numero1;
		} else if(numero2 != numeroMayor() && numero2 != numeroMenor()) {
			return numero2;
		} else {
			return numero3;
		}
	}

}
