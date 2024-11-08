import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long num;
        int cifras = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextLong();

        do {
            num/= 10;
            cifras++;
        }
        while (num > 0);

        System.out.println("El número tiene " +  cifras + " cifras");
    }
}