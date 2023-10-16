package examen;

public class Esfera {
	private double  radio;

	public Esfera(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double volumen() {
		return 4/3*3.1416*radio;
	}
}
