import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character x;
      do {
          System.out.println("Pulsa una tecla");
          x = sc.next().charAt(0);
      }
      while (!x.toString().equals("a") || !x.toString().equals("d"));
        /*char[] tablero = new char[8];
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
            if(valor.toString().isEmpty()) tablero[i] = ' ';

        }

        for(int i = 0; i < tablero.length; i++) {
            //System.out.print("[" + tablero[i] + "]");
        }

        for (int i = 0; i < 6; i++) {
            for(int x = 0; x < tablero.length; x++) {
                System.out.print("[" + tablero[x] + "]");
            }
            System.out.println();
            moverFantasma(tablero);
        }*/
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