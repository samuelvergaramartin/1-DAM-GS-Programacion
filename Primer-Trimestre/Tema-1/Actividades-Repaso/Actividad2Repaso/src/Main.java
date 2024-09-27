import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int euros, pesetas;
        //En la constante conversión se almacena cuantas pesetas son un euro
        final int conversion = 166;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad en euros: ");
        euros = sc.nextInt();

        pesetas = euros * conversion;

        System.out.println(euros + " euros son " + pesetas + " pesetas.");
    }
}