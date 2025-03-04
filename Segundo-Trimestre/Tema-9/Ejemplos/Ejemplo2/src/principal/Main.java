package principal;

import interfaces.Interfaz;

public class Main {
    public static void main(String[] args) {
        Clase clase = new Clase();

        clase.metodoInterfaz();
        clase.metodoOtraInterfaz();

        Interfaz i = new Interfaz() {
            @Override
            public void metodoInterfaz() {
                System.out.println("Metodo interfaz");
                metodoExtra();
            }

            @Override
            public void metodoOtraInterfaz() {
                System.out.println("Método de la otra interfaz");
            }

            public void metodoExtra() {
                System.out.println("Metodo extra, clase anonima");
            }
        };

        i.metodoInterfaz();
    }
}