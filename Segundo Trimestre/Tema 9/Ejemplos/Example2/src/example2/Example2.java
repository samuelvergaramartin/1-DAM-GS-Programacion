package example2;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Socio socios[] = {
            new Socio(1, "Pepe", "01-03-1987"),
            new Socio(5, "Rosa", "12-10-2000"),
            new Socio(2, "Marta", "10-07-2010")
        };
        
        Arrays.sort(socios);
        System.out.println(Arrays.deepToString(socios));
       
        Arrays.sort(socios, new ComparaEdades().reversed());
        System.out.println(Arrays.deepToString(socios)); 
        
        /*Arrays.sort(socios, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Socio).o2).edad() - ((Socio).o1).edad();
            }
        });*/
        
        
    }
    
}
