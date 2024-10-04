import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos las variables que necesitamos
        int num, cifras = 0;
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario que introduzca un numero y lo guardamos
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        //Validamos que el numero esté entre 0 y 99999
        if(num >= 0 && num <= 99999) {
            //Ahora vemos cuantas cifras tiene el numero
            if(num < 10) cifras = 1;
            if (num >= 10) {
                if(num < 100) cifras = 2;
                if (num >= 100) {
                    if(num < 1000) cifras = 3;
                    if(num >= 1000) {
                        if(num < 10000) cifras = 4;
                        if(num >= 10000) cifras = 5;
                    }
                }
            }

            System.out.println("El número " + num + " tiene " + cifras + " cifras");
        }
        else System.out.println("Error: El número introducido no es válido");
    }
}