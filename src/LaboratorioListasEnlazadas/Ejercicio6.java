package LaboratorioListasEnlazadas;

import Lista.ListaDoblementeEnlazada;
import Lista.ListaSimple;

public class Ejercicio6 {
	public static void main(String[] args) {
		ListaDoblementeEnlazada<Integer> l = new ListaDoblementeEnlazada<>();	
		l.insertarAlFinal(20);
		l.insertarAlFinal(5);
		l.insertarAlFinal(5);
		l.insertarAlFinal(5);
		l.insertarAlFinal(1112);
		l.insertarAlFinal(5);
		l.insertarAlFinal(5);
		
		l.imprimirHaciaAtras();
		
	}
}
