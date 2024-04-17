public class Main {
    public static void main(String[] args) {
        int a, b, res;
        a = 5;
        b = 0;

        try {
            System.out.println(dividir(a,b));
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }
        finally {
            System.out.println("Cerrando recursos...");
        }

        System.out.println("Fin del programa");
    }
    static int dividir(int a , int b) {
        return a / b;
    }
}