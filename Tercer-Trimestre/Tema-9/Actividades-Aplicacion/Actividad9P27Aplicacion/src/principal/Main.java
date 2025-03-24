package principal;

import socios.Socio;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Socio socios[] = {
                new Socio(1, "C", "10-10-2020"),
                new Socio(2, "B", "10-10-2010"),
                new Socio(3, "A", "10-10-2020")
        };
        Lista lista = new Lista();

        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Socio s1 = (Socio) o1, s2 = (Socio) o2;
                int resultado;

                //El compareTo de la Clase Socio compara 2 socios con respecto a sus edades.
                if(s1.compareTo(s2) == 0) {
                    resultado = s1.getNombre().compareTo(s2.getNombre());
                }
                else resultado = s1.compareTo(s2);

                return resultado;
            }
        };

        System.out.println("Insertando socios en la lista...");

        for(Socio s : socios) {
            lista.encolar(s);
        }

        System.out.println(lista);
        System.out.println("Ordenando lista de socios...");
        lista.ordenar(c);
        System.out.println(lista);
    }
}