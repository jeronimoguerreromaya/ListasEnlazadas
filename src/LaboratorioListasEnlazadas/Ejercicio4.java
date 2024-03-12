package LaboratorioListasEnlazadas;
import Lista.ListaSimple;
public class Ejercicio4 {
	public static void main(String[] args) {
		ListaSimple<Integer> l = new ListaSimple<>();	
		l.insertar(20);
		l.insertar(501);
		l.insertar(30);
		l.insertar(20);
		l.insertar(1112);
		l.insertar(6);
		l.insertar(8);
		
		l = devolverImpares(l);
		
		l.print();
			
			
	}
	public static ListaSimple<Integer> devolverImpares (ListaSimple<Integer> list){
		ListaSimple<Integer> newList = new ListaSimple<>();
		int c = 0;
		
		for(int i=1; i<=list.getSize(); i++) {
			c = list.get(i);
			if(c%2 != 0) {
				
				newList.insertar(c);
			}
		}
		
	
		return newList;
	}
}
