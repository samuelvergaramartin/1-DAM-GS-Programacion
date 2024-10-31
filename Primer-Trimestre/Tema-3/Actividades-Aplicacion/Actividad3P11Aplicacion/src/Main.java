import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, resto, contador = 0;
        String resultado = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        resto = num % 2;
        num /= 2;
        contador++;
        resultado = resto + resultado;

        while (num > 0) {
            resto = num % 2;
            num /= 2;
            contador++;
            resultado = resto + resultado;
        }

        System.out.println(resultado);
    }
}