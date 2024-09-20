import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nota1, nota2, nota3, mediaAcademico;
        double mediaBoletin;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la nota del primer trimestre: ");
        nota1 = sc.nextInt();

        System.out.print("Introduzca la nota del segundo trimestre: ");
        nota2 = sc.nextInt();

        System.out.print("Introduzca la nota del tercer trimestre: ");
        nota3 = sc.nextInt();

        mediaBoletin = (nota1 + nota2 + nota3) / 3.0;
        mediaAcademico = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Media del boletin: %.2f",  mediaBoletin);
        System.out.println("\nMedia del expediente academico: " + mediaAcademico);
    }
}