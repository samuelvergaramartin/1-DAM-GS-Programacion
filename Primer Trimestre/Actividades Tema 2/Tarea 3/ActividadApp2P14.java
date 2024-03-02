import java.util.Scanner;

/**
 * @author Samuel Vergara Martín
 */
public class ActividadApp2P14 {
    public static void main(String[] args) {
        int num, decena, unidad;
        String stringNum = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entre el 1 al 99: ");
        num = sc.nextInt();

        decena = num / 10;
        unidad = num % 10;

        if(num < 0 || num > 99) {
            System.out.println("ERROR: El numero introducido debe ser entre 1 y 99");
            sc.close();
            System.exit(1);
        }
            switch (unidad) {
                case 1 -> stringNum = "uno";
                case 2 -> stringNum = "dos";
                case 3 -> stringNum = "tres";
                case 4 -> stringNum = "cuatro";
                case 5 -> stringNum = "cinco";
                case 6 -> stringNum = "seis";
                case 7 -> stringNum = "siete";
                case 8 -> stringNum = "ocho";
                case 9 -> stringNum = "nueve";
            }
            switch (decena) {
                case 0 -> {
                    System.out.println(stringNum);
                }
                case 1 -> {
                    switch (unidad) {
                        case 0 -> {
                            stringNum = "Diez";
                            System.out.println(stringNum);
                        }
                        case 1 -> {
                            stringNum = "Once";
                            System.out.println(stringNum);
                        }
                        case 2 -> {
                            stringNum = "Doce";
                            System.out.println(stringNum);
                        }
                        case 3 -> {
                            stringNum = "Trece";
                            System.out.println(stringNum);
                        }
                        case 4 -> {
                            stringNum = "Catorce";
                            System.out.println(stringNum);
                        }
                        case 5 -> {
                            stringNum = "Quince";
                            System.out.println(stringNum);
                        }
                        case 6, 7, 8, 9 -> {
                            System.out.println("Dieci" + stringNum);
                        }
                    }
                }
                case 2 -> {
                    switch(unidad) {
                        case 0 -> {
                            System.out.println("Veinte");
                        }
                        default -> {
                            System.out.println("Veinti" + stringNum);
                        }
                    }
                }
                case 3 -> {
                    switch(unidad) {
                        case 0 -> {
                            System.out.println("Treinta");
                        }
                        default -> {
                            System.out.println("Treinta y " + stringNum);
                        }
                    }
                }
                case 4 -> {
                    switch(unidad) {
                        case 0 -> {
                            System.out.println("Cuarenta");
                        }
                        default -> {
                            System.out.println("Cuarenta y " + stringNum);
                        }
                    }
                }
                case 5 -> {
                    switch(unidad) {
                        case 0 -> {
                            System.out.println("Cincuenta");
                        }
                        default -> {
                            System.out.println("Cincuenta y " + stringNum);
                        }
                    }
                }
                case 6 -> {
                    switch(unidad) {
                        case 0 -> {
                            System.out.println("Sesenta");
                        }
                        default -> {
                            System.out.println("Sesenta y " + stringNum);
                        }
                    }
                }
                case 7 -> {
                    switch(unidad) {
                        case 0 -> {
                            System.out.println("Setenta");
                        }
                        default -> {
                            System.out.println("Setenta y " + stringNum);
                        }
                    }
                }
                case 8 -> {
                    switch(unidad) {
                        case 0 -> {
                            System.out.println("Ochenta");
                        }
                        default -> {
                            System.out.println("Ochenta y " + stringNum);
                        }
                    }
                }
                case 9 -> {
                    switch(unidad) {
                        case 0 -> {
                            System.out.println("Noventa");
                        }
                        default -> {
                            System.out.println("Noventa y " + stringNum);
                        }
                    }
                }
            }
            sc.close();
            System.exit(0);
    }
}
