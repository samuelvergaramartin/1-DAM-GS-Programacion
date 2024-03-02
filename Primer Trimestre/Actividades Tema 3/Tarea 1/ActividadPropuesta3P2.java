/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadPropuesta3P2 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        
        for(i = sc.nextInt();i <= 10; i++) {
            if(i <= 0) {
            System.out.println("ERROR: El numero introducido debe ser mayor que 0.");
            sc.close();
            System.exit(1);
            }
            System.out.println("Eco...");
        }
        sc.close();
        System.exit(0);
    }
}