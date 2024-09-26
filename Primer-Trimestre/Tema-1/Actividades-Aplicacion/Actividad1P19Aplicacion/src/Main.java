import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nEntradasInfantiles, nEntradasAdultos;
        final double precioEntradaInfantil = 15.50, precioEntradaAdulto = 20.0;
        double total;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de entradas infantiles a comprar: ");
        nEntradasInfantiles = sc.nextInt();

        System.out.print("Introduzca el numero de entradas de adultos a comprar: ");
        nEntradasAdultos = sc.nextInt();

        total = (nEntradasAdultos * precioEntradaAdulto) + (nEntradasInfantiles * precioEntradaInfantil);
        total = total >= 100 ? (total*0.95) : total;

        System.out.println("El precio total es: " + total);
    }
}