/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad2P14 {
    public static void main(String[] args) {
        int diasDelMes,dia,mes,year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dia: ");
        dia = sc.nextInt();

        System.out.print("Mes: ");
        mes = sc.nextInt();

        System.out.print("Year: ");
        year = sc.nextInt();

        diasDelMes = switch(mes) {
            case 2: {
                yield 28;
            }
            case 4,6,9,11: {
                yield 30;
            }
            default: {
                yield 31;
            }
        };
        dia++;

        if(dia > diasDelMes) {
            dia = 1;
            mes++;
            if(mes > 12) {
                mes = 1;
                year++;
            }
        }
        if(year == 0) {
            year = 1;
        }

        System.out.println(dia + "/" + mes + "/" + year);
        sc.close();
        System.exit(0);
    }
}
