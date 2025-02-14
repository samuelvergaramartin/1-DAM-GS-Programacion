import java.util.Arrays;

public class Main {
    int tablaEnteros[] = new int[0];

    public static void main(String[] args) {
        Main subMain = new Main();

        for (int i = 1; i <= 10; i++) {
            subMain.insertarFinal(i);
        }

        for (int e : subMain.tablaEnteros) {
            System.out.println(e);
        }
    }

    void insertarFinal(int nuevo) {
        tablaEnteros = Arrays.copyOf(tablaEnteros, tablaEnteros.length + 1);
        tablaEnteros[tablaEnteros.length - 1] = nuevo;
    }
}