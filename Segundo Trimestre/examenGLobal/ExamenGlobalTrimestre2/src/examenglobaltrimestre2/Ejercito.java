package examenglobaltrimestre2;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercito {
    final int nRandomTropasEjercito1 = generateTropas();
    final int nRandomTropasEjercito2 = generateTropas();
    int tropasGeneradas = 1;
    int code;
    Object ejercito1[] = new Object[nRandomTropasEjercito1];
        Object ejercito2[] = new Object[nRandomTropasEjercito2];
    
    Ejercito() {
        for(int i = 0; i < ejercito1.length; i++) {
            if(i == ejercito1.length - 1) {
                if(tropasGeneradas < 10) {
                    code = tropasGeneradas + 10;
                    tropasGeneradas++;
                }
                else {
                    if(tropasGeneradas >= 10) {
                        code = tropasGeneradas + 100;
                        tropasGeneradas++;
                    }
                }
                Jefe jefe1 = new Jefe(code);
                jefe1.setVidaExtra();
                ejercito1[i] = jefe1;
            }
            else {
                if(tropasGeneradas < 10) {
                    code = tropasGeneradas + 20;
                    tropasGeneradas++;
                }
                else {
                    if(tropasGeneradas >= 10) {
                        code = tropasGeneradas + 200;
                        tropasGeneradas++;
                    }
                }
                Guerrero guerrero = new Guerrero(code);
                ejercito1[i] = guerrero;
            }
        }
        for(int i = 0; i < ejercito2.length; i++) {
            if(i == ejercito2.length - 1) {
                if(tropasGeneradas < 10) {
                    code = tropasGeneradas + 10;
                }
                else {
                    if(tropasGeneradas >= 10) {
                        code = tropasGeneradas + 100;
                    }
                }
                Jefe jefe2 = new Jefe(code);
                jefe2.setVidaExtra();
                ejercito2[i] = jefe2;
            }
            else {
                if(tropasGeneradas < 10) {
                    code = tropasGeneradas + 20;
                }
                else {
                    if(tropasGeneradas >= 10) {
                        code = tropasGeneradas + 200;
                    }
                }
                Guerrero guerrero = new Guerrero(code);
                ejercito2[i] = guerrero;
            }
        }
    }
    
    private int generateTropas() {
        return (int) (Math.random() * (7-3)) + 3;
    }
    
    @Override 
    public String toString() {
        String result = "";
        for(int i = 0; i < ejercito1.length; i++) {
            if(i == ejercito1.length -1 ) result += "Guerrero\n" + ejercito1[i].toString() + "\n";
            else result += "Jefe\n" + ejercito1[i].toString() + "\n";
            
        }
        for(int i = 0; i < ejercito2.length; i++) {
            if(i == ejercito2.length -1 ) result += "Guerrero\n" + ejercito2[i].toString() + "\n";
            else result += "Jefe\n" + ejercito2[i].toString() + "\n";
        }
        return result;
    }
}
