import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Socio socios[] = {
                new Socio(1, "B", "10-10-2010"),
                new Socio(2, "A", "10-10-2010"),
                new Socio(3, "C", "10-10-2010")
        };
        ComparaNombres comparaNombres = new ComparaNombres();

        System.out.println("Array sin ordenar");
        System.out.println(Arrays.toString(socios));
        System.out.println("Array ordenado");
        Arrays.sort(socios, comparaNombres);
        System.out.println(Arrays.toString(socios));
        System.out.println("Array ordenado a la inversa");
        Arrays.sort(socios, comparaNombres.reversed());
        System.out.println(Arrays.toString(socios));
    }
}