import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, cont = 1, resto = 0;
        boolean calculada = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        while (!calculada) {
            if(Math.pow(cont, 2) == num) calculada = true;
            else {
                if(Math.pow(cont, 2) > num) {
                    calculada = true;
                    cont--;
                    resto = num - (int) Math.pow(cont, 2);
                }
                if(!calculada) cont++;
            }
        }

        System.out.println("La raíz cuadrada aproximada de " + num + " es " + cont + " y su resto es " +  resto);
    }
}