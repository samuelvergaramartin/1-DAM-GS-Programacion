import java.util.*;
public class example {
    public static void main(String[] args) {
        double num;
        char c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextDouble();
        System.out.println("Has leido el numero " + num);

        System.out.print("Introduce un numero: ");
        num = sc.nextDouble();
        System.out.println("Has leido el numero " + num);

        //limpieza de buffer
        sc.nextLine();

        System.out.print("Introduce un caracter: ");
        c = sc.nextLine().charAt(0);
        System.out.println("Has leido el caracter " + c);

        sc.close();
        System.exit(0);
    }
}