import java.util.Locale;
import java.util.Scanner;
public class TareaFinal1P22 {
    public static void main(String[] args) {
        double metros,metrosToCM,centimetros;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduce los metros que quieras usar en el programa: ");
        metros = sc.nextDouble();

        metrosToCM = metros * 100;
        centimetros = (int) metrosToCM;
        
        System.out.println("Longitud (en metros): " + metros + "\nParte entera (en centimetros): " + centimetros);

        sc.close();
    }
}
