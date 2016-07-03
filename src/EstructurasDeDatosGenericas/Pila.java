package EstructurasDeDatosGenericas;

public class Pila<E> implements Pila_In<E> {

    class NodoPila<E> {

        protected E dato;
        protected NodoPila<E> proximoNodo;
        //private E getDato;

        NodoPila(E objeto) {
            this(objeto, null);
        }

        NodoPila(E objeto, NodoPila<E> prox) {
            dato = objeto;
            proximoNodo = prox;
        }

        private NodoPila() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setDato(E dato) {
            this.dato = dato;
        }

        private E getDato() {
            return dato;
        }

        private NodoPila<E> getSiguiente() {
            return proximoNodo;
        }

        private void setSiguiente(NodoPila<E> proximoNodo) {
            this.proximoNodo = proximoNodo;
        }

    }

    private NodoPila<E> cima;
    private NodoPila<E> fin;

    public Pila() {
        cima = fin = null;
    }

    public E getDatoCima() {
        return cima.dato;
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public void apilar(E elementoAInsertar) {
        // TODO Auto-generated method stub
        if (isEmpty()) {
            cima = fin = new NodoPila<E>(elementoAInsertar);
        } else {
            cima = new NodoPila<E>(elementoAInsertar, cima);
        }
    }

    public E desapilar() throws Excepcion {
        E elementoARemover = null;
        NodoPila<E> nodoARemover = cima;

        if (isEmpty()) {
            throw new Excepcion("Lista vacia");
        }

        elementoARemover = cima.dato;

        if (cima == fin) {
            cima = fin = null;
        } else {
            cima = cima.proximoNodo;
            nodoARemover.proximoNodo = null;
        }

        return elementoARemover;
    }

    public void anular() {
        cima = fin = null;
    }

    public void imprimir() throws Excepcion {
        if (isEmpty()) {
            throw new Excepcion("Lista vacia");
        }
        NodoPila<E> actual = cima;

        while (actual != null) {
            System.out.println(actual.dato.toString() + " ");
            actual = actual.proximoNodo;
        }
        System.out.println("\n");
    }

    @Override
    public E tope() throws Excepcion {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void retirar() {
        if (!isEmpty()) {
            // Asigna como primer nodo al siguiente de la pila.
            cima = cima.getSiguiente();
            //tamanio--;
        }
    }

    public boolean buscar(E referencia) {
        NodoPila<E> aux = cima;
        boolean existe = false;
        while (existe != true && aux != null) {
            if (referencia == aux.getDato()) {
                existe = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return existe;
    }

    public void editar(E referencia, E valor) {
        if (buscar(referencia)) {
            NodoPila<E> pilaAux = null;
            while (referencia != cima.getDato()) {
                NodoPila<E> temp = new NodoPila<E>();
                temp.setDato(cima.getDato());
                if (pilaAux == null) {
                    pilaAux = temp;
                } else {
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                retirar();
            }
            cima.setDato(valor);
            while (pilaAux != null) {
                apilar(pilaAux.getDato());
                pilaAux = pilaAux.getSiguiente();
            }
            pilaAux = null;
        }
    }

}
