package netcat_utils;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class NetCatConsole {
    private java.util.Scanner privateinput;
    public String stringInput;
    
    public NetCatConsole() {
        this.privateinput = new Scanner(System.in);
    }
    
    public void NetCatScannerBuilder(String type) {
        if(type == "String") {
            stringInput = this.privateinput.nextLine();
        }
    }
    
    public static void print(String output) {
        System.out.print(output);
    }
    
    public static void print(String output, boolean newLine) {
        if(newLine == true) System.out.println(output);
        else System.out.print(output);
    }
    
    public static void printMultiple(String[] outputs) {
        for(int i = 0; i < outputs.length; i++) {
            System.out.println(outputs[i]);
        }
    }
    
    public static void printSeparator() {
        System.out.println(Colors.GREEN + "------------------------------" + Colors.RESET);
    }
}
