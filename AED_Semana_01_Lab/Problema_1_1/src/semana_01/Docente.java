package semana_01;

public class Docente {
	//Atributos públicos
	public int codigo, horas;
	public String nombre;
	public double tarifa;
	
	public double sueldoBruto() {
		return tarifa*horas;
	}
	public double descuento() {
		if(sueldoBruto()<4500) {
			return sueldoBruto() * 0.12;
		} else if (sueldoBruto() >= 4500 && sueldoBruto()<6500){
			return sueldoBruto() * 0.14;
		} else {
			return sueldoBruto() * 0.16;
		}
	}
	
	public double sueldoNeto() {
		return sueldoBruto() - descuento();
	}
	
}
