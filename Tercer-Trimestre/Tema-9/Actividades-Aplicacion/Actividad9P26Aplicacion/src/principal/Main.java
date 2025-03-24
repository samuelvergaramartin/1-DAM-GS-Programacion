package principal;

import socios.ComparaEdades;
import socios.Socio;

public class Main {
    public static void main(String[] args) {
        Socio socios[] = {
                new Socio(1, "A", "10-10-2010"),
                new Socio(2, "B", "10-10-2020"),
                new Socio(3, "C", "10-10-2015")
        };
        Lista lista = new Lista();
        ComparaEdades comparaEdades = new ComparaEdades();

        System.out.println("Insertando socios en la lista...");

        for(Socio s : socios) {
            lista.encolar(s);
        }

        System.out.println(lista);
        System.out.println("Ordenando lista de socios por edad...");
        lista.ordenar(comparaEdades);
        System.out.println(lista);
    }
}