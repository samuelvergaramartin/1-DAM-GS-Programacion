package personajes;

public class Guerrero extends Personaje{
    public Guerrero(int posTablero){
        super("G", 20, posTablero,1, 5, 5);
    }

    @Override
    public int atacar() {
        return fuerzaAtaque;
    }

    @Override
    public String toString() {
        return super.toString().replace("Personaje", getClass().getSimpleName());
    }
}
