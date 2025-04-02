import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Registro> registros = new TreeSet<>();
        int opcion;
        double temperatura;
        Scanner sc;

        do {
            opcion = menu();
            switch(opcion) {
                case 1: {
                    sc = new Scanner(System.in);
                    sc.useLocale(Locale.US);
                    System.out.print("Ingrese la temperatura del nuevo registro: ");
                    temperatura = sc.nextDouble();

                    registros.add(new Registro(temperatura));

                    System.out.println("Registro agregado correctamente");

                    break;
                }
                case 2: {
                    System.out.println(registros);

                    break;
                }
                case 3: {
                    double media = 0.0;

                    System.out.println("Temperatura máxima: " + Collections.max(registros).getTemperatura());
                    System.out.println("Temperatura mínima: " + Collections.min(registros).getTemperatura());

                    for(Registro registro : registros) {
                        media += registro.getTemperatura();
                    }

                    media = media / registros.size();

                    System.out.println("Temperatura media: " + media);

                    break;
                }
                case 4: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opcion no valida");
                    break;
                }
            }
        }
        while(opcion != 4);

    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        final String MENU = """
                Menu de Registros:
                1- Crear Registro
                2- Listar Registros
                3- Mostrar estadística
                4- Salir
                """;
        System.out.println(MENU);
        System.out.print("Introduzca una opcion: ");

        return sc.nextInt();
    }
}