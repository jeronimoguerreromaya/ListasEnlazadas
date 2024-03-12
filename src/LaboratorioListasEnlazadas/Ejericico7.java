package LaboratorioListasEnlazadas;

import java.util.Iterator;

import javax.script.Invocable;

import Lista.ListaDoblementeEnlazada.Nodo;

// La lista lista doblemente enlazada completa esta en el paquete Lista

public class Ejericico7 <T extends Comparable<T>> implements Iterable<T>{
	
	private Nodo<T> cabeza;
	private Nodo<T> cola;
	private int size;
	
	public Ejericico7() {
		this.cabeza = null;
		this.cola = null;
		this.size = 0;
	}
	
	public class Nodo<T>{
		T dato;
		Nodo<T> siguiente;
		Nodo<T> anterior;
		
		Nodo(T dato){
			this.dato = dato;
			siguiente = null;
			this.anterior = null;
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	   private class ListaIterator implements Iterator<T> {
	        private Nodo<T> actual;

	        public ListaIterator() {
	            actual = cabeza;
	        }

	        @Override
	        public boolean hasNext() {
	            return actual != null;
	        }

	        @Override
	        public T next() {
	            if (!hasNext()) {
	            	 throw new IndexOutOfBoundsException("No hay elementos en la lista");
	            }
	            T dato = actual.dato;
	            actual = actual.siguiente;
	            return dato;
	        }
	    }

}
