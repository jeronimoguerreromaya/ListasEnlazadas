package LaboratorioListasEnlazadas;

import Lista.ListaSimple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio12 {
    public static void main(String[] args) {


        ListaSimple<Integer> numeros = new ListaSimple<>();
        numeros.insertar(1);
        numeros.insertar(4);
        numeros.insertar(5);
        numeros.insertar(4);


        double media = calcularMedia( numeros);
        double desviacionEstandar = calcularDesviacionEstandar( numeros, media);

        // Muestra los resultados
        System.out.println("Media: " + media);
        System.out.println("Desviación Estándar: " + desviacionEstandar);
    }

    static double calcularMedia( ListaSimple<Integer> list) {
        double suma = 0;
        for (int i = 1; i <=list.getSize(); i++) {
            suma += list.get(i);
        }
        return suma / list.getSize();
    }

    static double calcularDesviacionEstandar(ListaSimple<Integer> list, double media) {
        float sumaCuadrados = 0;
        for (int i = 1; i <=list.getSize(); i++) {
            double diferencia = list.get(i) - media;

            sumaCuadrados += diferencia * diferencia;

        }

        double varianza = sumaCuadrados / list.getSize();

        return Math.sqrt(varianza);
    }


}

