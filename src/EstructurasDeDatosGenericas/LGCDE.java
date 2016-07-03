package EstructurasDeDatosGenericas;

public class LGCDE<E>{
	
	class NodoLista<E> {
		
		E dato;
		NodoLista<E> nodoProximo;
		NodoLista<E> nodoAnterior;

		public NodoLista(E objeto) {
			this(objeto, null, null);
		}

		public NodoLista(E objeto, NodoLista<E> prox, NodoLista<E> ant) {
			dato = objeto;
			nodoProximo = prox;
			nodoAnterior = ant;
		}

		public E obtenerObjeto() {
			return dato;
		}

		public NodoLista<E> obtenerProximo() {
			return nodoProximo;
		}

		public NodoLista<E> obtenerAnterior() {
			return nodoAnterior;
		}

	}

	private NodoLista<E> primerNodo;

	public LGCDE() {
	      primerNodo = null;
	    }

	public void insertFront(E elementoAInsertar) {
		if (isEmpty()) {
			primerNodo = new NodoLista<E>(elementoAInsertar);
			primerNodo.nodoProximo = primerNodo;
			primerNodo.nodoAnterior = primerNodo;

		} else {
			NodoLista<E> actual = primerNodo;
			while (actual.nodoProximo != primerNodo) {
				actual = actual.nodoProximo;
			}
			NodoLista<E> ultimoNodo = actual;

			NodoLista<E> desplazado = primerNodo;
			primerNodo = new NodoLista<E>(elementoAInsertar, desplazado, ultimoNodo);
			ultimoNodo.nodoProximo = primerNodo;

			desplazado.nodoAnterior = primerNodo;
		}
	}

	public E delete() throws Excepcion {
		NodoLista<E> NodoARemover = primerNodo;
		E elementoARemover = null;

		if (isEmpty())
			throw new Excepcion("VACIA");

		elementoARemover = primerNodo.dato;

		if (primerNodo == primerNodo.nodoProximo)
			primerNodo = null;
		else {
			NodoLista<E> actual = primerNodo;
			while (actual.nodoProximo != primerNodo) {
				actual = actual.nodoProximo;
			}
			NodoLista<E> ultimoNodo = actual;

			primerNodo = primerNodo.nodoProximo;
			ultimoNodo.nodoProximo = primerNodo;
			primerNodo.nodoAnterior = ultimoNodo;
		}

		NodoARemover.nodoProximo = null;
		NodoARemover.nodoAnterior = null;

		return elementoARemover;
	}

	public boolean isEmpty() {
		return primerNodo == null;
	}

	public void imprimir() {
		if (isEmpty()) {
			System.out.println("Lista Vacía");
			return;
		}

		NodoLista<E> actual = primerNodo;

		do {
			actual = actual.nodoProximo;
			System.out.println(actual.dato.toString() + " ");
		} while (actual != primerNodo);
	}	
}

