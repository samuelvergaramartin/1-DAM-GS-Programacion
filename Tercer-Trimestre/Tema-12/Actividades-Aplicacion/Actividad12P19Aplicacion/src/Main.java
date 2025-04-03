import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>(), repetidas = new ArrayList<>(), noRepetidas = new ArrayList<>();
        Set<String> conjuntoPalabras;
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();

        sc = new Scanner(frase);

        while (sc.hasNext()) {
            palabras.add(sc.next());
        }

        conjuntoPalabras = new LinkedHashSet<>(palabras);

        for(String e : conjuntoPalabras) {
            boolean contiene = noRepetidas.contains(e);
            if(!contiene) {
                if(!(repetidas.contains(e))) {
                    
                }
            }
        }
    }
}