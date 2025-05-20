package personajes;

public class Guerrero extends Personaje{
    @Deprecated
    public Guerrero(int posTablero){
        super("G", 20, posTablero,1, 5, 5);
    }

    public Guerrero(int posTableroX, int posTableroY){
        super("G", 20, posTableroX, posTableroY,1, 5, 5);
    }

    @Override
    public int atacar() {
        return fuerzaAtaque;
    }
}
