import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Futbolista futbolistas[] = new Futbolista[3];
        ComparaFutbolistas comparaFutbolistas = new ComparaFutbolistas();

        futbolistas[0] = new Futbolista("12345", 88, 999, "Buenas noches");
        futbolistas[1] = new Futbolista("12346", 88, 2, "A");
        futbolistas[2] = new Futbolista("75475", 765, 10000, "Pepito");

        System.out.println(Arrays.toString(futbolistas));

        System.out.println("Ordenados por edad, si tienen la misma, por nombre.");

        Arrays.sort(futbolistas, comparaFutbolistas);

        System.out.println(Arrays.toString(futbolistas));
    }
}