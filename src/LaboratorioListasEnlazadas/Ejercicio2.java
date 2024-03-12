package LaboratorioListasEnlazadas;



import Lista.ListaSimple;
import Lista.ListaSimple.*;
import Lista.Persona;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		ListaSimple<Persona> l = new ListaSimple<>();
			Persona personas0 = new Persona("Juan", "1234567891");
			Persona personas1 = new Persona("María", "987654321");
			Persona personas2 = new Persona("Pedro", "56789012311");
			Persona personas3 = new Persona("Ana", "45678901211");
			Persona personas4 = new Persona("Luis", "23456789011");
			Persona personas5 = new Persona("Sofía", "6789012341");
			Persona personas6 = new Persona("Nikoll", "188824541");
			
			 	l.insertar(personas0);
			 	l.insertar(personas1);
		        l.insertar(personas2);
		        l.insertar(personas3);
		        l.insertar(personas4);
		        l.insertar(personas5);
		        l.insertar(personas6);
		        
		        int c =0;
		        Persona p = new Persona();
		        for(int i=1; i<= l.getSize(); i++) {
		        	p = l.get(i);
		        	c = p.getId().length();		        	
		       
		        	if(c%2 == 0) {        		
		        		System.out.println(p.toString());
		        		
		        	}
		        }
	}

}
