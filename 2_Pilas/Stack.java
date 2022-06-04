
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

}
