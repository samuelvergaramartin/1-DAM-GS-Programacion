/**
 * @author Samuel Vergara Martín
 * @see - Ejercicio 24 de la realación de refuerzo del tema 3
 */

public class Exercise1 {
    public static void main(String[] args) {
        int altura = 5;
        for (int i = 1; i <= altura; i++) {  //Bucle que controla la fila
            
            for (int y = 1; y <= altura - i; y++) {//Escribo los espacios antes del caracter
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) {
                if (i > 2 && i < altura) {//Escribo caracter o hueco
                    if (x == 1 || x == i) {//Escribimos caracter en la primera y ultima posición
                        System.out.print("*" + " ");
                    } else {
                        System.out.print(" " + " ");//En medio escribo hueco + hueco
                    }
                } else {
                    if(i == 5) {
                        if (x == 1 || x == i) {//Escribimos caracter en la primera y ultima posición
                        System.out.print("*" + " ");
                        } else {
                            System.out.print(" " + " ");//En medio escribo hueco + hueco
                        }
                    }
                    else {
                        System.out.print("*" + " ");//En la ultima fila escribo todo caracteres
                    }
                }
            }
            System.out.println("");//Hago salto de linea
        }
        for (int i = altura - 1; i > 0; i--) {  //Bucle que controla la fila
            
            for (int y = 1; y <= altura - i; y++) {//Escribo los espacios antes del caracter
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) {
                if (i > 2 && i < altura) {//Escribo caracter o hueco
                    if (x == 1 || x == i) {//Escribimos caracter en la primera y ultima posición
                        System.out.print("*" + " ");
                    } else {
                        System.out.print(" " + " ");//En medio escribo hueco + hueco
                    }
                } else {
                    System.out.print("*" + " ");//En la ultima fila escribo todo caracteres
                }
            }
            System.out.println("");//Hago salto de linea
        }
    }
}