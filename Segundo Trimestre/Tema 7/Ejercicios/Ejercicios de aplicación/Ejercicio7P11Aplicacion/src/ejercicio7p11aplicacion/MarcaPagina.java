package ejercicio7p11aplicacion;
import java.util.Scanner;
import static netcat_utils.Colors.CYAN;
import static netcat_utils.Colors.RED;
import static netcat_utils.Colors.YELLOW;
import static netcat_utils.NetCatConsole.printMultiple;
import static netcat_utils.NetCatConsole.printSeparator;

/**
 *
 * @author Samuel Vergara Martín
 */
class MarcaPagina {
    private int paginaActual = 0;
    private Scanner sc = new Scanner(System.in);
    private int opt;
    
    void start() {
        System.out.println(CYAN + "Pagina actual: " +  this.paginaActual);
        String menu[] = {
            CYAN + "1- Proxima pagina",
            CYAN + "2- Obtener informacion ultima pagina leida",
            CYAN + "3- Resetear lectura",
            CYAN + "4- Finalizar lectura"
        };
        
        do {
            printMultiple(menu);
            System.out.print(YELLOW + "Selecciona una opcion: ");
            opt = sc.nextInt();
            switch(opt) {
                case 1: {
                    this.nextPage();
                }
                break;
                case 2: {
                    this.getLastPageRead();
                }
                break;
                case 3: {
                    this.reset();
                }
                break;
                case 4: {
                    System.out.println(CYAN + "Fin del programa");
                }
                break;
                default: {
                    System.out.println(RED + "ERROR: Opcion no valida");
                }
            }
        }
        while(opt != 4);
    }
    
    private void getLastPageRead() {
        printSeparator();
        System.out.println(CYAN + "Ultima pagina leida: " + (this.paginaActual - 1));      
    }
    
    private void nextPage() {
        this.paginaActual++;
        printSeparator();
        System.out.println(CYAN + "Pagina actual: " + this.paginaActual);
    }
    
    private void reset() {
        this.paginaActual = 0;
        printSeparator();
        System.out.println(CYAN + "Pagina actual: " + this.paginaActual);
    }
}
