import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, numeros[] = new int[5], totalCeros = 0, totalPos = 0, totalNeg = 0;
        double mediaPos = 0, mediaNeg = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextInt();
        }

        for(int e : numeros) {
            if(e > 0) {
                mediaPos+= e;
                totalPos++;
            } else if (e < 0) {
                mediaNeg+= e;
                totalNeg++;
            }
            else totalCeros++;
        }

        if(totalPos > 0) mediaPos = mediaPos / totalPos;
        if(totalNeg > 0) mediaNeg = mediaNeg / totalNeg;

        System.out.println("Media positivos: " + mediaPos);
        System.out.println("Media negativos: " + mediaNeg);
        System.out.println("Total de ceros: " + totalCeros);
    }
}