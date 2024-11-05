import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, numInvertido = 0, cifras;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        if(num >= -999 && num <= 999) {
            if(num < 0) num *= -1;
            if(num<10) cifras = 1;
            else {
                if(num < 100) cifras = 2;
                else cifras = 3;
            }

            if(cifras == 1) numInvertido = num;
            if(cifras == 2) {
                numInvertido = num%10;
                numInvertido *= 10;
                numInvertido += num/10;
            }
            if(cifras == 3) {
                numInvertido = num%10;
                numInvertido *= 10;
                numInvertido += (num %100) / 10;
                numInvertido *= 10;
                numInvertido += num / 100;
            }

            System.out.println(numInvertido);
        }
        else System.out.println("El número introducido no cumple el formato requerido.");
    }
}