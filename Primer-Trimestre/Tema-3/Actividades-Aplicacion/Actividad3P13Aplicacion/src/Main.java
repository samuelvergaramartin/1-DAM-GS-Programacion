import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hora, minutos, segundos, segundosAIncrementar;
        boolean bloqSeg = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        hora = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        minutos = sc.nextInt();

        System.out.print("Introduce los segundos: ");
        segundos = sc.nextInt();

        System.out.println("Introduce el número de segundos a incrementar: ");
        segundosAIncrementar = sc.nextInt();

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
                    segundosAIncrementar--;
                    if(!bloqSeg) segundos++;
                }
                else {
                    System.out.println("Error: Formato de segundos incorrecto");
                    segundosAIncrementar = 0;
                }
            }
            else {
                System.out.println("Error: Formato de minutos incorrecto");
                segundosAIncrementar = 0;
            }
        }
        else {
            System.out.println("Error: Formato de la hora incorrecto.");
            segundosAIncrementar = 0;
        }

        bloqSeg = false;

        while (segundosAIncrementar > 0) {
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

            segundosAIncrementar--;
            bloqSeg = false;
        }

        System.out.println(hora + ":" + minutos + ":" + segundos);
    }
}