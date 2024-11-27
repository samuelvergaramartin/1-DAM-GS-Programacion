public class Main {
    public static void main(String[] args) {
        System.out.println(trozoDeNumero(1234, 2, 3));
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

    private static boolean esPrimo(int num) {
        int contador = 0;

        for(int i = num; i > 0; i--) {
            if(num % i == 0) contador++;
        }

        if(contador > 2) return false;
        else return true;
    }

    private static int siguientePrimo(int num) {
        num++;
        while (!esPrimo(num)) num++;

        return num;
    }

    private static int potencia(int base, int exponente) {
        int staticBase = base;

        for(int i = 1; i < exponente; i++) {
            base*= staticBase;
        }
        return base;
    }

    private static int digitos(int num) {
        int digitos = 0;

        num = Math.abs(num);

        if(num == 0) digitos = 1;

        while (num>0) {
            num/=10;
            digitos++;
        }

        return digitos;
    }

    private static int voltea(int num) {
        int resultado = 0;

        while (num>0) {
            if(resultado != 0) resultado*=10;

            resultado+=num%10;
            num/=10;
        }

        return resultado;
    }

    private static int digitoN(int num, int pos) {
        int digitos = digitos(num);
        String numerito;
        if(pos > digitos) return -1;
        else {
            numerito = num + "";
            numerito = numerito.substring(pos-1,pos);
            num = Integer.parseInt(numerito);
            return num;
        }
    }

    private static int posicionDeDigito(int num, int digito) {
        int posicion = -1;

        for(int i = 1; i <= digitos(num); i++) {
            if(digitoN(num, i) == digito && posicion == -1) posicion = i;
        }

        return posicion;
    }

    private static int quitaPorDetras(int num, int nDigitos) {
        int digitos = digitos(num), resultado;
        String numerito = num + "";

        if(nDigitos > digitos) resultado = -1;
        else {
            numerito = numerito.substring(0,nDigitos+1);
            resultado = Integer.parseInt(numerito);
        }

        return resultado;
    }

    private static int quitaPorDelante(int num, int nDigitos) {
        int digitos = digitos(num), resultado;
        String numerito = num + "";

        if(nDigitos > digitos) resultado = -1;
        else {
            numerito = numerito.substring(nDigitos,digitos);
            resultado = Integer.parseInt(numerito);
        }

        return resultado;
    }

    private static int pegaPorDetras(int numero, int numeroAPegar) {
        return Integer.parseInt(numero+""+numeroAPegar);
    }

    private static int pegaPorDelante(int numero, int numeroAPegar) {
        return Integer.parseInt(numeroAPegar+""+numero);
    }

    //Revisar luego
    private static int trozoDeNumero(int num, int posInicial, int posFinal) {
        int digitos = digitos(num), resultado;

        if(posInicial < 1 || posFinal > digitos) resultado = -1;
        else {
            resultado = quitaPorDelante(num, posInicial);
            System.out.println(resultado);
            resultado = quitaPorDetras(resultado, posFinal);
        }

        return resultado;
    }

    private static int juntaNumeros(int num1, int num2) {
        return pegaPorDetras(num1, num2);
    }
}