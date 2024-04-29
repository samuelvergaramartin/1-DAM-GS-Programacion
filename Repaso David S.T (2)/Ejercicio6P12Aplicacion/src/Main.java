import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word, adininado = "", input;
        char letras[], in, tempChar[], adivinadoArray[];
        int caracteres = 0, intentosRestantes = 7;

        System.out.print("Jugador A: Introduzca una palabra: ");
        word = sc.next();

        word = word.toLowerCase();

        letras = word.toCharArray();

        for(int i = caracteres; i < letras.length; i++) {
            caracteres++;
            adininado+= "-";
        }
        do {
            System.out.println(adininado);
            System.out.print("Jugador B: Introduzca una palabra o caracter: ");
            input = sc.next();
            input = input.toLowerCase();
            boolean control = false;
            if(input.length() == 1) {
                tempChar = input.toCharArray();
                adivinadoArray = adininado.toCharArray();
                in = tempChar[0];
                tempChar = null;

                tempChar = word.toCharArray();
                for(int i = 0; i < tempChar.length; i++) {
                    if(tempChar[i] == in) {
                        adivinadoArray[i] = in;
                        control = true;
                    }
                }
                if(!control)  {
                    intentosRestantes--;
                    System.out.println("Incorrecto! No existe ese caracter en la palabra.");
                    System.out.println("Intentos restantes: " + intentosRestantes);
                }
                adininado = "";
                for(int i = 0; i < adivinadoArray.length; i++) {
                    adininado+= adivinadoArray[i];
                }
            }
            if(input.length() > 1) {
                if(input.equals(word)) adininado = input;
                else {
                    intentosRestantes--;
                    System.out.println("Incorrecto! Palabra incorrecta!");
                    System.out.println("Intentos restantes: " + intentosRestantes);
                }
            }
        }
        while (!adininado.equals(word) && intentosRestantes > 0);
        if(intentosRestantes == 0) System.out.println("Meeek Meeek Meeek! Has perdido! Tu cabeza ha salido por los aires.");
        else System.out.println("Correcto! Has acertado la palabra!");

    }
}