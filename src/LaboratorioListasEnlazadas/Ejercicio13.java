package LaboratorioListasEnlazadas;

public class Ejercicio13 {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.agregarNodo(0, 9);
        lista.agregarNodo(0, 4);
        lista.agregarNodo(0, 6);
        lista.agregarNodo(0, 8);
        lista.agregarNodo(0, 5);
        lista.agregarNodo(0, 5);
        lista.agregarNodo(0, 4);
        lista.agregarNodo(0, 4);


        int clave = 4;
        int maximaDistancia = lista.maximaDistancia(lista.inicio, clave, 0, 0);
        System.out.println("La máxima distancia entre elementos con la clave " + clave + " es: " + maximaDistancia);

    }
    static class Lista{
        NodoLista inicio;
        Lista(){
            inicio=null;
        }

        class NodoLista{
            int dato;
            NodoLista sig;
            int clave;
            public NodoLista (int x, NodoLista n) {
              clave = x;
                sig=n;
            }
        }

        public int maximaDistancia(NodoLista nodo, int clave, int distancia, int maximaDistancia) {
            if (nodo == null) {
                return maximaDistancia;
            }

            if (nodo.dato == clave) {
                if (distancia == 0) {
                    distancia = 1;
                } else {
                    maximaDistancia = Math.max(maximaDistancia, distancia);
                    distancia = 1;
                }
            } else {
                distancia++;
            }

            return maximaDistancia(nodo.sig, clave, distancia, maximaDistancia);
        }
        public void agregarNodo(int clave, int dato) {
            NodoLista nuevoNodo = new NodoLista(clave, null);
            nuevoNodo.dato = dato;

            if (inicio == null) {
                inicio = nuevoNodo;
            } else {
                NodoLista temp = inicio;
                while (temp.sig != null) {
                    temp = temp.sig;
                }
                temp.sig = nuevoNodo;
            }
        }
    }




}
