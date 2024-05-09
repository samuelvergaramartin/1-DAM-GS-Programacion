import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> aux = new ArrayList<>();
        Collection<Integer> mainCollection = lista1;
        Collection<Integer> finalCollection = lista2;
        Collection<Integer> auxCollection = aux;
        Iterator<Integer> mainIt;
        Iterator<Integer> auxIt;
        int c = 0, nMain, nAux;
        boolean esta;

        do {
            mainCollection.add((int) ((Math.random() * 10) + 1));
            c++;
        }
        while(c < 20);

        System.out.println(mainCollection);

        mainIt = mainCollection.iterator();
        while(mainIt.hasNext()) {
            auxIt = auxCollection.iterator();
            nMain = mainIt.next();
            if(finalCollection.isEmpty()) {
                auxCollection.add(nMain);
                finalCollection.add(nMain);
            }
            else {
                esta = false;
                while(auxIt.hasNext() && !esta) {
                    nAux = auxIt.next();
                    if(nMain == nAux) esta = true;
                }
                if(!esta) {
                    finalCollection.add(nMain);
                }
            }

        }

        auxCollection.clear();
        mainCollection.clear();

        System.out.println(finalCollection);
    }
}