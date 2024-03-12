package LaboratorioListasEnlazadas;

import Lista.ListaSimple;

public class Ejericico1 {
	
	public static void main(String[] args) {
		

		ListaSimple<String> l = new ListaSimple<>();	
		l.insertar("1");
		l.insertar("2");
		l.insertar("3");
		l.insertar("4");
		l.insertar("5");
		l.insertar("6");
		l.insertar("7");	

		int c = 1;

		for (int i=1; i<l.getSize();i++) {
			if(i%2!=0) {
				System.out.println(l.get(i));
			}
			
		}
	}
	
	
}
