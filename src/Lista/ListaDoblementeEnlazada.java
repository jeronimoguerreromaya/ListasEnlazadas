package Lista;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaDoblementeEnlazada<T extends Comparable<T>> implements Iterable<T>{
	
	private Nodo<T> cabeza;
	private Nodo<T> cola;
	private int size;
	
	public ListaDoblementeEnlazada() {
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
	
	public void insertarAlInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
        size++;
    }

    public void insertarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cola == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
        size++;
    
}


	public void imprimirHaciaAtras() {
		 Nodo<T> actual = cola;
	        while (actual != null) {
	            System.out.print(actual.dato + " ");
	            actual = actual.anterior;
	        }
	        System.out.println();
	}
	
	

	public Nodo<T> getCabeza() {
		return cabeza;
	}

	public void setCabeza(Nodo<T> cabeza) {
		this.cabeza = cabeza;
	}

	public Nodo<T> getCola() {
		return cola;
	}

	public void setCola(Nodo<T> cola) {
		this.cola = cola;
	}

	public int getTamaño() {
		return size;
	}

	public void setTamaño(int tamaño) {
		this.size = tamaño;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ListaIterator();
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
                throw new NoSuchElementException("No hay más elementos en la lista");
            }
            T dato = actual.dato;
            actual = actual.siguiente;
            return dato;
        }
    }


}
