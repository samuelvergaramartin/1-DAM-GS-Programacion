import java.util.Scanner;
/*
 * @author Samuel Vergara Martín
 */
public class TareaFinal1P12 {
    public static void main(String[] args) {
        int n1,n2,n3, n4;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        n1 = sc.nextInt();
        n2 = n1 / 7;
        n3 = n2 * 7;
        n4 = n3 + 7;
        if(n1 == n3) {
            System.out.println("El número introducido es múltiplo de 7");
            sc.close();
            return;
        }
        for(int i = 1; i < 7; i++) {
            if(n1 + i == n4) {
                System.out.println("Tienes que sumar " + i + " para ser múltiplo de 7");
                sc.close();
                return;
            }
            continue;
        }
       sc.close();   
    }
}
