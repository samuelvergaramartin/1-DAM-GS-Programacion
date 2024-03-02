import java.util.Scanner;
/*
 * @author Samuel Vergara Martín
 */
public class TareaFinal1P18 {
    public static void main(String[] args) {
        int hormigas,aranias,cochinillas,patashormigas,patasaranias,patascochinillas,patasTotales;
        Scanner sc = new Scanner(System.in);

        final int patasHormigas = 6, patasAranias = 8, patasCochinillas = 14;

        System.out.print("Introduce cuantas hormigas hay: ");
        hormigas = sc.nextInt();
        System.out.print("Introduce cuantas arañas hay: ");
        aranias = sc.nextInt();        
        System.out.print("Introduce cuantas cochinillas hay: ");
        cochinillas = sc.nextInt();
        
        patashormigas = hormigas * patasHormigas;
        patasaranias = aranias * patasAranias;
        patascochinillas = cochinillas * patasCochinillas;
        patasTotales = patashormigas + patasaranias + patascochinillas;
        
        System.out.println("Si sumamos las patas de " + hormigas + " hormigas, " + aranias + " arañas y " + cochinillas + " cochinillas nos da un total de " + patasTotales + " patas");
        
        sc.close();
    }
}
