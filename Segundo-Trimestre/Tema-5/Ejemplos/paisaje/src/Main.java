import static java.util.Arrays.fill;
public class Main {
    public static void main(String[] args) {
        char paisaje[][] = new char[6][5];
        final char SOL = 'O', NUBE = 'm', PAJARO = 'v', MAR = '~', CORALES = 'x';
        int alea;

        paisaje[0][(int) ((Math.random() * paisaje[0].length))] = SOL;

        for(int i = 0; i < paisaje[1].length; i++) {
            alea = (int) ((Math.random() * 2));
            if(alea == 1) paisaje[1][i] = NUBE;
        }

        for(int i = 0; i < paisaje[2].length; i++) {
            alea = (int) ((Math.random() * 2));
            if(alea == 1) paisaje[2][i] = PAJARO;
        }

        fill(paisaje[paisaje.length - 2], MAR);

        for(int i = 0; i < paisaje[paisaje.length - 1].length; i++) {
            alea = (int) ((Math.random() * 2));
            if(alea == 1) paisaje[paisaje.length - 1][i] = CORALES;
        }

        for(int i = 0; i < paisaje.length; i++) {
            for(int x = 0; x < paisaje[i].length; x++) {
                System.out.print(paisaje[i][x] + "\t");
            }
            System.out.println();
        }
    }
}