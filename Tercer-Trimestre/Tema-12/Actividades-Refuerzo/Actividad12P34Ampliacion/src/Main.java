import java.time.format.DateTimeParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Set<Registro>> registrosTemperaturas = new TreeMap<>();
        Set<Registro> registros = new TreeSet<>();
        int opcion;
        double temperatura;
        String fecha, hora;
        Scanner sc;

        do {
            opcion = menu();
            switch(opcion) {
                case 1: {
                    sc = new Scanner(System.in);
                    sc.useLocale(Locale.US);
                    System.out.print("Ingrese la temperatura del nuevo registro: ");
                    temperatura = sc.nextDouble();

                    sc = new Scanner(System.in);
                    System.out.print("Ingrese la fecha del registro (dd-MM-yyyy): ");
                    fecha = sc.nextLine();

                    try {
                        Registro registro = new Registro(temperatura, fecha);
                        registros.add(registro);
                        registrosTemperaturas.put(registro.getFechaYHora(), registros);

                        System.out.println("Registro agregado correctamente");
                    }
                    catch(DateTimeParseException e) {
                        System.out.println("Error: El formato de la fecha es incorrecto.");
                    }

                    break;
                }
                case 2: {
                    System.out.println(registrosTemperaturas);

                    break;
                }
                case 3: {
                    double media = 0.0;
                    int numRegistros = 0;
                    Set<Double> temperaturasMaximas = new TreeSet<>(), temperaturasMinimas = new TreeSet<>();

                    Iterator<Set<Registro>> it = registrosTemperaturas.values().iterator();

                    while (it.hasNext()) {
                        Set<Registro> temperaturas = it.next();
                        temperaturasMaximas.add(Collections.max(temperaturas).getTemperatura());
                        temperaturasMinimas.add(Collections.min(temperaturas).getTemperatura());

                        for(Registro registro : temperaturas) {
                            media += registro.getTemperatura();
                            numRegistros++;
                        }
                    }

                    System.out.println("Temperatura máxima: " + Collections.max(temperaturasMaximas));
                    System.out.println("Temperatura mínima: " + Collections.min(temperaturasMinimas));

                    media = media / numRegistros;

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