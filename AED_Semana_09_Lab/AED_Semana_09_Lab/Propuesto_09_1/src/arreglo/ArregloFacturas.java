package arreglo;

import java.util.ArrayList;
import clase.Factura;

public class ArregloFacturas {
	private ArrayList <Factura> fac;
	
	public ArregloFacturas() {
		fac = new ArrayList <Factura>();
		fac.add(new Factura("10000001","ABCDE",15,38.0));
		fac.add(new Factura("20000002","SOCIOS",24,42.0));
		fac.add(new Factura("30000003","AMIGOS",10,40.0));
		fac.add(new Factura("40000003","COMPAÑEROS",22,30.0));
		fac.add(new Factura("50000004","SINNOMBRE",18,28.0));
		fac.add(new Factura("60000005","ANONYMOUS",7,40.0));
		fac.add(new Factura("70000006","EMPRESITA",10,37.0));
		fac.add(new Factura("80000007","LOSCOMPAS",8,27.0));
	}
	
	public void adicionar (Factura x) {
		fac.add(x);
	}
	
	public int tamanio() {
		return fac.size();
	}
	
	public Factura obtener(int pos) {
		return fac.get(pos);
	}
	
	public double importesFacturados() {
		double suma = 0;
		for(int i=0; i<tamanio(); i++) {
			suma += obtener(i).importeFacturado();
		}
		return suma;
	}
	
	public double promedioFacturado() {
		return importesFacturados()/tamanio();
	}
	
	public double menorImporteFacturado() {
		double menor = obtener(0).importeFacturado();
		for(int i=1; i<tamanio(); i++) {
			if(obtener(i).importeFacturado()<menor) {
				menor = obtener(i).importeFacturado();
			}
		}
		return menor;
	}
	
	public double mayorImporteFacturado() {
		double mayor = 0;
		for(int i=0; i<tamanio(); i++) {
			if(obtener(i).importeFacturado()>mayor) {
				mayor = obtener(i).importeFacturado();
			}
		}
		return mayor;
	}
	
	public String primEmpresa() {
		double promFacturado = promedioFacturado();
		for(int i=0; i<tamanio(); i++) {
			if(obtener(i).importeFacturado()<promFacturado) {
				return obtener(i).getEmpresa();
			}
		}
		return null;
	}
	
}
