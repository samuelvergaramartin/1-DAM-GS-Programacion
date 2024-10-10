import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int switchType = 2;
        int num;
        String result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();

        if(switchType == 1) {
            switch (num) {
                case 0: result = "cero";
                break;
                case 1: result = "uno";
                break;
                case 2: result = "dos";
                break;
                case 3: result = "tres";
                break;
                case 4: result = "cuatro";
                break;
                case 5: result = "cinco";
                break;
                case  6: result = "seis";
                break;
                case 7: result = "siete";
                break;
                case 8: result = "ocho";
                break;
                case 9: result = "nueve";
                break;
                case 10: result = "diez";
                break;
                default: result = "Error: Número inválido";
                break;
            }
        }
        else {
            switch (num) {
                case 0 -> result = "cero";
                case 1 -> result = "uno";
                case 2 -> result = "dos";
                case 3 -> result = "tres";
                case 4 -> result = "cuatro";
                case 5 -> result = "cinco";
                case  6 -> result = "seis";
                case 7 -> result = "siete";
                case 8 -> result = "ocho";
                case 9 -> result = "nueve";
                case 10 -> result = "diez";
                default -> result = "Error: Número inválido";
            }
        }

        System.out.println(result);
    }
}