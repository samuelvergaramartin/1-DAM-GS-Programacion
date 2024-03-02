/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadAplicacion4P13 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        sc.close();

        muestraPares(num);
    }
    static void muestraPares(int n) {
        for(int i = 0; i<= n; i++) {
            if(i%2 == 0) System.out.println(i);
        }
    }
}
