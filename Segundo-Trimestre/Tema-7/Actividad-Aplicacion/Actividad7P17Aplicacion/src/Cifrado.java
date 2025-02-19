public class Cifrado {
    public static String cifrar(String texto, int n) {
        final int POS_A = ((Character) 'a').hashCode(), POS_Z = ((Character) 'z').hashCode();
        int pos, aux;
        char cadena[] = texto.toCharArray();
        String resultado = "";

        for(Character c: cadena) {
            if(Character.isLetter(c)) {
                if(c.hashCode() - n < POS_A) {
                    aux = POS_A - (c.hashCode() - n);
                    pos = POS_Z - aux;
                }
                else pos = c.hashCode() - n;

                resultado+= (char) pos;
            }
            else resultado+= c;
        }

        return resultado;
    }
}
