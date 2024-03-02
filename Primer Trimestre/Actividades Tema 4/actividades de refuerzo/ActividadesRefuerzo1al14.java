/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadesRefuerzo1al14 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        if(args.length == 0){
            System.out.println("ERROR: No se introdujeron opciones.");
            System.exit(1);
        }
        switch (args[0]) {
            case "1": {
                System.out.print("Introduce un numero: ");
                num = sc.nextInt();
                sc.close();
                boolean capicua = esCapicua(num);
                System.out.println(capicua);
            }  
            break;
            case "2": {
                System.out.print("Introduce un numero: ");
                num = sc.nextInt();
                sc.close();
                boolean primo = esPrimo(num);
                System.out.println(primo);
            }
            break;
            case "3": {
                System.out.print("Introduce un numero: ");
                num = sc.nextInt();
                sc.close();
                int resultado = siguientePrimo(num);
                System.out.println(resultado);
            }
            break;
            case "4": {
                System.out.print("Introduce la base: ");
                num = sc.nextInt();
                System.out.print("Introduce el exponente: ");
                int exponente = sc.nextInt();
                sc.close();

                int potencia = potencia(num, exponente);
                System.out.println(potencia);
            }
            break;
            case "5": {
                System.out.print("Introduce el numero: ");
                num = sc.nextInt();
                sc.close();
                System.out.println(digitos(num));
            }
            break;
            case "6": {
                System.out.print("Introduce un numero: ");
                num = sc.nextInt();
                sc.close();
                int volteado = voltea(num);
                System.out.println(volteado);
            }
            break;
            case "7": {
                System.out.print("Introduce un numero: ");
                num = sc.nextInt();
                System.out.print("Introduce un digito: ");
                int digito = sc.nextInt();
                sc.close();
                digitoN(num, digito);

            }
            break;
            case "8": {
                System.out.print("Introduce un numero: ");
                num = sc.nextInt();
                System.out.print("Introduce un digito: ");
                int digito = sc.nextInt();
                sc.close();
                int posicion = posicionDeDigito(num, digito);

                System.out.println(posicion);
            }
            break;
            case "9": {
                System.out.print("Introduce un numero: ");
                num = sc.nextInt();
                System.out.print("Introduce los digitos a quitar por detras: ");
                int digitos = sc.nextInt();

                sc.close();

                int resultado = quitaPorDetras(num, digitos);

                System.out.println(resultado);
            }
            break;
            case "10": {
                System.out.print("Introduce un numero: ");
                num = sc.nextInt();
                System.out.print("Introduce los digitos a quitar por delante: ");
                int digitos = sc.nextInt();

                sc.close();

                int resultado = quitaPorDelante(num, digitos);

                System.out.println(resultado);
            }
            break;
            case "11": {
                System.out.print("Introduce un numero: ");
                num = sc.nextInt();
                System.out.print("Introduce el digito a pegar por detras: ");
                int digito = sc.nextInt();

                sc.close();

                int resultado = pegaPorDetras(num, digito);

                System.out.println(resultado);
            }
            break;
            case "12": {
                System.out.print("Introduce un numero: ");
                num = sc.nextInt();
                System.out.print("Introduce el digito a pegar por delante: ");
                int digito = sc.nextInt();

                sc.close();

                int resultado = pegaPorDelante(num, digito);

                System.out.println(resultado);
            }
            break;
            case "13": {
                System.out.print("Introduce un numero: ");
                num = sc.nextInt();
                System.out.print("Introduce la posicion inicial: ");
                int posInicial = sc.nextInt();
                System.out.print("Introduce la posicion final: ");
                int posFinal = sc.nextInt();

                sc.close();

                int resultado = trozoDeNumero(num, posInicial, posFinal);

                System.out.println(resultado);
            }
            break;
            case "14": {
                System.out.print("Introduce un numero: ");
                num = sc.nextInt();
                System.out.print("Introduce otro numero: ");
                int num2 = sc.nextInt();

                sc.close();

                int resultado = juntaNumeros(num, num2);

                System.out.println(resultado);
            }
            break;
            default: {
                System.out.println("ERROR: Invalid option.");
            }
            break;
        }
    }
    static boolean esCapicua(int num) {
        int numInvertido;
        boolean capicua = false;
        numInvertido = voltea(num);
        if(num == numInvertido) capicua = true;

        return capicua;
    }
    static boolean esPrimo(int num) {
        int cont = 2, resto;
        boolean primo = true;
        while ((cont < num) && primo) {
            resto = num % cont;
            if (resto == 0) {
                primo = false;
            }
            cont++;
        }
        
        if (primo) {
            return true;
        } else {
            return false;
        }
    }
    static int siguientePrimo(int num) {
        boolean primo = false;
        do {
            num++;
            primo = esPrimo(num);
        }
        while(primo == false);
        return num;
    }
    static int potencia(int base, int exponente) {
        int resultado = (int) Math.pow(base, exponente);
        return resultado;
    }
    static int digitos(int num) {
        int resultado = 0;
        while(num > 0) {
            num = num / 10;
            resultado++;
        }
        return resultado;
    }
    static int voltea(int num) {
        int resultado = 0;
        while(num > 0) {
            resultado = num % 10 + resultado*10;
            num = num / 10;
        }
        return resultado;
    }
    static void digitoN(int num,int digito) {
        int contador = 0;
        int temp;
        temp = num;
        while(temp > 0) {
            temp = temp / 10;
            contador++;
        }
        temp = num;
        while(temp > 0) {
            if(temp%10 == digito) {
                System.out.println(contador);
            }
            temp = temp / 10;
            contador--;
        }
    }
    static int posicionDeDigito(int num, int digito) {
        int numTemp = num,contador = 1;
        boolean control = true;
        numTemp = voltea(numTemp);
        while(numTemp > 0 && control == true) {
            if(numTemp%10 == digito) {
                control = false;
            }
            else {
                numTemp = numTemp / 10;
                contador++;   
            }
        }
        return contador;
    }
    static int quitaPorDetras(int num, int digitos) {
        num = (int) (num / Math.pow(10, digitos));
        return num;
    }
    static int quitaPorDelante(int num, int digitos) {
        int numTemp;
        numTemp = num;
        numTemp = voltea(numTemp);
        numTemp = (int) (numTemp / Math.pow(10, digitos));
        numTemp = voltea(numTemp);
        return numTemp;
    }
    static int pegaPorDetras(int num, int digito) {
        int numTemp = num;
        numTemp = numTemp *10 + digito;
        return numTemp;
    }
    static int pegaPorDelante(int num, int digito) {
        int numTemp = num;
        numTemp = voltea(numTemp);
        numTemp = numTemp * 10 + digito;
        numTemp = voltea(numTemp);
        return numTemp;
    }
    static int trozoDeNumero(int num, int posInicial, int posFinal) {
        int numTemp = num,digitos,digitosAQuitarPorDelante,digitosAQuitarPorDetras;
        digitos = digitos(num);
        digitosAQuitarPorDetras = digitos - posFinal;
        digitosAQuitarPorDelante = posInicial - 1;

        numTemp = quitaPorDelante(numTemp, digitosAQuitarPorDelante);
        numTemp = quitaPorDetras(numTemp, digitosAQuitarPorDetras);

        return numTemp;
    }
    static int juntaNumeros(int num1, int num2) {
        num1 = num1 * (int) (Math.pow(10, (digitos(num1) - 1))) + num2;
        return num1;
    }
}