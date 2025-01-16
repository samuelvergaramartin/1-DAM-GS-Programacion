import java.util.Scanner;
import static java.util.Locale.US;
import static java.util.Arrays.copyOf;

public class Main {
    public static void main(String[] args) {
        double sueldos[] = new double[0], sueldo, mediaSueldo;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(US);

        System.out.print("Introduce tu sueldo: ");
        sueldo = sc.nextDouble();

        while (sueldo != -1) {
            sueldos = copyOf(sueldos, sueldos.length + 1);
            sueldos[sueldos.length - 1] = sueldo;
            System.out.print("Introduce tu sueldo: ");
            sueldo = sc.nextDouble();
        }

        ordenarDecrecientemente(sueldos);

        mediaSueldo = media(sueldos);

        System.out.println(java.util.Arrays.toString(sueldos));
        System.out.println("Sueldo máximo: " + sueldos[0]);
        System.out.println("Sueldo minimo: " + sueldos[sueldos.length - 1]);
        System.out.println("Media de los sueldos: " + mediaSueldo);
    }

    private static double media(double t[]) {
        double media = 0;

        for(double e : t) {
            media+= e;
        }

        media /= t.length;

        return media;
    }

    private static void ordenarDecrecientemente(double t[]) {
        double aux[] = new double[t.length];
        
        for(int i = 0; i < t.length; i++) {
            aux[i] = t[i];
            t[i] = 0;
        }

        for(int i = t.length - 1, x = 0; i >= 0 && x < t.length; i-- , x++) {
            t[x] = aux[i];
        }
    }
}