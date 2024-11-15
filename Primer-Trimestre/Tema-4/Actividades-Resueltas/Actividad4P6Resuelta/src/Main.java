import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        boolean primo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        primo = esPrimo(num);

        System.out.println(primo ? "Es primo" : "No es primo");
    }

    static boolean esPrimo(int num) {
        int contador = 0;
        boolean resultado = false;


        for(int j = 1; j <= num; j++) {
            if(num%j == 0) contador++;
        }

        if(contador <= 2) resultado = true;

        return resultado;
    }
}