import java.util.Vector;

public class Stack<T> extends Vector<T> {

	private Node<T> root; 
	
	public Stack() {
		this.root = null;
	}

	public void push(T x) {
		this.root = new Node<T>(x,this.root); 
	}

	public boolean empty () {
		return this.root == null;
	}

	public T pop() throws EmptyStackException { 
		if (empty())
			throw new EmptyStackException("Pila esta vacia");
		T item = this.root.getData();
		this.root = this.root.getNext();
		return item;
	}

	public T peek() throws EmptyStackException {
		if (empty())
			throw new EmptyStackException("Pila esta vacia");
		return this.root.getData();
	}

	public int search(T x) {
		int pos = 1;
		Node<T> aux = this.root;
		while (aux != null) {
			if (aux.getData().equals(x))
				return pos;
			aux = aux.getNext();
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
