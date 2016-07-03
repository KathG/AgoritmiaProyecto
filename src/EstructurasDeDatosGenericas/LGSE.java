package EstructurasDeDatosGenericas;

public class LGSE<E> implements LEG<E> {

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
	private NodoLista<E> ultimoNodo;

	public LGSE() {
		primerNodo = ultimoNodo = null;
	}

	public void insertFront(E elementoAInsertar) {
		if (isEmpty())
			primerNodo = ultimoNodo = new NodoLista<E>(elementoAInsertar);
		else
			primerNodo = new NodoLista<E>(elementoAInsertar, primerNodo);
	}

	public void insertBack(E elementoAInsertar) {
		if (isEmpty())
			primerNodo = ultimoNodo = new NodoLista<E>(elementoAInsertar);
		else
			ultimoNodo = ultimoNodo.proximoNodo = new NodoLista<E>(elementoAInsertar);
	}

	public E removeFront() throws Excepcion {
		E elementoARemover = null;
		
		if (isEmpty())
			throw new Excepcion("Lista Vacia");
		
		elementoARemover = primerNodo.dato;
		
		if (primerNodo == ultimoNodo)
			primerNodo = ultimoNodo = null;

		else
			primerNodo = primerNodo.proximoNodo;
		return elementoARemover;
	}

	public E removeBack() throws Excepcion{
		E elementoARemover = null;
		if (isEmpty())
			throw new Excepcion("Lista Vacia");

		elementoARemover = ultimoNodo.dato;

		if (primerNodo == ultimoNodo)
			primerNodo = ultimoNodo = null;

		else {

			NodoLista<E> actual = primerNodo;

			while (actual.proximoNodo != ultimoNodo)
				actual = actual.proximoNodo;

			ultimoNodo = actual;
			actual.proximoNodo = null;
		}
		return elementoARemover;
	}

	public boolean isEmpty() {
		return primerNodo == null;
	}

	public void imprimir() throws Excepcion {
		if (isEmpty()) {
			throw new Excepcion("VACIA");
		}

		NodoLista<E> actual = primerNodo;

		while (actual != null) {
			System.out.print(actual.dato.toString() + " ");
			actual = actual.proximoNodo;
		}

		System.out.println("\n");
	}

}
