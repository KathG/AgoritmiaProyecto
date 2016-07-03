package EstructurasDeDatosGenericas;

public interface LEG<E> {
    void insertFront(E x);
    void insertBack(E x);
    E removeFront() throws Excepcion;
    E removeBack() throws Excepcion;
    boolean isEmpty();
}

//int search(E x);
//void removeFront();
//E delete() throws Excepcion;
//E deleteElem(E x) throws Excepcion;
