package principal;

import ejercito.Ejercito;
import personajes.Personaje;
import tablero.Tablero1D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Ejercito ejercito1 = new Ejercito(), ejercito2 = new Ejercito();
        Tablero1D tablero = new Tablero1D(ejercito1, ejercito2);
        boolean finDeLaPartida = false;

        do {
            opcion = menu();

            switch (opcion) {
                case 1: {
                    System.out.println(ejercito1);
                    System.out.println(ejercito2);
                    break;
                }
                case 2: {
                    System.out.println(tablero);
                    break;
                }
                case 3: {
                    finDeLaPartida = realizarAtaque(ejercito1, ejercito2, tablero);
                    break;
                }
                case 4: {
                    finDeLaPartida = realizarAtaque(ejercito2, ejercito1, tablero);
                    break;
                }
                case 0: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opcion no valida.");
                    break;
                }
            }

        }
        while (opcion != 0 && !finDeLaPartida);

        if(ejercito1.ejercitoDerrotado()) System.out.println("El ejercito 2 ha derrotado al ejercito 1.");
        else if(ejercito2.ejercitoDerrotado()) System.out.println("El ejercito 1 ha derrotado al ejercito 2.");

    }
    private static int menu() {
        Scanner sc = new Scanner(System.in);
        final String MENU = """
                MENÚ
                1. Mostrar ejércitos
                2. Mostrar tablero
                3. Ataca ejercito 1
                4. Ataca ejercito 2
                0. Salir
                """;
        System.out.println(MENU);
        System.out.print("Introduce una opcion: ");

        return sc.nextInt();
    }

    private static boolean realizarAtaque(Ejercito e1, Ejercito e2, Tablero1D tablero) {
        int numCasillas,rangoMov, rangoAtaque, posTablero;
        Scanner sc = new Scanner(System.in);
        Personaje personaje = e1.obtenerPersonaje(0), enemigo;
        String nombrePersonaje = personaje.getCODIGO();

        System.out.println(tablero);

        System.out.println("Ataca " + nombrePersonaje);

        rangoMov = personaje.getRangoMovimiento();
        rangoAtaque = personaje.getAlcanceAtaque();
        posTablero = personaje.getPosTablero();

        do {
            System.out.print("Indica el número de casillas [-" + rangoMov + "..." + rangoMov + "]: ");
            numCasillas = sc.nextInt();
        }
        while ((numCasillas < -rangoMov || numCasillas > rangoMov) || ((posTablero + numCasillas) < 1 || (posTablero + numCasillas) > 20) ||
        !tablero.obtenerPersonaje(posTablero + numCasillas).equals("    "));

        posTablero = personaje.getPosTablero() + numCasillas;
        tablero.moverPersonaje(posTablero, personaje);
        personaje.setPosTablero(posTablero);

        for(int i = posTablero - rangoAtaque; i <= posTablero + rangoAtaque; i++) {
            if(!tablero.obtenerPersonaje(i).equals("    ") && e2.obtenerPersonajePorPosicionTablero(i) != null) {
                enemigo = e2.obtenerPersonajePorPosicionTablero(i);
                enemigo.recibirAtaque(personaje.atacar());
                System.out.println(nombrePersonaje + " ataca a " + enemigo.getCODIGO());
                System.out.println("Puntos de daño: " + personaje.atacar());
                System.out.println("Nivel de vida de " + enemigo.getCODIGO() + ": " + enemigo.getVida());
                if(enemigo.getVida() == 0) {
                    e2.eliminarPersonaje(e2.obtenerIndicePersonaje(enemigo));
                    tablero.eliminarPersonaje(i);
                    System.out.println("El personaje " + enemigo.getCODIGO() + " ha muerto.");
                }
            }
        }

        System.out.println(tablero);

        return e1.ejercitoDerrotado() || e2.ejercitoDerrotado();
    }
}