import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        String result = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero del 1 al 99: ");
        num = sc.nextInt();

        if(num >= 1 && num <= 99) {
            switch (num) {
                case 1: result = "uno";
                break;
                case 2: result = "dos";
                break;
                case 3: result = "tres";
                break;
                case 4: result = "cuatro";
                break;
                case 5: result = "cinco";
                break;
                case 6: result = "seis";
                break;
                case 7: result = "siete";
                break;
                case 8: result = "ocho";
                break;
                case 9: result = "nueve";
                break;
                default: {
                    switch (num) {
                        case 10: result = "diez";
                        break;
                        case 11: result = "once";
                        break;
                        case 12: result = "doce";
                        break;
                        case 13: result = "trece";
                        break;
                        case 14: result = "catorce";
                        break;
                        case 15: result = "quince";
                        break;
                        case 16: result = "dieciseis";
                        break;
                        case 17: result = "diecisiete";
                        break;
                        case 18: result = "dieciocho";
                        break;
                        case 19: result = "diecinueve";
                        break;
                        case 20: result = "veinte";
                        break;
                        default: {
                            switch (num / 10) {
                                case 2: result = "veinti";
                                break;
                                case 3: result = "treinta";
                                break;
                                case 4: result = "cuarenta";
                                break;
                                case 5: result = "cincuenta";
                                break;
                                case 6: result = "sesenta";
                                break;
                                case 7: result = "setenta";
                                break;
                                case 8: result = "ochenta";
                                break;
                                case 9: result = "noventa";
                                break;
                            }
                            switch (num % 10) {
                                case 0: result += "";
                                break;
                                case 1: result += " y uno";
                                break;
                                case 2: result += " y dos";
                                break;
                                case 3: result += " y tres";
                                break;
                                case 4: result += " y cuatro";
                                break;
                                case 5: result += " y cinco";
                                break;
                                case 6: result += " y seis";
                                break;
                                case 7: result += " y siete";
                                break;
                                case 8: result += " y ocho";
                                break;
                                case 9: result += " y nueve";
                                break;
                            }
                        }
                    }
                }

            }
            System.out.println(result);
        }
        else System.out.println("ERROR: Número introducido inválido.");
    }
}