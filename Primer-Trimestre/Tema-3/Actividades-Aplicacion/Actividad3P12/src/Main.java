import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, decimal = 0, base = 1, ultimoDigito;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número binario: ");
        num = sc.nextInt();

        ultimoDigito = num % 10;
        decimal += ultimoDigito * base;
        num /= 10;
        base *= 2;

        while(num > 0) {
            ultimoDigito = num % 10;
            decimal += ultimoDigito * base;
            num /= 10;
            base *= 2;
        }

        System.out.println(decimal);
    }
}