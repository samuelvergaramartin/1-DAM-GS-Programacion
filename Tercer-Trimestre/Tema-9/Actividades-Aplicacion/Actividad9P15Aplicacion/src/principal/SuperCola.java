package principal;

public class SuperCola {
    Lista cola1 = new Lista();
    Lista cola2 = new Lista();

    public void encolar1(Integer elemento) {
        cola1.encolar(elemento);
    }

    public void encolar2(Integer elemento) {
        cola2.encolar(elemento);
    }

    public Integer desencolar1() {
        Integer elemento = null;
        final boolean vacia1 = cola1.cima() == null, vacia2 = cola2.cima() == null;

        if(!vacia1) {
            elemento = cola1.desencolar();
        }
        else {
            if(!vacia2) {
                elemento = cola2.desencolar();
            }
        }

        return elemento;
    }

    public Integer desencolar2() {
        Integer elemento = null;
        final boolean vacia1 = cola1.cima() != null, vacia2 = cola2.cima() != null;

        if(!vacia2) {
            elemento = cola1.desencolar();
        }
        else {
            if(!vacia1) {
                elemento = cola2.desencolar();
            }
        }

        return elemento;
    }

    @Override
    public String toString() {
        return "Cola 1:\n" + cola1 + "\nCola 2: " + cola2;
    }
}
