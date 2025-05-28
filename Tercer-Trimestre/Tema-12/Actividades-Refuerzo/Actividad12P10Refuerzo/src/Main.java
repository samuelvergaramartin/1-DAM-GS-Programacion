import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String palabraEs, palabraEn;

        diccionario.put("Hola", "Hello");
        diccionario.put("Adios", "Goodbye");
        diccionario.put("Hacer", "To Do");
        diccionario.put("Ser", "To Be");
        diccionario.put("Comer", "Eat");
        diccionario.put("Dormir", "Sleep");
        diccionario.put("Saltar", "To Jump");
        diccionario.put("Bailar", "To Dance");
        diccionario.put("Cama", "Bed");
        diccionario.put("Pasear", "To Walk");

        diccionario.put("Rojo", "Red");
        diccionario.put("Azul", "Blue");
        diccionario.put("Negro", "Black");
        diccionario.put("Rosa", "Pink");
        diccionario.put("Verde", "Green");
        diccionario.put("Naranja", "Orange");
        diccionario.put("Gato", "Cat");
        diccionario.put("Perro", "Dog");
        diccionario.put("Volar", "To fly");
        diccionario.put("Amar", "To love");

        System.out.print("Ingrese la palabra en Español: ");
        palabraEs = sc.nextLine();

        palabraEn = diccionario.get(palabraEs);

        if (palabraEn == null) System.out.println("La palabra introducida no existe en el diccionario.");
        else System.out.println(palabraEn);
    }
}