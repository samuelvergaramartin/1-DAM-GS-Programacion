import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SuperCola<Integer> superCola = new SuperCola<>();
        int opcion, numero;

        do {
            System.out.print();
        }
        while (opcion != 5);
    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        final String MENU = """
                Menu
                1- Encolar en cola1
                2- Encolar en cola2
                3- Desencolar de cola1
                4- Desencolar de cola2
                5- Salir
                """;
        System.out.println(MENU);
        System.out.print("Seleccione una opción: ");

        return sc.nextInt();
    }
}