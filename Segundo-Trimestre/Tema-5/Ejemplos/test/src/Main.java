import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class Main {
    public static void main(String[] args) {
        int posicion = 1;
        String menu = seleccionarOpcionMenu("arriba", 1);
        boolean solicitudDeSalida = false;
        System.out.println("Menu de Opciones");
        do {
            //System.out.println("\r" + menu);

            addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {
                    int tecla = e.getKeyCode();
                    if(tecla == KeyEvent.VK_DOWN) {
                        System.out.println("Se ha pulsado la flecha hacia abajo");
                    }
                    if(tecla == KeyEvent.VK_UP) {
                        System.out.println("Se ha pulsado la flecha hacia arriba");
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }
        while (!solicitudDeSalida);

    }

    private static String seleccionarOpcionMenu(String direccion, int posActual) {
        String opcion1 = "  1 - Saludo de la máquina",
        opcion2 = "  2 - Iniciar cuenta atrás!",
        opcion3 = "  3 - Salir del programa";
        String resultado = "";

        switch (direccion) {
            case "arriba": {
                switch (posActual) {
                    case 1, 2: {
                        resultado+= "> 1 - Saludo de la máquina\n";
                        resultado+= opcion2 + "\n";
                        resultado+= opcion3 + "\n";
                        break;
                    }
                    case 3: {
                        resultado+= opcion1 + "\n";
                        resultado+= "> 2 - Iniciar cuenta atrás!\n";
                        resultado+= opcion3 + "\n";
                        break;
                    }
                }
                break;
            }
            case "abajo": {
                switch (posActual) {
                    case 1: {
                        resultado+= opcion1 + "\n";
                        resultado+= "> 2 - Iniciar cuenta atrás!\n";
                        resultado+= opcion3 + "\n";
                        break;
                    }
                    case 2, 3: {
                        resultado+= opcion1 + "\n";
                        resultado+= opcion2 + "\n";
                        resultado+= "> 3 - Salir del programa\n";
                        break;
                    }
                }
            }
        }

        return resultado;
    }

    private static void cuentaAtras() {
        for(int i = 10; i >= 0; i--) {
            System.out.print("\r" + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) {}
        }
    }
}