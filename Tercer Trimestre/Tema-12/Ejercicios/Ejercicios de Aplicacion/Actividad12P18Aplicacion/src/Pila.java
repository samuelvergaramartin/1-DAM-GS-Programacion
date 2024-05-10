public interface Pila<T> {
    void apilar(T nuevo);
    void apilarLista(T nuevo);
    T desapilar();
    T desapilarLista();
}
