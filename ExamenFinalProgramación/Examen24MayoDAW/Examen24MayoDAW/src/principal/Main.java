package principal;


public class Main {
    
    public static int menu() {
        
        int opcion = 0;
        
        do {
            System.out.println(" -- MENU --");
            System.out.println("1. Introducir alumnado");
            System.out.println("2. Eliminar alumnado");
            System.out.println("3. Introducir nota de alumno/a");
            System.out.println("4. Mostrar información (sin notas) de todos los alumnos del grupo");
            System.out.println("5. Mostrar todas las notas de un alumno");
            System.out.println("6. Mostrar el nombre de todos los alumnos NEAE");
            System.out.println("0. Salir");
            opcion = EntradaTeclado.pedirEntero("Introduzca una opcion: ");
        } while ((opcion < 0) || (opcion > 6));
        
        return opcion;
    }
    
    


    public static void main(String[] args) {
        
        int opcion = 0;
        

        do {
            opcion = menu();
            
            switch (opcion) {
                case 1 -> {
                    
                }
                case 2 -> {
                    
                }
                case 3 -> {
                    
                }
                case 4 -> {
                    
                }
                case 5 -> {
                    
                }
                case 6 -> {
                    
                }
            }

        } while (opcion != 0); 
        
    }
    
}