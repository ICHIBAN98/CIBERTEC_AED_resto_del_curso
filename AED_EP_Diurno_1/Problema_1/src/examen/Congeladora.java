package examen;

public class Congeladora {
	private double ancho, alto, profundidad;

	public Congeladora(double ancho, double alto, double profundidad) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}
	
	public double areaBase() {
		return ancho*profundidad;
	}
	
	public double volumen() {
		return areaBase()*alto;
	}
	
	public String claseCongeladora() {
		if(volumen()<1.5) {
			return "Peque�a";
		} else if (volumen()>=1.5 && volumen()<2.5) {
			return "Mediana";
		} else {
			return "Grande";
		}
	}
}
