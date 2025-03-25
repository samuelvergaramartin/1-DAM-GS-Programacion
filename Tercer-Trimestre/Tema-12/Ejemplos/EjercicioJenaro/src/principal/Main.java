package principal;

import enums.Posiciones;
import superclases.Jugador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int opcion;
        //Mi equipo va a tener: 2 porteros, 7 defensas, 8 medios, 4 delanteros
        Equipo equipo = new Equipo();

        equipo.setNombre("C.F. Málaga");
        equipo.setCiudad("Málaga");
        for(int i = 0; i < 2; i++) {
            equipo.agregarJugador(new Jugador("P" + i, Posiciones.PORTERO));
        }
        for(int i = 0; i < 7; i++) {
            equipo.agregarJugador(new Jugador("DF" + i, Posiciones.DEFENSA));
        }
        for(int i = 0; i < 8; i++) {
            equipo.agregarJugador(new Jugador("M" + i, Posiciones.MEDIO));
        }
        for(int i = 0; i < 4; i++) {
            equipo.agregarJugador(new Jugador("D" + i, Posiciones.DELANTERO));
        }
        System.out.println(equipo);
        //Scanner sc;
/*
        do {
            opcion = menu();
            switch (opcion) {
                case 1: {
                    break;
                }
                case 2: {
                    System.out.println(equipo);
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    sc = new Scanner(System.in);
                    System.out.print("Introduzca el nombre del equipo: ");
                    equipo.setNombre(sc.nextLine());
                    break;
                }
                case 5: {
                    sc = new Scanner(System.in);
                    System.out.print("Introduzca el nombre de la ciudad: ");
                    equipo.setCiudad(sc.nextLine());
                    break;
                }
                case 0: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opción no valida");
                    break;
                }
            }
        }
        while (opcion != 0);*/
    }

    private static int menu() {
        final String MENU = """
                Menu
                1- Crear un jugador
                2- Mostrar información del equipo
                3- Seleccionar alineación y comenzar nuevo partido
                4- Establecer nombre del equipo
                5- Establecer ciudad del equipo
                0- Salir
                """;
        Scanner sc = new Scanner(System.in);

        System.out.println(MENU);
        System.out.print("Introduzca una opción: ");

        return sc.nextInt();
    }
}