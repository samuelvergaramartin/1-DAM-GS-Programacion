/**
 * @author Samuel Vergara Martín
 */

 public class Actividad5P4 {
    public static void main(String[] args) {
        int myArray[] = {5,2,6,8,3},resultado;
        resultado = maximo(myArray);

        System.out.println(resultado);
    }
    static int maximo(int t[]) {
        int max = t[0];

        for(int i : t) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }
 }