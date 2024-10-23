import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int apartado = 1;
        int carrera, andar, bicicleta;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca cuantos kilometros has corrido: ");
        carrera = sc.nextInt();

        System.out.print("Introduzca cuantos kilometros has andado: ");
        andar = sc.nextInt();

        System.out.print("Introduczca cuantos kilómetros has recorrido en bicicleta: ");
        bicicleta = sc.nextInt();

        switch (apartado) {
            case 1: {
                while ((carrera > 50 || andar >= 10) && bicicleta >= 100) {
                    System.out.println("Estás en el apartado A");

                    System.out.print("Introduzca cuantos kilometros has corrido: ");
                    carrera = sc.nextInt();

                    System.out.print("Introduzca cuantos kilometros has andado: ");
                    andar = sc.nextInt();

                    System.out.print("Introduczca cuantos kilómetros has recorrido en bicicleta: ");
                    bicicleta = sc.nextInt();
                }
            }
            break;
            case 2: {
                while (carrera == 0 || andar == 0 || bicicleta == 0) {
                    System.out.println("Estás en el apartado B");

                    System.out.print("Introduzca cuantos kilometros has corrido: ");
                    carrera = sc.nextInt();

                    System.out.print("Introduzca cuantos kilometros has andado: ");
                    andar = sc.nextInt();

                    System.out.print("Introduczca cuantos kilómetros has recorrido en bicicleta: ");
                    bicicleta = sc.nextInt();
                }
            }
            break;
            case 3: {
                while ((carrera >= 20 && bicicleta >= 50) || (andar >= 40 && bicicleta >= 60)) {
                    System.out.println("Estás en el apartado C");

                    System.out.print("Introduzca cuantos kilometros has corrido: ");
                    carrera = sc.nextInt();

                    System.out.print("Introduzca cuantos kilometros has andado: ");
                    andar = sc.nextInt();

                    System.out.print("Introduczca cuantos kilómetros has recorrido en bicicleta: ");
                    bicicleta = sc.nextInt();
                }
            }
            break;
        }
    }
}