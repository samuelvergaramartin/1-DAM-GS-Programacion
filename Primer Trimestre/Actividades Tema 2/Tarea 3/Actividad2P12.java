/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad2P12 {
    public static void main(String[] args) {
        int dia,mes,year;
        final int maxFebrero = 28, maxMes = 12, maxYear = 2023, maxMesTipo1 = 30,
        maxMesTipo2 = 31, minDia = 1, minMes = 1, minYear = 1;
        String resultado;
        final String incorrecto = "Fecha incorrecta", correcto = "Fecha correcta";
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero del dia: ");
        dia = sc.nextInt();

        System.out.print("Ingrese el numero del mes: ");
        mes = sc.nextInt();

        System.out.print("Ingrese el numero del year: ");
        year = sc.nextInt();

        if(dia < minDia) {
            System.out.println(incorrecto);
            sc.close();
            System.exit(1);
        }
        if(year < minYear) {
            System.out.println(incorrecto);
            sc.close();
            System.exit(1);
        }
        if(mes < minMes) {
            System.out.println(incorrecto);
            sc.close();
            System.exit(1);
        }
        if(mes > maxMes) {
            System.out.println(incorrecto);
            sc.close();
            System.exit(1);
        }
        if(year > maxYear) {
            System.out.println(incorrecto);
            sc.close();
            System.exit(1);
        }

        resultado = switch(mes) {
            case 2: {
                if(dia > maxFebrero) {
                    yield incorrecto;
                }
                else {
                    yield correcto;
                }
            }
            case 1,3,5,7,8,10,12: {
                if(dia > maxMesTipo2) {
                    yield incorrecto;
                }
                else {
                    yield correcto;
                }
            }
            case 4,6,9,11: {
                if(dia > maxMesTipo1) {
                    yield incorrecto;
                }
                else {
                    yield correcto;
                }
            }
            default: {
               yield incorrecto; 
            }
        };

        if(resultado == incorrecto) {
            System.out.println(resultado);
            sc.close();
            System.exit(1);
        }
        else {
            System.out.println(resultado);
            sc.close();
            System.exit(0);
        }
    }
}