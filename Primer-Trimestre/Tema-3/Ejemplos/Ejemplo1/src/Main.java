import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, menor, mcd;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        a = sc.nextInt();

        System.out.print("Introduce un número: ");
        b = sc.nextInt();

        // Calculo el menor
        menor = (a<b) ? a : b;

        // Hallo el mcd
        mcd = 1;
        while (menor>0 && mcd==1){
            if (a%menor==0 && b%menor==0){
                mcd = menor;
            }
            menor--;
        }

        System.out.println("El MCD es " + mcd);
    }
}