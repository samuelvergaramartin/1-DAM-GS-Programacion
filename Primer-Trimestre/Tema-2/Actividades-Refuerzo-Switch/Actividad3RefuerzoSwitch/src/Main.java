import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int switchType = 1;
        int num;
        String result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 10: ");
        num = sc.nextInt();

        if(num >= 1 && num <= 10) {
            if(switchType == 1) {
                switch (num % 2) {
                    case 0: result = "El doble de " + num + " es " + 2*num;
                    break;
                    default: result = "El triple de " + num + " es " + 3*num;
                    break;
                }
            }
            else {
                switch (num % 2) {
                    case 0 -> result = "El doble de " + num + " es " + 2*num;
                    default -> result = "El triple de " + num + " es " + 3*num;
                }
            }

            System.out.println(result);
        }
        else System.out.println("Error: Número introducido incorrecto.");
    }
}