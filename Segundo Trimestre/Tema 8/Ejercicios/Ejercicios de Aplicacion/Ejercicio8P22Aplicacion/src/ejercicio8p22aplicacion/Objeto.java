package ejercicio8p22aplicacion;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Objeto extends Object{
    int n = 1;
    Objeto() {
        super();
    }
    /*@Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Recolectando basura...");
        } finally {
            super.finalize();
        }
    }*/
    @Override
    protected void finalize() {
        
    }
}
