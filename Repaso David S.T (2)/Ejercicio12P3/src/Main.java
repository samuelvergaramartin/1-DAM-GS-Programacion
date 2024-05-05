import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer table[] = new Integer[0];
        Contenedor<Integer> pila = new Contenedor<>(table);
        Scanner sc = new Scanner(System.in);
        int n, c = 0;

        System.out.println(pila.toString());
        System.out.println("Apilando...");

        do {
            System.out.print("Introuzca un numero: ");
            n = sc.nextInt();

            if(n != -1) {
                pila.apilar(n);
                c++;
            }
        }
        while(n != -1);

        System.out.println(pila.toString());
        System.out.println("Desapilando...");

        do {
            System.out.println(pila.desapilar());
            c--;
        }
        while(c > 0);

        System.out.println(pila.toString());
    }
}