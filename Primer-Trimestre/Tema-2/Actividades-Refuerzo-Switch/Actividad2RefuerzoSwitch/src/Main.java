import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int switchType = 2;
        int num;
        String result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        if(switchType == 1) {
            switch (num) {
                case 12,1,2 : result = "Invierno";
                break;
                case 3,4,5: result = "Primavera";
                break;
                case 6,7,8: result = "Verano";
                break;
                case 9,10,11: result = "Otoño";
                break;
                default: result = "Error: Numero inválido";
                break;
            }
        }
        else {
            switch (num) {
                case 12,1,2 -> result = "Invierno";
                case 3,4,5 -> result = "Primavera";
                case 6,7,8 -> result = "Verano";
                case 9,10,11 -> result = "Otoño";
                default -> result = "Error: Numero inválido";
            }
        }

        System.out.println(result);
    }
}