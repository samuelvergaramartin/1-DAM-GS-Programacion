/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad4P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Escribe un numero: ");
        num = sc.nextInt();

        sc.close();
        
        eco(num);

        System.exit(0);
        
    }
    static void eco(int n) {
        for(int i = 1; i<= n; i++) {
            System.out.println("Eco...");
        }
    }  
}