
package errores1;

import java.util.Scanner;
/**
 *
 * @author Rocio
 */
public class Errores1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota1, nota2, nota3, mediaBoletin;
        double mediaExpediente;
        Scanner sc = new Scanner(System.in);
        // Introduzco los datos
        System.out.print("Introduce la nota del primer trimestre: ");
        nota1 = sc.nextInt();
        
        System.out.print("Introduce la nota del segundo trimestre: ");
        nota2 = sc.nextInt();
        
        System.out.print("Introduce la nota del tercer trimestre: ");
        nota3 = sc.nextInt();
        
        // Calculo las medias
        mediaExpediente = (nota1 + nota2 + nota3) / 3.0;
        mediaBoletin = (int) mediaExpediente;
        

        System.out.printf("La media del expediente es: %.2f",mediaExpediente);
        System.out.println("La media del boletín es: " + mediaBoletin);
    }
}
    
        
    

