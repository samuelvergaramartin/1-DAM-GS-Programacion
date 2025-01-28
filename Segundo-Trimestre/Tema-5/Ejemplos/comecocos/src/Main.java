import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] tablero = new char[8];
        Character valor;
        int posComecocos, posFantasma, posFrutita;

        posComecocos = (int) ((Math.random() * tablero.length));
        posFantasma = (int) ((Math.random() * tablero.length));
        posFrutita = (int) ((Math.random() * tablero.length));

        while (posComecocos == posFantasma || posComecocos == posFrutita || posFantasma == posFrutita) {
            posComecocos = (int) ((Math.random() * tablero.length));
            posFantasma = (int) ((Math.random() * tablero.length));
            posFrutita = (int) ((Math.random() * tablero.length));
        }

        tablero[posComecocos] = 'C';
        tablero[posFantasma] = 'A';
        tablero[posFrutita] = '8';


        for(int i = 0; i < tablero.length; i++) {
            valor = tablero[i];
            if(!valor.equals('C') && !valor.equals('A') && !valor.equals('8')) tablero[i] = ' ';
        }
        mostrarTablero(tablero);
        //System.out.println();
        for(int i = 0; i < 10; i++) {
            System.out.print("Izquierda (A)? O derecha (D): ");
            valor = sc.next().charAt(0);
            switch (valor.toString().toLowerCase().toCharArray()[0]) {
                case 'a', 'd': {
                    try {
                        moverComecocos(tablero, valor.toString().toLowerCase().toCharArray()[0]);
                        mostrarTablero(tablero);
                        Thread.sleep(1000);
                        moverFantasma(tablero);
                        mostrarTablero(tablero);
                    }
                    catch (InterruptedException ex) {}

                    break;
                }
                default: {
                    System.out.println("Error: Lado incorrecto.");
                    break;
                }
            }
        }
        /*for (int i = 0; i < 6; i++) {
            for(int x = 0; x < tablero.length; x++) {
                System.out.print("[" + tablero[x] + "]");
            }
            try {
                Thread.sleep(1000);
                System.out.print("\r");
            }
            catch (InterruptedException ex) {}

            moverFantasma(tablero);
        }*/
    }

    private static void mostrarTablero(char[] tablero) {
        for(int x = 0; x < tablero.length; x++) {
            System.out.print("[" + tablero[x] + "]");
        }
        System.out.println();
    }

    private static void moverComecocos(char tablero[], char lado) {
        int posComecocos = -1;

        for(int i = 0; i < tablero.length && posComecocos == -1; i++) {
            if(tablero[i] == 'C') posComecocos = i;
        }

        if(lado == 'a') {
            if(posComecocos > 0) {
                tablero[posComecocos-1] = 'C';
                tablero[posComecocos] = ' ';
            }
        }
        else {
            if(posComecocos < tablero.length - 1) {
                tablero[posComecocos+1] = 'C';
                tablero[posComecocos] = ' ';
            }
        }
    }

    private static void moverFantasma(char tablero[]) {
        int posFantasma = -1, lado;

        for(int i = 0; i < tablero.length && posFantasma == -1; i++) {
            if(tablero[i] == 'A') posFantasma = i;
        }

        lado = (int) (Math.random() * 2);

        if(lado == 0) {
            if(posFantasma > 0) {
                tablero[posFantasma-1] = 'A';
                tablero[posFantasma] = ' ';
            }
        }
        else {
            if(posFantasma < tablero.length - 1) {
                tablero[posFantasma+1] = 'A';
                tablero[posFantasma] = ' ';
            }
        }
    }
}