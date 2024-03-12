package Lista;

import java.util.Iterator;

/**
 * @author Jero
 *
 * @param <T>
 */
public class ListaSimple <T extends Comparable<T>>  implements Iterable<T>{
	private Node<T> head;
	private int size;
	
	public void ListaSimple() {
		this.head=null;
		this.size=0;
	}
	
	private class Node<T>{
		T data;
		Node<T> next;
		
		
		Node(T dado){
			this.data=dado;
			next = null;
		}
	}
	
	public void insertar(T data) {
		
		Node<T> newNode = new Node<>(data);
		
		if(head == null) {
			newNode.next = head;
			head = newNode;
		}else {
		    Node<T> current = head;
            while (current.next != null && current.next.data.compareTo(data) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
		
	}
	
	public void insertarInicio(T data) {
		
		Node<T> newNode = new Node<>(data);
		
		if(head == null) {
			newNode.next = head;
			head = newNode;
		}else {
			
			newNode.next=head;
			
			head = newNode;
			
		} size++;
		
	}
	
	public void insertarFinal (T data) {
		Node<T> newNode = new Node<>(data);
		if(head == null) {
			newNode.next = head;
			head = newNode;
		}else {
			Node<T> current = head;
			
			while(current.next != null) {
				current = current.next;				
			}
			newNode.next = current.next;
            current.next = newNode;
        }
        size++;
		
	
	}
	
	public void print() {
		Node<T> current = head;
		
		if(current != null) {
			while(current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}

	}
	
	public T get(int index) {
		
		if (head == null) {
            throw new IndexOutOfBoundsException("La lista está vacía");
        }

        Node<T> current = head;
        for(int i=0; i<size;i++ ) {
        	
        	if(i == index-1) {
        		return current.data;
        	}
        	current = current.next;
        }
        throw new IndexOutOfBoundsException("Índice fuera de rango");
    }
	public void  eliminarPosicion(int index) {
		 if (index < 1|| index >= size) {
             throw new IndexOutOfBoundsException("Position out of bounds");
         }
         if (index == 1) {
             head = head.next;
         }else {
        	 Node<T> current = head;
             for (int i = 1; i < index -1; i++) {
            	 
            	 current = current.next;
            	
             } 
             current.next= current.next.next;
        	 
         }
             
         
         size--;	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
	 return new IteradorLista();
	}
	
	private class IteradorLista implements Iterator<T> {
        private Node<T> actual = head;

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public T next() {
            T elemento = actual.data;
            actual = actual.next;
            return elemento;
        }
    }
}
	
	

