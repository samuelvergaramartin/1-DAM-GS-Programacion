import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dia,mes, anio;
        boolean bloqDias = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el dia: ");
        dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        anio = sc.nextInt();

        if(dia >= 1 && dia <= 31) {
            if(mes >= 1 && mes <= 12) {
                if(anio > 0) {
                    switch (mes) {
                        case 2: {
                            if(dia <= 29) {
                                if(dia == 29) {
                                    dia = 1;
                                    bloqDias = true;
                                    mes++;
                                    if(mes > 12) {
                                        mes = 0;
                                        anio++;
                                    }
                                }
                                else mes++;
                            }
                            else System.out.println("Error: El mes de febrero no puede tiene mas de 29 dias.");
                        }
                        break;
                        case 4,6,9,11: {
                            if(dia == 30) {
                                dia = 1;
                                bloqDias = true;
                                mes++;
                                if(mes > 12) {
                                    mes = 0;
                                    anio++;
                                }
                            }
                            else mes++;
                        }
                        break;
                        default: {
                            if(dia == 31) {
                                dia = 1;
                                bloqDias = true;
                                mes++;
                                if(mes > 12) {
                                    mes = 0;
                                    anio++;
                                }
                            }
                            else mes++;
                        }
                    }

                    if(!bloqDias) dia++;

                    System.out.println(dia + "/" + mes + "/" + anio);
                }
                else System.out.println("Error: Formato del año incorrecto.");
            }
            else System.out.println("Error: Formato del mes incorrecto");;
        }
        else System.out.println("Error: Formato del dia incorrecto.");
    }
}