import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Futbolista futbolistas[] = new Futbolista[5];
        ComparaNombres comparaNombres = new ComparaNombres();
        ComparaEdades comparaEdades = new ComparaEdades();

        futbolistas[0] = new Futbolista("12345", 88, 999, "Buenas noches");
        futbolistas[1] = new Futbolista("12346", 999, 2, "A");
        futbolistas[2] = new Futbolista("75475", 765, 10000, "Pepito");
        futbolistas[3] = new Futbolista("86534", 0, 1234, "Berta");
        futbolistas[4] = new Futbolista("97592", 34, 1, "Final");

        System.out.println(Arrays.toString(futbolistas));

        System.out.println("Ordenados por DNI");

        Comparator comparaDNI = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Futbolista) o1).getDNI().compareTo(((Futbolista) o2).getDNI());
            }
        };

        Arrays.sort(futbolistas, comparaDNI);

        System.out.println(Arrays.toString(futbolistas));

        System.out.println("Ordenados por nombre");

        Arrays.sort(futbolistas, comparaNombres);

        System.out.println(Arrays.toString(futbolistas));

        System.out.println("Ordenados por edad");

        Arrays.sort(futbolistas, comparaEdades);

        System.out.println(Arrays.toString(futbolistas));
    }
}