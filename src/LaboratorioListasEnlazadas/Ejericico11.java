package LaboratorioListasEnlazadas;

public class Ejericico11{

    private Nodo cabeza;

    private static class Nodo {
        double coeficiente;
        int exponente;
        Nodo siguiente;

        Nodo(double coeficiente, int exponente) {
            this.coeficiente = coeficiente;
            this.exponente = exponente;
            this.siguiente = null;
        }
    }

    public void agregarTermino(double coeficiente, int exponente) {
        Nodo nuevoNodo = new Nodo(coeficiente, exponente);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

        public void imprimirPolinomio() {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.coeficiente != 0) {
                System.out.print(actual.coeficiente);
                if (actual.exponente != 0) {
                    System.out.print("x^" + actual.exponente);
                }
                if (actual.siguiente != null && actual.siguiente.coeficiente > 0) {
                    System.out.print(" + ");
                } else if (actual.siguiente != null && actual.siguiente.coeficiente < 0) {
                    System.out.print(" - ");
                }
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }
    public double evaluarPolinomio(double x) {
        double resultado = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            resultado += actual.coeficiente * Math.pow(x, actual.exponente);
            actual = actual.siguiente;
        }
        return resultado;
    }


    public static void main(String[] args) {
        Ejericico11 polinomio = new Ejericico11 ();
        polinomio.agregarTermino(3, 4);
        polinomio.agregarTermino(-4, 2);
        polinomio.agregarTermino(11, 0);

        polinomio.imprimirPolinomio();


        evaluarResultados(polinomio);
    }
    public static void evaluarResultados(Ejericico11 p) {

        double i =0;
        while(i<=5){
            System.out.print("X="+i+" ");
            System.out.println(p.evaluarPolinomio(i));
            i+=0.5;
        }
    }
}
