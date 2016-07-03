package EstructurasDeDatosGenericas;

public class LGCE<E> implements LEG<E> {

	class NodoLista<E> {
		E dato;
		NodoLista<E> proximoNodo;

		public NodoLista(E objeto) {
			this(objeto, null);
		}

		public NodoLista(E objeto, NodoLista<E> nodo) {
			dato = objeto;
			proximoNodo = nodo;
		}

		public E obtenerObjeto() {
			return dato;
		}

		public NodoLista<E> obtenerProximo() {
			return proximoNodo;
		}
	}

	private NodoLista<E> primerNodo;

	public LGCE() {
		primerNodo = null;
	}

	public void insertFront(E elementoAInsertar) {
		
		if (isEmpty()) {
			primerNodo = new NodoLista<E>(elementoAInsertar);
			primerNodo.proximoNodo = primerNodo;
		} else {
			NodoLista<E> ultimoNodo;
			NodoLista<E> actual = primerNodo;
			
			while (actual.proximoNodo != primerNodo) {
				actual = actual.proximoNodo;
			}
			ultimoNodo = actual;

			NodoLista<E> desplazado = primerNodo;
			primerNodo = new NodoLista<E>(elementoAInsertar, desplazado);
			ultimoNodo.proximoNodo = primerNodo;
		}
	}

	public E remover() throws Excepcion {
		E elementoARemover = null;

		if (isEmpty())
			throw new Excepcion("Lista Vacia");
		elementoARemover = primerNodo.dato;

		if (primerNodo == primerNodo.proximoNodo)
			primerNodo = null;

		else {

			NodoLista<E> ultimoNodo;
			NodoLista<E> actual = primerNodo;
			
			while (actual.proximoNodo != primerNodo) {
				actual = actual.proximoNodo;
			}
			ultimoNodo = actual;

			primerNodo = primerNodo.proximoNodo;
			ultimoNodo.proximoNodo = primerNodo;
		}
		return elementoARemover;
	}

	public boolean isEmpty() {
		return primerNodo == null;
	}

	public void imprimir() throws Excepcion {
		if (isEmpty()) {
			throw new Excepcion("Lista Vacia");
		}

		NodoLista<E> actual = primerNodo;

		do {
			System.out.print(actual.dato.toString() + " ");
			actual = actual.proximoNodo;
		} while (actual != primerNodo);

		System.out.println("\n");
	}

	@Override
	public void insertBack(E x) {
		// TODO Auto-generated method stub
	}

	@Override
	public E removeFront() throws Excepcion {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeBack() throws Excepcion {
		// TODO Auto-generated method stub
		return null;
	}

}
