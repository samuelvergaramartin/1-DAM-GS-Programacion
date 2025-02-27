public class Objeto {
    public void metodo() {
        System.out.println("Hola mundo");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Se está ejecutando el método finalize del objeto!");
        super.finalize();
    }
}
