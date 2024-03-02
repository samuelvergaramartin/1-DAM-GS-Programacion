import java.util.Scanner;
/*
 * @author Samuel Vergara Martín
 */
public class TareaFinal1P13 {
    public static void main(String[] args) {
        int n1,n2,n3, n4, m = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        n1 = sc.nextInt();
        n2 = n1 / m;
        n3 = n2 * m;
        n4 = n3 + m;
        if(n1 == n3) {
            System.out.println("El número introducido es múltiplo de " + m);
            sc.close();
            return;
        }
        for(int i = 1; i < m; i++) {
            if(n1 + i == n4) {
                System.out.println("Tienes que sumar " + i + " para ser múltiplo de " + m);
                sc.close();
                return;
            }
            continue;
        }
       sc.close();
    }
}
