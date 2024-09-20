import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, numASumar, numeroMultiplo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        System.out.print("Cual es el numero del multiplo?: ");
        numeroMultiplo = sc.nextInt();

        numASumar = (num < numeroMultiplo) ? (numeroMultiplo - num) : (numeroMultiplo - (num%numeroMultiplo));

        System.out.println(numASumar);
    }
}