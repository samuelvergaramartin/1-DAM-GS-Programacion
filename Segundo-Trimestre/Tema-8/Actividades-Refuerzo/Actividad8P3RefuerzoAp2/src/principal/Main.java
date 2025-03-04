package principal;

import animales.*;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Lola", 2);
        Perro perro = new Perro("Lucas", 3, "Dalmata");
        Canario canario = new Canario("Piolin", 67);
        Pinguino pinguino = new Pinguino("Leonardo", 34);
        Lagarto lagarto = new Lagarto("Feo", 34);

        System.out.println(gato);
        System.out.println(perro);
        System.out.println(canario);
        System.out.println(pinguino);
        System.out.println(lagarto);

        gato.jugar();
        perro.ladrar();
        canario.cantar();
        pinguino.darPicotazo();
        lagarto.comerInsectos();
    }
}