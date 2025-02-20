public class Main {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto(), conjunto2 = new Conjunto();

        conjunto2.insertar(2);
        conjunto.insertar(conjunto2);
    }
}