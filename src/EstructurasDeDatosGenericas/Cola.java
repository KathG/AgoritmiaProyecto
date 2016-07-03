package EstructurasDeDatosGenericas;

public class Cola<E>{

	class NodoCola<E> {
		E dato;
		NodoCola<E> proximoNodo;

		public NodoCola(E objeto) {
			this(objeto, null);
		}

		public NodoCola(E objeto, NodoCola<E> prox) {
			dato = objeto;
			proximoNodo = prox;
		}
	}

	private NodoCola<E> frente;
	private NodoCola<E> fin;

	public Cola() {
		frente = fin = null;
	}

	public boolean isEmpty() {
		return frente == null;
	}

	public void insertar(E elementoAInsertar){
		if (isEmpty())
			frente=fin=new NodoCola<E>(elementoAInsertar);
		else
			fin=fin.proximoNodo=new NodoCola<E>(elementoAInsertar);
			
	}
	
	public  E suprimir()
	throws Excepcion
	{
		E elementoARemover=null;
		NodoCola<E> nodoARemover=frente;
		
		if(isEmpty())
		{
			throw new Excepcion("Está Vacio, no se puede suprimir nada");
		}
		
		elementoARemover=frente.dato;
		
		 if (frente==fin)
		 	frente=fin=null;
		 else
		 {
		  	frente=frente.proximoNodo;
		 	nodoARemover.proximoNodo=null;	
		}
		return elementoARemover;
		
	}
	
	public E getDatoFrente() 
    throws Excepcion
	{
		if(isEmpty())
		{
			throw new Excepcion("Está Vacio, no se puede suprimir nada");
		}
		else return frente.dato;	
	}
	
	public E getDatoFin() 
	throws Excepcion
	{
		if(isEmpty())
		{
			throw new Excepcion("Está Vacio, no se puede suprimir nada");
		}
		else return fin.dato;	
	}
	
	public void anular() 
	throws Excepcion
	{
		if(isEmpty())
		{
			throw new Excepcion("Está Vacio, no se puede suprimir nada");
		}
		
		frente=fin=null;
		
	}

	public void imprimir() {
		if (isEmpty()) {
			System.out.println(" vacia");
			return;
		}
		NodoCola<E> actual = frente;

		while (actual != null) {
			System.out.print(actual.dato.toString() + " ");
			actual = actual.proximoNodo;

		}
		System.out.println("\n");
	}

}
