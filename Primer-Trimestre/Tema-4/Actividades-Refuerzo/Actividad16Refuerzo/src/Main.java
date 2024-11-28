public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 99999; i++) {
            if(esCapicua(i)) System.out.println(i);
        }
    }

    private static boolean esCapicua(int num) {
        int aux = num, digitos = 0;
        boolean resultado;

        while (aux>0) {
            aux/=10;
            digitos++;
        }

        if(digitos % 2 != 0) resultado = false;
        else {
            int mitad = digitos/2;
            int mitadDerecha = num%(int)Math.pow(10, mitad);
            int mitadIzquierda = num/(int)Math.pow(10, mitad);

            aux = 0;

            for(int i = 1; i <= mitad; i++) {
                if(aux != 0) aux*=10;

                aux+= mitadDerecha%10;
                mitadDerecha/=10;
            }

            mitadDerecha = aux;

            if(mitadDerecha == mitadIzquierda) resultado = true;
            else resultado = false;
        }

        return resultado;
    }
}