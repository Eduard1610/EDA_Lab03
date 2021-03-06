public class Node<T>{
	private T data;
	private Node<T> nextNode;

	// Constructores
	public Node(T _data, Node<T> _nextNode){
		this.data = _data;
		this.nextNode = _nextNode;
	}
	public Node(T _data){
		this(_data, null);
	}
	public Node(){
		this(null, null);
	}

	// Metodos set & get
	public T getData(){
		return this.data;
	}
	public void setData(T _data){
		this.data = _data;
	}
	public Node<T> nextNode(){
		return this.nextNode;
	}
	public void setNextNode(Node<T> _nextNode){
		this.nextNode = _nextNode;
	}

	// Imprimir
	public String toString(){
		if(data != null)
			return data.toString();
		else
			return null;
	}
}
