package padre;

public class Maquina {
	private int codigo;
	private String marca, procesador;

	public Maquina(int codigo, String marca, String procesador) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.procesador = procesador;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	
	

}
