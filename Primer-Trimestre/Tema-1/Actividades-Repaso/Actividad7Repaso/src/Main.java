public class Main {
    public static void main(String[] args) {
        double precio1 = 23.4, precio2 = 65.4, totalFactura;
        final double baseImposible = 0.21;

        totalFactura = (precio1 + precio2) * (1 + baseImposible);

        System.out.printf("El total de la factura es: %.2f", totalFactura);
    }
}