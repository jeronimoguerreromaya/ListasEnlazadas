package LaboratorioListasEnlazadas;

import Lista.ListaDoblementeEnlazada;
import Lista.Persona;

public class Ejercicio8 {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<Persona> peopleList = new ListaDoblementeEnlazada<>();

        peopleList.insertarAlFinal(new Persona("John", "123456"));
        peopleList.insertarAlFinal(new Persona("Alice", "78901"));
        peopleList.insertarAlFinal(new Persona("Bob", "2345678"));
        peopleList.insertarAlFinal(new Persona("Charlie", "13579"));
        peopleList.insertarAlFinal(new Persona("Diana", "2468"));

        ListaDoblementeEnlazada<Persona> peopleListEvenCedula = peopleList.getPeopleWithEvenCedula();;


        peopleList.imprimirHaciaAtras();



    }

}
