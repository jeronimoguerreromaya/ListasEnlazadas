package LaboratorioListasEnlazadas;
import Lista.ListaSimple;
public class Ejercicio3 {

	public static void main(String[] args) {
		ListaSimple<Integer> l = new ListaSimple<>();	
		l.insertar(20);
		l.insertar(2);
		l.insertar(2);
		l.insertar(20);
		l.insertar(111);
		l.insertar(6);
		l.insertar(7);
		
		int c = 0;
		for(int i=1; i<= l.getSize(); i++) {
			c=l.get(i);
			if(c%2==0) {
				
				l.eliminarPosicion(i);
				i--;
			
				
			}
		}
		
		
		l.print();
	}

	

}
