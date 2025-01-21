import java.util.Scanner;
import static java.util.Arrays.copyOf;

public class Main {
    public static void main(String[] args) {
        int dorsales[] = new int[0], menoresDeEdad[] = new int[0],dorsal, aux[];
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el dorsal del jugador: ");
        dorsal = sc.nextInt();

        while (dorsal != -1) {
            dorsales = registrarDorsales(dorsales, dorsal);
            System.out.print("Introduce el dorsal del jugador: ");
            dorsal = sc.nextInt();
        }

        aux = new int[dorsales.length];

        //Resetear el Scanner
        sc = null;
        sc = new Scanner(System.in);

        for(int e : dorsales) {
            System.out.print("Dorsal '" + e + "': Es menor de edad?: ");
            if(sc.nextLine().toLowerCase().equals("si")) {
                menoresDeEdad = registrarMenoresDeEdad(menoresDeEdad, e);
            }
        }

        for(int i = 0; i < aux.length; i++) {
            aux[i] = dorsales[i];
        }

        for(int i = 0; i < aux.length; i++) {
            if(estaRegistrado(menoresDeEdad, aux[i])) {
                aux = eliminacion(aux, aux[i]);
            }
        }

        for(int e : aux) {
            System.out.print("Dorsal '" + e + "': Es  antidopaje?: ");
            if(sc.nextLine().toLowerCase().equals("si")) {
                eliminacion(aux, e);
            }
        }

        adelantarMenores(dorsales, menoresDeEdad);

        for(int i = 0; i < dorsales.length; i++) {
            if(!estaRegistrado(aux, dorsales[i]) && !estaRegistrado(menoresDeEdad, dorsales[i])) {
                dorsales = eliminacion(dorsales, dorsales[i]);
            }
        }

        aux = copyOf(aux, 0);

        for(int e : dorsales) {
            System.out.print("Dorsal '" + e + "': Ha pagado la inscripcion?: ");
            if(sc.nextLine().toLowerCase().equals("no")) {
                aux = registrarDorsales(aux, e);
            }
        }

        dorsales = mandarALasUltimasPosiciones(dorsales, aux);
        menoresDeEdad = null;
        aux = null;

        for(int i = 0; i < dorsales.length; i++) {
            switch (i) {
                case 0: {
                    System.out.println("La medalla de oro es para: " + dorsales[i]);
                    break;
                }
                case 1: {
                    System.out.println("La medalla de plata es para: " + dorsales[i]);
                    break;
                }
                case 2: {
                    System.out.println("La medalla de bronce es para: " + dorsales[i]);
                    break;
                }
            }
        }

    }

    private static int[] mandarALasUltimasPosiciones(int dorsales[], int aux[]) {
        for(int i = 0; i < dorsales.length; i++) {
            if(estaRegistrado(aux, dorsales[i])) {
                dorsales = eliminacion(dorsales, dorsales[i]);
            }
        }

        dorsales = copyOf(dorsales, dorsales.length + aux.length);
        System.arraycopy(aux, 0, dorsales, dorsales.length - 1, aux.length);

        return dorsales;
    }

    private static boolean estaRegistrado(int t[], int elemento) {
        boolean encontrado = false;

        for(int i = 0; (i < t.length) && !encontrado; i++) {
            if(t[i] == elemento) encontrado = true;
        }

        return encontrado;
    }

    private static void adelantarMenores(int dorsales[], int menoresDeEdad[]) {
        boolean encontrado;
        int aux = 0;

        for(int i = 0; i < dorsales.length; i++) {
            encontrado = false;
            for(int x = 0; (x < menoresDeEdad.length) && !encontrado; x++) {


                if(dorsales[i] == menoresDeEdad[x]) {
                    if(i > 0) {
                        aux = dorsales[i-1];
                        dorsales[i-1] = menoresDeEdad[x];
                        dorsales[i] = aux;

                    }
                    encontrado = true;
                }
            }
        }
    }

    private static int[] registrarMenoresDeEdad(int menoresDeEdad[], int dorsal) {
        menoresDeEdad = copyOf(menoresDeEdad, menoresDeEdad.length + 1);
        menoresDeEdad[menoresDeEdad.length - 1] = dorsal;

        return menoresDeEdad;
    }

    private static int[] registrarDorsales(int dorsales[], int dorsal) {
        dorsales = copyOf(dorsales, dorsales.length + 1);
        dorsales[dorsales.length - 1] = dorsal;

        return dorsales;
    }

    private static int[] eliminacion(int t[], int elemento) {
        int posElemento = -1;
        for(int i = 0; (i < t.length) && (posElemento == -1); i++) {
            if(t[i] == elemento) posElemento = i;
        }

        if(posElemento != -1) {
            System.arraycopy(t, posElemento + 1, t, posElemento, (t.length - posElemento - 1));
            t = copyOf(t, t.length - 1);
        }

        return t;
    }
}