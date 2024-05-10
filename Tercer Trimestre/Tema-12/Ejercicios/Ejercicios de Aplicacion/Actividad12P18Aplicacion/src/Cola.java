public interface Cola<T> {
    void encolar(T nuevo);
    void encolarLista(T nuevo);
    T desencolar();
    T desencolarLista();
}
