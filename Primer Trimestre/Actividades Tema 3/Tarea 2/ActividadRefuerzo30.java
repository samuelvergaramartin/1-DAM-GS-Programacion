/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo30 {
    public static void main(String[] args) {
        final int lunes = 1, martes = 2, miercoles = 3, jueves = 4, viernes = 5, sabado = 6, domingo = 7, inicioDia = 0, finalDia = 23;
        int dia1,hora1,dia2,hora2,totalHoras = 0, diaActual;
        String primerDia,segundoDia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca la primera hora");
        System.out.print("Dia: ");
        dia1 = sc.nextInt();

        System.out.print("Hora: ");
        hora1 = sc.nextInt();

        System.out.println("Por favor, introduzca la segunda hora");
        System.out.print("Dia: ");
        dia2 = sc.nextInt();

        System.out.print("Hora: ");
        hora2 = sc.nextInt();

        sc.close();

        if(dia1 != lunes && dia1 != martes && dia1 != miercoles && dia1 != jueves && dia1 != viernes && dia1 != sabado && dia1 != domingo) {
            System.out.println("ERROR: El primer dia introducido no es valido.");
            System.exit(1);
        }
        if(dia2 != lunes && dia2 != martes && dia2 != miercoles && dia2 != jueves && dia2 != viernes && dia2 != sabado && dia2 != domingo) {
            System.out.println("ERROR: El segundo dia introducido no es valido.");
            System.exit(1);
        }
        if(hora1 < 0 || hora1 > 23) {
            System.out.println("ERROR: La primera hora introducida no es valida");
            System.exit(1);
        }
        if(hora2 < 0 || hora2 > 23) {
            System.out.println("ERROR: La segunda hora introducida no es valida");
            System.exit(1);
        }
        if(dia1 > dia2 || dia1 == dia2) {
            System.out.println("ERROR: El segundo dia debe ser posterior al primero");
            System.exit(1);
        }

        diaActual = dia1;

        primerDia = switch(dia1) {
            case 1: {
                yield "Lunes";
            }
            case 2: {
                yield "Martes";
            }
            case 3: {
                yield "Miercoles";
            }
            case 4: {
                yield "Jueves";
            }
            case 5: {
                yield "Viernes";
            }
            case 6: {
                yield "Sabado";
            }
            case 7: {
                yield "Domingo";
            }
            default: {
                yield "Dia invalido";
            }
        };
        
        segundoDia = switch(dia2) {
            case 1: {
                yield "Lunes";
            }
            case 2: {
                yield "Martes";
            }
            case 3: {
                yield "Miercoles";
            }
            case 4: {
                yield "Jueves";
            }
            case 5: {
                yield "Viernes";
            }
            case 6: {
                yield "Sabado";
            }
            case 7: {
                yield "Domingo";
            }
            default: {
                yield "Dia invalido";
            }
        };

        for(int i = hora1; i <= finalDia; i++) {
            totalHoras++;
        }

        diaActual++;
        for(boolean control = true; control == true; diaActual++) {
            if(diaActual == dia2) {
                if(hora2 != inicioDia) {
                    for(int i = inicioDia; i < hora2; i++) {
                        totalHoras++;
                    }
                    System.out.println("Entre las " + hora1 + ":00h del " + primerDia + " y las " + hora2 + ":00h del " + segundoDia + " hay " + totalHoras  + " hora/s");
                    control = false;
                }
            }
            else {
                for(int i = inicioDia; i <= finalDia; i++) {
                    totalHoras++;
                    
                }
            }
        }
        System.exit(0);
    }
}
