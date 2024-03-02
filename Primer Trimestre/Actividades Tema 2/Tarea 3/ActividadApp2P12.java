/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadApp2P12 {

    public static void main(String[] args) {
        int dni, letra;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el numero de tu DNI: ");
        dni = sc.nextInt();

        letra = dni % 22;
        switch (letra) {
            case 0 -> System.out.println("El dni con letra quedaria " + dni + "T");
            case 1 -> System.out.println("El dni con letra quedaria " + dni + "R");
            case 2 -> System.out.println("El dni con letra quedaria " + dni + "W");
            case 3 -> System.out.println("El dni con letra quedaria " + dni + "A");
            case 4 -> System.out.println("El dni con letra quedaria " + dni + "G");
            case 5 -> System.out.println("El dni con letra quedaria " + dni + "M");
            case 6 -> System.out.println("El dni con letra quedaria " + dni + "Y");
            case 7 -> System.out.println("El dni con letra quedaria " + dni + "F");
            case 8 -> System.out.println("El dni con letra quedaria " + dni + "P");
            case 9 -> System.out.println("El dni con letra quedaria " + dni + "D");
            case 10 -> System.out.println("El dni con letra quedaria " + dni + "X");
            case 11 -> System.out.println("El dni con letra quedaria " + dni + "B");
            case 12 -> System.out.println("El dni con letra quedaria " + dni + "N");
            case 13 -> System.out.println("El dni con letra quedaria " + dni + "J");
            case 14 -> System.out.println("El dni con letra quedaria " + dni + "Z");
            case 15 -> System.out.println("El dni con letra quedaria " + dni + "S");
            case 16 -> System.out.println("El dni con letra quedaria " + dni + "Q");
            case 17 -> System.out.println("El dni con letra quedaria " + dni + "V");
            case 18 -> System.out.println("El dni con letra quedaria " + dni + "H");
            case 19 -> System.out.println("El dni con letra quedaria " + dni + "L");
            case 20 -> System.out.println("El dni con letra quedaria " + dni + "C");
            case 21 -> System.out.println("El dni con letra quedaria " + dni + "K");
            case 22 -> System.out.println("El dni con letra quedaria " + dni + "E");
        }
        sc.close();
        System.exit(0);
    }
}
