/**
 * @author Samuel Vergara Martín
 */
public class ActividadPropuesta5P4 {
    public static void main(String[] args) {
        int resultado, tabla[] = {1,4,7,9,5,3};
        resultado = buscar(tabla, 9);

        System.out.println(resultado);
    }
    static int buscar(int t[], int clave) {
        int resultado = -1,c = 0;
        for(int i : t) {
            if(i == clave) resultado = c;
            c++;
        }
        return resultado;
    }
}
