package semana_01;

public class Filmacion {
	public int codigo, minutos;
	public String titulo;
	public double pre_sol;
	
	public double precioDolares() {
		return pre_sol/3.59;
	}
}
