public class clase implements interfaz{

    @Override
    public void metodo3() {
        System.out.println("Método 3");
    }

    public void ejecutar() {
        metodo1();
        metodo2();
        metodo3();
        interfaz.metodo4();
    }
}
