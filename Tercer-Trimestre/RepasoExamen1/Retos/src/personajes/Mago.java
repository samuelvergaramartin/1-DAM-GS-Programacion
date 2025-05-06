package personajes;

public class Mago extends Personaje {

    private int nivelMagia = 50;

    public Mago(char letra, int vida, int posTablero, int alcanceAtaque, int fuerzaAtaque, int rangoMovimiento) {
        super('M', 10, posTablero, 5, 3, 3);
    }

    public int getNivelMagia() {
        return nivelMagia;
    }

    @Override
    public int atacar() {
        return 0;
    }

    @Override
    public String toString() {
        String cad = super.toString().replace("Personaje", getClass().getSimpleName());

        return cad + "\r\tNivel Magia: " + nivelMagia + "\n}";
    }
}
