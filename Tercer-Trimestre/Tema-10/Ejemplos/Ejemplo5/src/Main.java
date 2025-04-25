import java.io.*;

public class Main {
    public static void main(String[] args) {
        //Aqui voy a probar las cosas del tema 12
        Persona p = new Persona("Samuel", "Vergara", 21);

        /*try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Ejemplo5/persona.dat"))) {
            out.writeObject(p);
            System.out.println("Se ha escrito la persona en el archivo.");
        }
        catch (IOException e) {
            System.out.println(e);
        }*/

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Ejemplo5/persona.dat"))) {
            Persona pRecogida = (Persona) in.readObject();

            System.out.println(pRecogida);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}