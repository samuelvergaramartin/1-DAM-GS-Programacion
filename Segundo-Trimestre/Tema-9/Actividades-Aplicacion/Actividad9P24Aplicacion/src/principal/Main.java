package principal;

import socios.ComparaNombres;
import socios.Socio;

public class Main {
    public static void main(String[] args) {
        Socio socios[] = {
                new Socio(1, "B", "10-10-2010"),
                new Socio(2, "A", "10-10-2010"),
                new Socio(3, "C", "10-10-2010")
        };
        ComparaNombres comparaNombres = new ComparaNombres();
        Lista lista = new Lista();

        System.out.println(lista);
        System.out.println("Insertando socios en la lista...");

        for(Socio s : socios) {
            lista.encolar(s);
        }

        System.out.println(lista);
        System.out.println("Ordenando lista por orden natural");
        lista.ordenar();
        System.out.println(lista);
        System.out.println("Ordenando por nombres en orden creciente");
        lista.ordenar(comparaNombres);
        System.out.println(lista);
        System.out.println("Ordenando por nombres en orden decreciente");
        lista.ordenar(comparaNombres.reversed());
        System.out.println(lista);
    }
}