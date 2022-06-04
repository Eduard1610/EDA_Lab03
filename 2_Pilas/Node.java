
public class Node<T> {
	private T data; // Contenido de cada elemento (Genérico)
	private Node<T> next; // Referencia al siguiente nodo
	
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public Node(T data) {
		// Llama al constructor
		this(data, null);
	}
	
	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public String toString() {
		return this.data.toString(); //Data como String
	}
	
}
