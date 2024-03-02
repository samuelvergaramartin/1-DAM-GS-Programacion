/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0, num2 = 1, num3, cont;
        
            System.out.print("Dime un número: ");
            cont = sc.nextInt();
            
            
            System.out.print(num + ", " + num2 + ", ");
            
            for (int i = 0; i < cont; i++) {
                
                num3= num + num2;
                
                System.out.print(num3 + ", ");
                
                num = num2;
                num2 = num3;
                
                ++i;
            }
            sc.close();
            System.exit(0);
        
    }
}
