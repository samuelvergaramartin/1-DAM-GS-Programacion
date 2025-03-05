import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zona principal, compraVenta, vip;
        final String menu = """
                Menu
                ----
                1- Mostrar número de entradas libres
                2- Vender entradas
                3- Salir
                """;
        Scanner sc = new Scanner(System.in);

        principal = new Zona(1000);
        compraVenta = new Zona(200);
        vip = new Zona(25);
    }
}