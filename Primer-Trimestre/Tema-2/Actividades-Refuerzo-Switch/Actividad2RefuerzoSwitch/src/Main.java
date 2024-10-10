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
                case 1: result = "Invierno";
                break;
                case 2: result = "Invierno";
                break;
                case 3: result = "Primavera";
                break;
                case 4: result = "Primavera";
                break;
                case 5: result = "Primavera";
                break;
                case 6: result = "Verano";
                break;
                case 7: result = "Verano";
                break;
                case 8: result = "Agosto";
                break;
                case 9: result = "Septiembre";
                break;
                case 10: result = "Octubre";
                break;
                case 11: result = "Noviembre";
                break;
                case 12: result = "Diciembre";
                break;
                default: result = "Error: Numero inválido";
                break;
            }
        }
        else {
            switch (num) {
                case 1 -> result = "Enero";
                case 2 -> result = "Febrero";
                case 3 -> result = "Marzo";
                case 4 -> result = "Abril";
                case 5 -> result = "Mayo";
                case 6 -> result = "Junio";
                case 7 -> result = "Julio";
                case 8 -> result = "Agosto";
                case 9 -> result = "Septiembre";
                case 10 -> result = "Octubre";
                case 11 -> result = "Noviembre";
                case 12 -> result = "Diciembre";
                default -> result = "Error: Número inválido";
            }
        }

        System.out.println(result);
    }
}