public class Main {
    public static void main(String[] args) {
        Numero numero = new Numero();

        System.out.println(Numero.esNumero(9));
        System.out.println(Numero.esNumero(19.4));
        System.out.println(Numero.esNumero("Hola"));

        System.out.println(numero.sumar(3, "a"));
        System.out.println(numero.sumar("b", 4));
        System.out.println(numero.sumar(2, 3));
        System.out.println(numero.sumar("Hola ", "mundo"));
    }
}