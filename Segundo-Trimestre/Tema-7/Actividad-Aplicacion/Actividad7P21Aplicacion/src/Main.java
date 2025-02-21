public class Main {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto(), conjunto2 = new Conjunto();

        conjunto.insertar(100);
        System.out.println(conjunto);
        conjunto2.insertar(23);
        conjunto2.insertar(37);
        conjunto2.insertar(4);
        conjunto2.insertar(5);
        System.out.println(conjunto2);
        conjunto.insertar(conjunto2);
        System.out.println(conjunto);
        System.out.println(conjunto.numeroElementos());

        conjunto.eliminarElemento(100);
        System.out.println(conjunto);
        conjunto.eliminarConjunto(conjunto2);
        System.out.println(conjunto);
        conjunto.muestra();
    }
}