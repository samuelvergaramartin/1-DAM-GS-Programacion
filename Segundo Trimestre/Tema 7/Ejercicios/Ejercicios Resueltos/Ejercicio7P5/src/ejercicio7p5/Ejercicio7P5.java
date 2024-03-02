package ejercicio7p5;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreBanco, nombreGestor;
        int telefonoGestor, importeMaximoGestor;
        final String nombreTitular = "Samuel Vergara Martín", dni = "77426564P";
        int saldo = 25;
        
        CuentaCorriente cuenta = new CuentaCorriente(dni, saldo, nombreTitular);
        cuenta.setBanco("NetCat Bank");
        
        cuenta.gestor.setName("Pedro");
        cuenta.gestor.setTelefono(123456789);
        cuenta.gestor.setImporteMaximo(100);
        
        nombreBanco = cuenta.getBanco();
        nombreGestor = cuenta.gestor.getName();
        telefonoGestor = cuenta.gestor.getTelefono();
        importeMaximoGestor = cuenta.gestor.getImporteMaximo();
       
        System.out.println("Titular: " + cuenta.titular + "\n" + "DNI: " + cuenta.dni + "\n" + "Saldo: " + cuenta.saldo + "\n" + "Banco: " + nombreBanco);
        System.out.println("Nombre del gestor: " + nombreGestor);
        System.out.println("Telefono del gestor: " + telefonoGestor);
        System.out.println("Importe maximo del gestor: " + importeMaximoGestor);
    }
    
}
