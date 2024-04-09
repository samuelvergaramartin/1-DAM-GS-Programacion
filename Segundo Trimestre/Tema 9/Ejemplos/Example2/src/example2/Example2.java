package example2;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socio s1 = new Socio(2, "Pepe", "01-03-1987");
        Socio s2 = new Socio(2, "Rosa", "12-10-2000");
        
        System.out.println(s1.compareTo(s2));
    }
    
}
