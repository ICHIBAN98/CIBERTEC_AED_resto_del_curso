package semana_02;

public class Video {
	// Atributos PRIVADOS:
	private String nombreVideo;
	private int codigo;
	private double duracionMinutos, preSoles, tipoCambio;

	// Constructor
	public Video(String nombreVideo, int codigo, double duracion, double preSoles, double tipoCambio) {
		super();
		this.nombreVideo = nombreVideo;
		this.codigo = codigo;
		this.duracionMinutos = duracion;
		this.preSoles = preSoles;
		this.tipoCambio = tipoCambio;
	}

	// Métodos get & set
	public String getNombreVideo() {
		return nombreVideo;
	}

	public void setNombreVideo(String nombreVideo) {
		this.nombreVideo = nombreVideo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getDuracion() {
		return duracionMinutos;
	}

	public void setDuracion(double duracion) {
		this.duracionMinutos = duracion;
	}

	public double getPreSoles() {
		return preSoles;
	}

	public void setPreSoles(double preSoles) {
		this.preSoles = preSoles;
	}

	public double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	// Operaciones
	public double preDolares() {
		return preSoles / tipoCambio;
	}

}
