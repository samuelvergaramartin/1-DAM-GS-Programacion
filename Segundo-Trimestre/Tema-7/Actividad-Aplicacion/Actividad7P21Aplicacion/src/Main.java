public class Main {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto(), conjunto2 = new Conjunto();

        conjunto2.insertar(23);
        conjunto2.insertar(37);
        conjunto2.insertar(4);
        conjunto2.insertar(5);
        conjunto.insertar(conjunto2);
    }
}