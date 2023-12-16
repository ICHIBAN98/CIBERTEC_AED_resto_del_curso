package padre;
import interfaz.Caracterizable;

public abstract class Chofer implements Caracterizable{
	private int codigo, aniosExp;
	private String nombre, tipoLicencia;
	
	public Chofer(int codigo, int aniosExp, String nombre, String tipoLicencia) {
		this.codigo = codigo;
		this.aniosExp = aniosExp;
		this.nombre = nombre;
		this.tipoLicencia = tipoLicencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAniosExp() {
		return aniosExp;
	}

	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoLicencia() {
		return tipoLicencia;
	}

	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}
	
	public abstract double sueldo();
	
	public String caracterizar() {
		return codigo + "-" + nombre + "-" + aniosExp + "-" + tipoLicencia;
	}
	
}
