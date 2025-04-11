import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Jugador> jugadores = new TreeMap<>();
        Scanner sc;
        int opcion;

        do {
            opcion = menu();
            sc = new Scanner(System.in);
            switch(opcion) {
                case 1: {
                    altaJugador(jugadores, jugadores.size() + 1);

                    break;
                }
                case 2: {
                    int dorsal;

                    System.out.print("Ingrese el Dorsal del jugador a dar de baja: ");
                    dorsal = sc.nextInt();

                    if(eliminarJugador(jugadores, dorsal) == null) {
                        System.out.println("Error: El jugador no estaba dado de alta.");
                    }
                    else System.out.println("Se ha dado de baja correctamente al jugador.");

                    break;
                }
                case 3: {
                    mostrar(jugadores);

                    break;
                }
                case 4: {
                    Posiciones posicion = pedirPosicion();

                    mostrar(jugadores, posicion.toString());

                    for(Jugador jugador : jugadores.values()) {
                        if(jugador.getPosicion().equals(posicion)) System.out.println(jugador);
                    }

                    break;
                }
                case 5: {
                    int dorsal;

                    System.out.print("Ingrese el Dorsal del jugador a modificar: ");
                    dorsal = sc.nextInt();

                    if(editarJugador(jugadores, dorsal)) System.out.println("Se ha modificado correctamente el jugador.");
                    else System.out.println("Error: El jugador no estaba dado de alta.");
                }
            }
        }
        while(opcion != 6);
    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        final String MENU = """
                Menu
                1- Dar de alta un jugador
                2- Dar de baja un jugador
                3- Listar jugadores
                4- Listar jugadores que tienen la misma posición
                5- Modificar jugador
                6- Salir
                """;
        System.out.println(MENU);
        System.out.print("Introduzca una opcion: ");

        return sc.nextInt();
    }

    private static Posiciones pedirPosicion() {
        Scanner sc = new Scanner(System.in);
        Posiciones posicion = null;

        do {
            System.out.print("Introduzca la posición (Portero, Defensa, Centrocampista, Delantero): ");
            try {
                switch (Posiciones.valueOf(sc.nextLine().toUpperCase())) {
                    case PORTERO: {
                        posicion = Posiciones.PORTERO;
                        break;
                    }
                    case DEFENSA: {
                        posicion = Posiciones.DEFENSA;
                        break;
                    }
                    case CENTROCAMPISTA: {
                        posicion = Posiciones.CENTROCAMPISTA;
                        break;
                    }
                    case DELANTERO: {
                        posicion = Posiciones.DELANTERO;
                        break;
                    }
                    default: {
                        System.out.println("TEST: Error: Posición inválida.");
                        break;
                    }
                }
            }
            catch (IllegalArgumentException e) {
                System.out.println("Error: Posición inválida.");
            }
        }
        while (posicion == null);

        return posicion;
    }

    private static double pedirEstatura() {
        Scanner sc = new Scanner(System.in);
        double estatura;

        do {
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = sc.nextDouble();
        }
        while (estatura <= 0);

        return estatura;
    }

    private static int subMenu(int dorsal) {
        Scanner sc = new Scanner(System.in);
        final String MENU = "Menu del jugador (numero de dorsal: " + dorsal + "):\n" + """
                1- Modificar nombre
                2- Modificar posición
                3- Modificar estatura
                4- Guardar cambios y salir
                """;
        System.out.println(MENU);
        System.out.print("Introduzca una opcion: ");

        return sc.nextInt();
    }

    private static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        Scanner sc = new Scanner(System.in);
        String dni, nombre;
        Posiciones posicion = null;
        double estatura;

        System.out.print("Ingrese el DNI del jugador: ");
        dni = sc.nextLine();

        System.out.print("Ingrese el nombre del jugador: ");
        nombre = sc.nextLine();

        posicion = pedirPosicion();

        estatura = pedirEstatura();

        Jugador jugador = new Jugador(dni, nombre, posicion, estatura);

        if(plantilla.containsValue(jugador)) {
            System.out.println("Error: El jugador ya está dado de alta.");
        }
        else {
            plantilla.put(jugador.getDORSAL(), jugador);

            System.out.println("Se ha dado de alta correctamente al jugador.");
        }
    }

    private static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        Jugador jugador = null;

        if(plantilla.containsKey(dorsal)) {
            jugador = plantilla.remove(dorsal);
        }

        return jugador;
    }

    private static void mostrar(Map<Integer, Jugador> plantilla) {
        System.out.println(plantilla);
    }

    private static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {
        for(Jugador jugador : plantilla.values()) {
            if(jugador.getPosicion().equals(Posiciones.valueOf(posicion))) System.out.println(jugador);
        }
    }

    private static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        Scanner sc;
        int op;
        String nombre;
        Posiciones posicion = null;
        double estatura;

        do {
            op = subMenu(dorsal);

            switch(op) {
                case 1: {
                    sc = new Scanner(System.in);
                    System.out.print("Ingrese el nuevo nombre del jugador: ");
                    nombre = sc.nextLine();

                    break;
                }
                case 2: {
                    posicion = pedirPosicion();

                    plantilla.get(dorsal).setPosicion(posicion);

                    break;
                }
                case 3: {
                    sc = new Scanner(System.in);
                    estatura = pedirEstatura();

                    break;
                }
                case 4: {
                    System.out.println("Se han guardado los cambios correctamente.");

                    break;
                }
                default: {
                    System.out.println("Error: Opcion no valida");
                }
            }
        }
        while(op != 4);

        return false;
    }
}