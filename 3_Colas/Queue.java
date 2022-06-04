public class Queue<E> {
  private Node <E> root;
  private Node <E> last;
  private final int size;
  private int numElementos = -1;//cuenta el numero de elementos actuales

  public Queue(int n){
    this.root = null;
    this.last = null;
    this.size = n;
  }
  public boolean offer(E e){
    if(numElementos == size - 1)
      return false;
    Node <E> aux = new Node <E> (e, null);
    if(isEmpty())
      this.root = aux;
    else
      this.last.setNextNode(aux);
    this.last = aux;
    numElementos++;
    return true;
  }
  public boolean add(E e) throws FullQueueException{
    if(offer(e))
      return true;
    else
      throw new FullQueueException("Actualmente no hay espacio disponible");
  }
  public E peek(){
    if(isEmpty())
      return null;
    return this.root.getData();
  }
  public E element() throws EmptyQueueException{
    if(this.peek() != null)
      return this.root.getData();
    else
      throw new EmptyQueueException("La cola esta vacia");
  }
  public E poll(){
  }
  public E remove(){
  }
  //Metodos auxiliares
  public boolean isEmpty(){
    return this.root == null;
  }
}
