package principal;

public class Main {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto(), conjunto2 = new Conjunto();

        System.out.println(conjunto);
        conjunto.insertarAlFinal(1);
        conjunto.insertarAlFinal(2);
        conjunto.insertarAlFinal(3);
        System.out.println(conjunto);

        conjunto2.insertarAlFinal(3);
        conjunto2.insertarAlFinal(1);
        conjunto2.insertarAlFinal(2);
        System.out.println(conjunto2);

        System.out.println(conjunto.equals(conjunto2));

        conjunto2.insertarAlPrincipio(9);
        System.out.println(conjunto2);
        System.out.println(conjunto.equals(conjunto2));
        conjunto2.eliminarPorIndice(0);
        conjunto2.eliminarPorIndice(0);
        conjunto2.insertarAlFinal(4);
        System.out.println(conjunto2);
        System.out.println(conjunto.equals(conjunto2));
    }
}