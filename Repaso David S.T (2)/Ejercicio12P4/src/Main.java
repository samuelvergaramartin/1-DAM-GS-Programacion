import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer table[] = new Integer[0];
        Contenedor<Integer> cola = new Contenedor<>(table);
        Scanner sc = new Scanner(System.in);
        int n, c = 0;

        System.out.println(cola.toString());
        System.out.println("Encolando...");

        do {
            System.out.print("Introuzca un numero: ");
            n = sc.nextInt();

            if(n != -1) {
                cola.encolar(n);
                c++;
            }
        }
        while(n != -1);

        System.out.println(cola.toString());
        System.out.println("Desencolando...");

        do {
            System.out.println(cola.desencolar());
            c--;
        }
        while(c > 0);

        System.out.println(cola.toString());
    }
}