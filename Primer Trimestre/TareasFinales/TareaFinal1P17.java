import java.util.Locale;
import java.util.Scanner;
/*
 * @author Samuel Vergara Martín
 */
public class TareaFinal1P17 {
    public static void main(String[] args) {
        int milimetros,centimetros,metros,metrosToCm;
        Double milimetrosToCm,total;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); 
        
        System.out.print("Introduce la primera distancia en milimetros : ");
        milimetros = sc.nextInt();
        System.out.print("Introduce la segunda distancia en centímetros : ");
        centimetros = sc.nextInt();        
        System.out.print("Introduce la tercera distancia en metros : ");
        metros = sc.nextInt();
        
        
        milimetrosToCm = milimetros / 100.0;
        metrosToCm = metros * 100;
        total = milimetrosToCm + centimetros + metrosToCm;
        
        
        System.out.println("Si sumamos " + milimetros + " milimetros, " + centimetros + " centimetros y " + metros + " metros dandonos un total de " + total + " centimetros");

        sc.close();
    }
}
