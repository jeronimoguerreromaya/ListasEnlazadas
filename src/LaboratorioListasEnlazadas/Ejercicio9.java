package LaboratorioListasEnlazadas;

public class Ejercicio9 <T extends Comparable<T>> {

    private Nodo<T> cabeza;
    private int size;

    public Ejercicio9() {
        this.cabeza = null;
        this.size = 0;
    }

    public class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public void insertar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza; // El siguiente de la cabeza apunta a ella misma en una lista circular
        } else {
            Nodo<T> ultimo = cabeza;
            while (ultimo.siguiente != cabeza) {
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza; // Hacemos que el último nodo apunte nuevamente a la cabeza para cerrar el círculo
        }
        size++;
    }

    public boolean buscar(T datoABuscar) {
        Nodo<T> actual = cabeza;
        if (actual == null) {
            return false;
        }

        do {
            if (actual.dato.equals(datoABuscar)) {
                return true;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return false;
    }
}

