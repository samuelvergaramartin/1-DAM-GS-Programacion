package personajes;

public class Mago extends Personaje {

    private int nivelMagia = 50;

    public Mago(int posTablero) {
        super("M", 10, posTablero, 5, 3, 3);
    }

    @Override
    public int atacar() {
        return fuerzaAtaque;
    }

    @Override
    public String toString() {
        String cad = super.toString().replace("Personaje", getClass().getSimpleName());

        return cad + "\r\tNivel Magia: " + nivelMagia + "\n}";
    }
}
