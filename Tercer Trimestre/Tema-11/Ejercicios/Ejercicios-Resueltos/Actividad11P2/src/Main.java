import java.io.*;

public class Main {
    public static void main(String[] args) {
        String texto = "";
        ecrituraYLectura(texto);
    }

    private static void ecrituraYLectura(String texto) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FicherosActividad11P2/cancionPirata.dat"))){
            out.writeObject("""
                    Con diez cañones por banda,
                    viento en popa a toda vela,
                    no corta el mar, sino vuela
                    un velero bergantín
                    """);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("FicherosActividad11P2/cancionPirata.dat"))) {
            texto = (String) input.readObject();
        }
        catch (ClassNotFoundException exception) {
            System.out.println(exception);
        }
        catch (IOException exception) {
            System.out.println(exception);
        }

        System.out.println(texto);
    }
}