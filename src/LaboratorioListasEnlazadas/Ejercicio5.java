package LaboratorioListasEnlazadas;

import Lista.ListaSimple;

public class Ejercicio5 {
	public static void main(String[] args) {
		ListaSimple<Integer> l = new ListaSimple<>();	
		l.insertar(20);
		l.insertar(5);
		l.insertar(5);
		l.insertar(5);
		l.insertar(1112);
		l.insertar(5);
		l.insertar(5);
		
		System.out.println(contarRepeticiones(l, 5));
	}
	 public static <T extends Comparable<T>> int contarRepeticiones(ListaSimple<T> lista, T valor) {
	        int contador = 0;
	        for (T elemento : lista) {
	            if (elemento.compareTo(valor) == 0) {
	                contador++;
	            }
	        }
	        return contador;
	    }
}

