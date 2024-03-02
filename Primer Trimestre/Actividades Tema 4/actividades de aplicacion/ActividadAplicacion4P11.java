/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadAplicacion4P11 {
    public static void main(String[] args) {
        int radio;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        radio = sc.nextInt();

        sc.close();

        Walter(radio);
    }
    static void Walter(int radio) {
        double superficie,volumen;
        superficie = 4 * Math.PI * Math.pow(radio, 2);
        volumen = ((4 * Math.PI) / 3) * Math.pow(radio, 3);

        System.out.println("Superficie: " + superficie);
        System.out.println("Volumen: " + volumen);
    }
}
