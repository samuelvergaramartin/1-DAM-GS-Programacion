import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, bufferPos1, bufferPos2, bufferPos3, bufferPos4;
        boolean isCapicua = false;
        String result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        if(num >= 0 && num <= 9999) {
            //Jugamos con los 10, 100, y 1000 para ver el numero de cifras que tiene el numero
            if(num > 10) {
                if(num < 100) {
                    //Si el primer digito y el segundo (que es el ultimo) son iguales, isCapicua valdrá true
                    bufferPos1 = num % 10;
                    bufferPos2 = num / 10;
                    if(bufferPos1 == bufferPos2) isCapicua = true;
                }
                else {
                    if(num < 1000) {
                        //Si el primer digito y el tercero (que es el ultimo) son iguales, isCapicua valdrá true
                        bufferPos1 = num % 10;
                        bufferPos3 = num / 100;
                        if(bufferPos1 == bufferPos3) isCapicua = true;
                    }
                    else {
                        //Si el primer y ultimo digito son iguales y aparte el segundo y tercero son iguales, será capicua
                        bufferPos1 = (num / 1000);
                        bufferPos2 = (num / 100) - ((num / 1000) * 10);
                        bufferPos3 = (num % 100) / 10;
                        bufferPos4 = (num % 10);

                        if((bufferPos1 == bufferPos4) && (bufferPos2 == bufferPos3)) isCapicua = true;
                    }
                }
            }

            result = isCapicua ? "Es Capicua" : "No es Capicua";
            System.out.println(result);
        }
        else System.out.println("Error: El numero introducido no está entre 0 y 9999");
    }
}