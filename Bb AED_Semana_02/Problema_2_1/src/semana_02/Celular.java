package semana_02;

public class Celular {
	private int num, seg;
	private double pre;
	private String usu;

	public Celular(int num, int seg, double pre, String usu) {
		super();
		this.num = num;
		this.seg = seg;
		this.pre = pre;
		this.usu = usu;

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

	public double getPre() {
		return pre;
	}

	public void setPre(double pre) {
		this.pre = pre;
	}

	public String getUsu() {
		return usu;
	}

	public void setUsu(String usu) {
		this.usu = usu;
	}
	
	//metodos escritos a mano
	public double costoConsumo() {
		return seg*pre;
	}
	
	public double IGV() {
		return costoConsumo()*0.18;
	}
	
	public double costoPagar() {
		return costoConsumo()+IGV();
	}

}
