public class Numero {
    public static boolean esNumero(Object ob) {
        return (ob instanceof Byte) || (ob instanceof Short) || (ob instanceof Integer) || (ob instanceof Long) ||
                (ob instanceof Float) || (ob instanceof Double);
    }

    public boolean sumar(Object a, Object b) {
        boolean resultado = false;

        if((esNumero(a) && esNumero(b))) {
            resultado = true;
            double A, B;
            if(a instanceof Integer) A = (Integer) a;
            else A = (Double) a;
            if(b instanceof Integer) B = (Integer) b;
            else B = (Double) b;
            Double suma = ((Double) A) + ((Double) B);
            System.out.println(suma);
        }
        else if ((a instanceof String) && (b instanceof String)) {
            resultado = true;
            System.out.println((String) a + b);
        }
        else System.out.println("No sumables.");

        return resultado;
    }
}
