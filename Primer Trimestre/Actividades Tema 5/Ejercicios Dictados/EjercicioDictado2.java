/**
 * @author Samuel Vergara Martín
 * @see - 2 - Haz un programa que genere tres combinaciones de loteria de 6 numeros aleatorios y muestre los 3. Los numeros van del 1 al 49
 */
public class EjercicioDictado2 {
    public static void main(String[] args) {
        int combo1[],combo2[],combo3[];
        combo1 = new int[6];
        combo2 = new int[6];
        combo3 = new int[6];

        combo1 = comboGenerator(combo1);
        lecturaCombo(combo1, 1);

        combo2 = comboGenerator(combo2);
        lecturaCombo(combo2, 2);

        combo3 = comboGenerator(combo3);
        lecturaCombo(combo3, 3);
    }
    static int[] comboGenerator(int[] combo) {
        for(int i = 0;i<combo.length;i++) {
            combo[i] = (int) (Math.random() * 49 + 1);
        }
        return combo;
    }
    static void lecturaCombo(int[] combo, int n) {
        System.out.println("Lectura del combo numero " + n);
        for(int i = 0; i<combo.length; i++) {
            System.out.print(combo[i] + " ");
        }
        System.out.println("");
    }
}
