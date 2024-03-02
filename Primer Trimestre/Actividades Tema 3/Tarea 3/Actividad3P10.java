/**
 * @author Samuel Vergara Martín
 */
public class Actividad3P10 {
    public static void main(String[] args) {
        int num = 0, cont = 1;
        for(int i = 1; true; i++) {
            if(i%2 != 0) {
                if(cont == 10) break;
                num+=i;
                cont++;
            }
        }
        System.out.println(num);
    }
}
