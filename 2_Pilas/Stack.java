
public class Stack<T> {
	//root representa nuestro tope, el elemento de más arriba
	private Node<T> root; 
	
	public Stack() { // Stack vacia
		this.root = null;
	}

	public void push(T x) {
		// Cada vez que usemos un push colocamos al elemento en la parte de arriba
		this.root = new Node<T>(x,this.root); 
	}

	public boolean empty () { // Si no hay root la pila está vacía
		return this.root == null;
	}

	public T pop() throws EmptyStackException { 
		if (empty())
			throw new EmptyStackException("Stack is empty"); // Si la pila está vacía arroja una excepción
		T item = this.root.getData(); // Guardamos el último elemento en haber sido colocado
		this.root = this.root.getNext(); // Quitamos el último elemento
		return item;
	}

	public T peek() throws EmptyStackException { // Devuelve el root sin borrarlo
		if (empty())
			throw new EmptyStackException("Stack is empty"); // Si la pila está vacía arroja una excepción
		return this.root.getData(); // Retornamos el último elemento en haber sido colocado
	}

	public int search(T x) {
		int pos = 1; // El método search cuenta los elementos desde 1 y no desde 0
		Node<T> aux = this.root;
		while (aux != null) {
			if (aux.getData().equals(x)) //Si encuentra al elemento retorna su posición
				return pos;
			aux = aux.getNext(); // Saltamos a la siguiente posición
			pos++;
		}
		return -1;
	}

	public String toString() {
		String str = "";
		Node<T> aux = this.root;
		while (aux != null) {
			str += aux.getData() + ", ";
			aux = aux.getNext();
		}		
		return str;
	}

}
