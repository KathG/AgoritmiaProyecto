package EstructurasDeDatosGenericas;

public interface Pila_In<E> {
    void apilar(E x);
    E desapilar() throws Excepcion;
    E tope() throws Excepcion;
    
    
    boolean isEmpty();
    
}
