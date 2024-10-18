import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        if(num%2 == 0) {
            System.out.println("El numero introducido es par");
        }
        else {
            System.out.println("El numero introducido es impar.");
        }

        while (num >=0) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();

            if(num%2 == 0) {
                System.out.println("El numero introducido es par");
            }
            else {
                System.out.println("El numero introducido es impar.");
            }
        }
    }
}