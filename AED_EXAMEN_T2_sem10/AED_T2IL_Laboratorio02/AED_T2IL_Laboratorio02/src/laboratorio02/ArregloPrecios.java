package laboratorio02;

public class ArregloPrecios {
    private double precio[];
    private int indice;

    public ArregloPrecios() {
        precio = new double[10];
        indice = 0;
    }

    public int tamanio() {
        return indice;
    }

    public double obtener(int p) {
        return precio[p];
    }

    public void adicionar(double s) {
        if (indice == tamanio()) {
        	ampliarPrecio();
        }
        precio[indice] = s;
        indice++;
    }

    private void ampliarPrecio() {
        double aux[] = precio;
        precio = new double[indice + 10];
        for (int i = 0; i < indice; i++)
            precio[i] = aux[i];
    }
    
    public void eliminarTodo() {
        indice = 0;
    }

    public void eliminarFinal() {
        indice--;
    }
    
    
    
    public void eliminar(int pos) {
    	for(int i=pos; i<indice-1; i++) {
    		precio[i]=precio[i+1];
    	}
    	indice--;
    }
    
    public int posicionUltimoPrecioMenorQue900() {
    	for(int i=indice-1; i>=0; i--) {
    		if(precio[i]<900) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    public double sumaPreciosMayoresQue750() {
    	double suma=0;
    	for(int i=0; i<indice; i++) {
    		if(precio[i]>750) {
    			suma+=precio[i];
    		}
    	}
    	return suma;
    }
    
    public boolean reemplazarUltimoPrecioMenorQue900() {
    	int posUltMen900 = posicionUltimoPrecioMenorQue900();
    	double sumaMayores750 = sumaPreciosMayoresQue750();
    	if(posUltMen900!=-1) {
    		precio[posUltMen900] = sumaMayores750;
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public int incrementarPreciosMenoresQue1100 () {
    	int contador=0;
    	for(int i=0; i<indice; i++) {
    		if(precio[i]<1100) {
    			double pre = precio[i];
    			double nuevoPrecio = pre*1.14;
    			precio[i]=nuevoPrecio;
    			contador++;
    		}
    	}
    	return contador;
    }
    
    public boolean eliminarUltimoPrecioMenorQue900() {
    	int posUltMenor900 = posicionUltimoPrecioMenorQue900();
    	if(posUltMenor900!=-1) {
    		eliminar(posUltMenor900);
    		return true;
    	} else {
    		return false;
    	}
    }   
}

