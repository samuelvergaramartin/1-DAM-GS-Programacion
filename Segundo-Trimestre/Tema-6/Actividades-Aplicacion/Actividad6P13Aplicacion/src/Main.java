import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentenciaConComentarios, sentenciaSinComentarios;

        System.out.print("Introduzca su código aquí: ");
        sentenciaConComentarios = sc.nextLine();

        sentenciaSinComentarios = eliminarComentarios(sentenciaConComentarios);

        System.out.println(sentenciaSinComentarios);
    }

    private static String eliminarComentarios(String sentencia) {
        final String copiaSentencia = sentencia;
        Scanner sc = new Scanner(copiaSentencia);
        String inicioComentario = "", cuerpoComentario = "", valor;

        while (sc.hasNext()) {
            valor = sc.next();
            if(!inicioComentario.isBlank() && !valor.equals("*/")) {
                cuerpoComentario+= valor + " ";
            }
            if(valor.equals("/*")) {
                inicioComentario = valor;
            }
            if(valor.equals("*/")) {
                sentencia = sentencia.replace(inicioComentario + " " + cuerpoComentario + "*/", "");
                inicioComentario = "";
                cuerpoComentario = "";
            }
        }

        return sentencia;
    }
}