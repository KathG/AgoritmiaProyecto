package EstructurasDeDatosGenericas;

public class LGDE<E> implements LEG<E>{
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
	private NodoLista<E> ultimoNodo;
	private String nombre;

	public LGDE() {
		primerNodo = ultimoNodo = null;
	}

	public void insertFront(E elementoAInsertar) {
		if (isEmpty())
			primerNodo = ultimoNodo = new NodoLista<E>(elementoAInsertar);

		else {
			NodoLista<E> desplazado = primerNodo;
			primerNodo = new NodoLista<E>(elementoAInsertar, desplazado, null);
			desplazado.nodoAnterior = primerNodo;
		}
	}

	public void insertBack(E elementoAInsertar) {
		if (isEmpty())
			primerNodo = ultimoNodo = new NodoLista<E>(elementoAInsertar);

		else {
			NodoLista<E> desplazado = ultimoNodo;
			ultimoNodo = new NodoLista<E>(elementoAInsertar, null, desplazado);
			desplazado.nodoProximo = ultimoNodo;
		}
	}

	public E removeFront() throws Excepcion{
		E elementoARemover = null;

		if (isEmpty())
			throw new Excepcion("Lista Vacia");
		elementoARemover = primerNodo.dato;

		if (primerNodo == ultimoNodo)
			primerNodo = ultimoNodo = null;

		else {
			primerNodo = primerNodo.nodoProximo;
			primerNodo.nodoAnterior = null;
		}

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
			ultimoNodo = ultimoNodo.nodoAnterior;
			ultimoNodo.nodoProximo = null;
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

		while (actual != null) {
			System.out.print(actual.dato.toString() + " ");
			actual = actual.nodoProximo;
		}

		System.out.println("\n");
	}

	public void imprimirDesdeUltimo() throws Excepcion {
		if (isEmpty()) {
			throw new Excepcion("Lista Vacia");
		}

		NodoLista<E> actual = ultimoNodo;

		while (actual != null) {
			System.out.print(actual.dato.toString() + " ");
			actual = actual.nodoAnterior;
		}

		System.out.println("\n");
	}
}
