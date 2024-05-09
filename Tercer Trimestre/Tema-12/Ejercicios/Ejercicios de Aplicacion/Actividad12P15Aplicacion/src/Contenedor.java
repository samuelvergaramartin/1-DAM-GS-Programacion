import java.util.*;

public class Contenedor<T extends Comparable> implements Pila<T>, Cola<T> {
    private T tabla[];

    Contenedor(T[] tabla) {
        this.tabla = tabla;
    };

    void insertarAlPrincipio(T nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla , 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarAlFinal(T nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    T extraerDelPrincipio() {
        T result = tabla[0];
        tabla[0] = null;
        System.arraycopy(tabla, 1, tabla, 0, tabla.length - 1);
        tabla = Arrays.copyOf(tabla, tabla.length - 1);

        return result;
    }

    T extraerDelFinal() {
        T result = tabla[tabla.length - 1];
        tabla[tabla.length - 1] = null;
        tabla = Arrays.copyOf(tabla, tabla.length - 1);

        return result;
    }

    void ordenar() {
        Arrays.sort(tabla);
    }

    void ordenar(Comparator<T> c) {
        Arrays.sort(tabla, c);
    }

    T get(int indice) {
        return tabla[indice];
    }

    T[] eliminarRepeticiones(T[] lista) {
        ArrayList<T> localList = new ArrayList<>();
        ArrayList<T> repeticiones = new ArrayList<>();
        Collection<T> localColeccion = localList;
        Collection<T> repeticionesColeccion = repeticiones;
        Iterator<T> itMain;
        Iterator<T> itRep;
        T objectMain, objectRep;
        int elementos = 0, i = 0;

        localColeccion.addAll(Arrays.asList(lista));
        itMain = localColeccion.iterator();
        while(itMain.hasNext()) {
            boolean found = false;
            objectMain = itMain.next();
            if(elementos == 0) {
                repeticionesColeccion.add(objectMain);
                elementos++;
            }
            else {
                itRep = repeticionesColeccion.iterator();
                while(!found && itRep.hasNext()) {
                    objectRep = itRep.next();
                    if(objectMain.equals(objectRep)) found = true;
                }
                if(!found) {
                    repeticionesColeccion.add(objectMain);
                    elementos++;
                }
            }
        }

        lista = Arrays.copyOf(lista, 0);
        lista = Arrays.copyOf(lista, elementos);
        itRep = repeticionesColeccion.iterator();
        while(itRep.hasNext()) {
            objectRep = itRep.next();
            lista[i] = objectRep;
            i++;
        }

        return lista;

    }

    @Override
    public String toString() {
        return Arrays.toString(tabla);
    }

    @Override
    public void encolar(T nuevo) {
        insertarAlFinal(nuevo);
    }

    @Override
    public T desencolar() {
        return extraerDelPrincipio();
    }

    @Override
    public void apilar(T nuevo) {
        insertarAlPrincipio(nuevo);
    }

    @Override
    public T desapilar() {
        return extraerDelPrincipio();
    }
}
