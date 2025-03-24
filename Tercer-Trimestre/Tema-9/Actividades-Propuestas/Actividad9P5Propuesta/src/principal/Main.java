package principal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Socio socios[] = {
                new Socio(1, "A", "10-10-2010"),
                new Socio(2, "C", "10-10-2010"),
                new Socio(3, "B", "10-10-2010"),

        };
        ComparaNombres comparaNombres = new ComparaNombres();

        System.out.println("Tabla sin ordenar");
        System.out.println(Arrays.toString(socios));
        System.out.println("Tabla ordenada por nombres alfabeticamente");
        Arrays.sort(socios, comparaNombres);
        System.out.println(Arrays.toString(socios));
        System.out.println("Tabla ordenada por nombres alfabeticamente de forma reversa");
        Arrays.sort(socios, comparaNombres.reversed());
        System.out.println(Arrays.toString(socios));
    }
}