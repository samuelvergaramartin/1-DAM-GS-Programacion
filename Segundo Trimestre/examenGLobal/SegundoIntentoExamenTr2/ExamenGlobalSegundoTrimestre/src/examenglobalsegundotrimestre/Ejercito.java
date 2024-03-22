package examenglobalsegundotrimestre;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercito {
    Personaje ejercito[] = new Personaje[generateRandomNumber()];
    int numeroPersonajes = 1;
    Ejercito() {
        int code;
        for(int i = 0; i < ejercito.length - 1; i++) {
            if(numeroPersonajes < 10) code = 20 + numeroPersonajes;
            else code = 200 + numeroPersonajes;
            ejercito[i] = new Guerrero(code);
            numeroPersonajes++;
        }
        if(numeroPersonajes < 10) code = 10 + numeroPersonajes;
        else code = 100 + numeroPersonajes;
        ejercito[ejercito.length - 1] = new Jefe(code);
        numeroPersonajes++;
    }
    
    private int generateRandomNumber() {
        int result = (int) (Math.random() * (7-3) + 3);
        return result;
    }
    
    private int generateRandomAttackValue() {
        int result = (int) (Math.random() * 11);
        return result;
    }
    
    private int getPositionGuerreroRandom() {
        int position = (int) (Math.random() * (ejercito.length - 1));
        return position;
    }
    
    private boolean guerreroDistintoDeJefeVivo() {
        boolean resultado = false;
        for(int i = 0; i < ejercito.length - 1; i++) {
            if(ejercito[i].getVida() > 0) resultado = true;
        }
        return resultado;
    }
    
    boolean ejercitoDerrotado() {
        boolean resultado = true;
        for(int i = 0; i < ejercito.length - 1; i++) {
            if(ejercito[i].getVida() > 0) resultado = false;
        }
        final Jefe jefeEjercito = (Jefe) (ejercito[ejercito.length -1]);
        if(jefeEjercito.getVida() > 0 || jefeEjercito.getVidaExtra() > 0) resultado = false;
        return resultado;
    }
    
    void attack() {
        final int valueAttack = generateRandomAttackValue(), personajePosition = getPositionGuerreroRandom();
        if(guerreroDistintoDeJefeVivo()) {
            int vidaActual = ejercito[personajePosition].getVida();
            if(vidaActual < valueAttack) ejercito[personajePosition].setVida(0);
            else ejercito[personajePosition].setVida(vidaActual - valueAttack);
            System.out.println(toString());
        }
        else {
            final Jefe jefeEjercito = (Jefe) (ejercito[ejercito.length - 1]);
            final int vidaActual = jefeEjercito.getVida(), vidaExtraActual = jefeEjercito.getVidaExtra();
            if(vidaActual == 0) {
                if(vidaExtraActual < valueAttack) jefeEjercito.setVidaExtra(0);
                else jefeEjercito.setVidaExtra(vidaExtraActual - valueAttack);
            }
            else {
                if(vidaActual < valueAttack) jefeEjercito.setVida(0);
                else jefeEjercito.setVida(vidaActual - valueAttack);
            }
        }
    }
    
    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < ejercito.length - 1; i++) {
            result += ejercito[i].getClass().getSimpleName() + "\n" + ejercito[i].toString() + "\n";
        }
        result+= ejercito[ejercito.length - 1].getClass().getSimpleName() + "\n" + ejercito[ejercito.length - 1].toString() + "\n";
        return result;
    }
}
