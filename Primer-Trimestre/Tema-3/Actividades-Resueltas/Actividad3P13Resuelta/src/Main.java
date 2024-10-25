import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nota,aprobados = 0, suspensos = 0, condicionados = 0, contador = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduzca una nota: ");
            nota = sc.nextInt();

            if((nota < 0 || nota > 10)) System.out.println("Error: Nota inválida.");
            else {
                switch (nota) {
                    case 0,1,2,3: suspensos++;
                    break;
                    case 4: condicionados++;
                    break;
                    case 5,6,7,8,9,10: aprobados++;
                    break;
                }

                contador++;
            }
        }
        while (contador < 6 || (nota < 0 || nota > 10));

        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de condicionados: " + condicionados);
        System.out.println("Número de suspensos: " + suspensos);
    }
}