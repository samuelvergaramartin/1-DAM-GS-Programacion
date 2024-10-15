import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hora, minutos, segundos;
        boolean bloqSeg = false;
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario la hora, minutos y segundos.
        System.out.print("Introduzca la hora: ");
        hora = sc.nextInt();

        System.out.print("Introduzca los minutos: ");
        minutos = sc.nextInt();

        System.out.print("Introduzca los segundos: ");
        segundos = sc.nextInt();

        if(hora >= 0 && hora <= 23) {
            if(minutos >= 0 && minutos <= 59) {
                if(segundos >= 0 && segundos <= 59) {
                    if(segundos + 1 > 59) {
                        segundos = 0;
                        minutos++;
                        bloqSeg = true;
                    }
                    if(minutos > 59) {
                        minutos = 0;
                        hora++;
                    }
                    if(hora > 23) {
                        hora = 0;
                    }
                    if(!bloqSeg) segundos++;

                    System.out.println(hora + " : " + minutos + " : " + segundos);
                }
                else System.out.println("Error: Formato de segundos incorrecto");
            }
            else System.out.println("Error: Formato de minutos incorrecto");
        }
        else System.out.println("Error: Formato de la hora incorrecto.");
    }
}