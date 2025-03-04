package principal;

import animales.Animal;
import animales.Gato;
import animales.Perro;
import personas.Empleado;

public class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado("Juan", "135", 2000);
        Animal a[] = new Animal[2];
        Perro p = new Perro("Firulais", "Caniche");
        Gato g = new Gato("Misufu", "Persa");

        a[0] = p;
        a[1] = g;

        for (Animal animal : a) {
            System.out.println(animal);
        }
    }
}