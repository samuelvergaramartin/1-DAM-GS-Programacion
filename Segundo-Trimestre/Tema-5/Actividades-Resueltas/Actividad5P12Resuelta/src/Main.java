public class Main {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];

        for(int fila = 0; fila < matriz.length; fila++) {
            for(int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = 10 * fila + columna;
            }
        }

        for(int fila[] : matriz) {
            for(int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}