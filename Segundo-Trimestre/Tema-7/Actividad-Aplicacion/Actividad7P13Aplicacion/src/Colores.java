import java.util.Arrays;

public class Colores {
    private String[] paleta;

    public Colores() {
        generarColoresAleatorios();
    }

    public void agregarColor(String color) {
        if(this.toString().contains(color)) System.out.println("Error: El colo ya está en la paleta.");
        else {
            paleta = Arrays.copyOf(paleta, paleta.length + 1);
            paleta[paleta.length - 1] = color;
        }
    }

    public String[] obtenerPaleta(int numeroColores) {
        String paleta[] = new String[0];
        int random;

        if(numeroColores <= 0) System.out.println("Error: El numero de colores debe ser mayor que 0.");
        else {
            if(numeroColores > this.paleta.length) System.out.println("Error: El número de colores no puede ser mayor al de la paleta.");
            else {
                paleta = new String[numeroColores];

                for(int i = 0; i < paleta.length; i++) {
                    random = (int) ((Math.random() * this.paleta.length));

                    while (this.toString().contains(paleta[random])) {
                        random = (int) ((Math.random() * this.paleta.length));
                    }

                    paleta[i] = this.paleta[random];
                }
            }
        }

        return paleta;
    }

    private void generarColoresAleatorios() {
        int random;
        paleta = new String[4];

        for(int i = 0; i < paleta.length; i++) {
            random = (int) ((Math.random() * EjemplosColores.values().length));
            while (this.toString().contains(EjemplosColores.values()[random].toString())) {
                random = (int) ((Math.random() * EjemplosColores.values().length));
            }

            paleta[i] = EjemplosColores.values()[random].toString();
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(paleta);
    }
}
