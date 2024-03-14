package LaboratorioListasEnlazadas;

import Lista.ListaSimple;

public class Ejercicio10 {
    public static void main(String[] args) {
        ListaSimple<Integer> lista1 = new ListaSimple<>();
        lista1.insertarFinal(1);
        lista1.insertarFinal(2);
        lista1.insertarFinal(3);

        ListaSimple<Integer> lista2 = new ListaSimple<>();
        lista2.insertarFinal(4);
        lista2.insertarFinal(5);
        lista2.insertarFinal(6);

        ListaSimple<Integer> listaConcatenada = new ListaSimple<>();
        listaConcatenada = listaConcatenada.concatenarListas(lista1, lista2);

        System.out.println("Lista concatenada:");
        listaConcatenada.print();
    }
}
