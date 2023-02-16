package org.example;

public class Zoologico {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Cebra", "F", 1);
        Animal animal2 = new Animal("Caballo", "M", 1);

        animal1.encontrarPareja(animal2);
        animal2.encontrarPareja(animal1);

        Familia familia = new Familia(animal2,animal1);

        familia.tenerHijo("Cebrallo");

        familia.imprimirFamilia();
    }
}
