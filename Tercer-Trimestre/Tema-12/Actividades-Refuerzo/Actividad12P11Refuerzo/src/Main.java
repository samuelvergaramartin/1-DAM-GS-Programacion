import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String palabraIntroducida, palabraEn;
        int numAciertos = 0, numErrores = 0;
        ArrayList<String> palabras = new ArrayList<>(), temp;

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

        temp = new ArrayList<>(diccionario.keySet());

        for (int i = 0; i < 5; i++) {
            palabras.add(temp.get(i));
        }

        for(String palabra : palabras) {
            System.out.print(palabra + ": ");
            palabraEn = diccionario.get(palabra);
            palabraIntroducida = sc.nextLine();

            if(palabraEn.equals(palabraIntroducida)) numAciertos++;
            else numErrores++;
        }

        System.out.println("El numero de aciertos es: " + numAciertos);
        System.out.println("El numero de errores es: " + numErrores);
    }
}