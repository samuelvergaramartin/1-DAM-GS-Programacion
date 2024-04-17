import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(leerEntero());
    }
    static Integer leerEntero() {
        Integer num;
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Introducir entero: ");
                num = sc.nextInt();
                break;
            }
            catch(InputMismatchException ex) {
                System.out.println(ex);
            }
        }

        return num;
    }
}