public class Main {
    public static void main(String[] args) {
        SintonizadorFM sintonizador1,sintonizador2;

        sintonizador1 = new SintonizadorFM();
        sintonizador2 = new SintonizadorFM(107);

        System.out.println(sintonizador1);
        System.out.println(sintonizador2);

        sintonizador1.bajarFrecuencia();
        System.out.println(sintonizador1.getFrecuencia());

        sintonizador2.subirFrecuencia();
        sintonizador2.subirFrecuencia();
        sintonizador2.subirFrecuencia();
        System.out.println(sintonizador2.getFrecuencia());
    }
}