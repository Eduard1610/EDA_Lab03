
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
