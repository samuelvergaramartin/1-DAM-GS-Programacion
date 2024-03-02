import java.util.Scanner;
public class TareaFinal1P19 {
    public static void main(String[] args) {
        int nEntradasInfantiles, nEntradasAdultos;
        final double precioEntradaInfantil = 15.50, precioEntradaAdulto = 20, porcentajeBonoDescuento = 0.05;
        double totalPrecioEntradasInfantiles, totalPrecioEntradasAdultos, total;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de entradas infantiles a comprar: ");
        nEntradasInfantiles = sc.nextInt();

        System.out.print("Ingrese el numero de entradas de adultos a comprar: ");
        nEntradasAdultos = sc.nextInt();

        totalPrecioEntradasInfantiles = nEntradasInfantiles * precioEntradaInfantil;
        totalPrecioEntradasAdultos = nEntradasAdultos * precioEntradaAdulto;

        total = totalPrecioEntradasAdultos + totalPrecioEntradasInfantiles;

        total = total >= 100 ? total = total - (total * porcentajeBonoDescuento) : total;

        System.out.println("El precio total a pagar es " + total +  " euros");

        sc.close();
    }
}
