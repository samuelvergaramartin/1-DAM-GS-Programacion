package principal;

import interfaces.Cola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer n;
        Cola cola = new Cola() {
            Lista lista = new Lista();

            @Override
            public void encolar(Integer elemento) {
                lista.insertarAlPrincipio(elemento);
            }

            @Override
            public Integer desencolar() {
                Integer elemento = null;

                if(lista.obtenerNumeroElementos() > 0) {
                    elemento = lista.obtenerNumeroPorIndice(0);
                    lista.eliminarPorIndice(0);
                }

                return elemento;
            }

            @Override
            public Integer cima() {
                return lista.obtenerNumeroPorIndice(0);
            }
        };
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        while (num >= 0) {
            cola.encolar(num);

            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
        }

        System.out.println("Desencolando numeros...");

        n = cola.desencolar();

        while (n != null) {
            System.out.println(n);
            n = cola.desencolar();
        }
    }
}