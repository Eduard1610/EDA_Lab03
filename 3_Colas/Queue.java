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
  public boolean offer(E e){//Añade un elemento a Queue sin sobrepasar la capacidad de la cola. Retorna true en caso de añadir el elemento exitosamente a Queue
    if(numElementos == size - 1)//Evalua la capacidad de Queue
      return false;
    Node <E> aux = new Node <E> (e, null);//se crea el nodo que almacenara del elemento
    if(isEmpty())//Caso: Queue esta vacio
      this.root = aux;
    else//Caso: Existe al menos un elementos en Queue
      this.last.setNextNode(aux);
    this.last = aux;
    numElementos++;//incrementa el contador de elementos en Queue
    return true;
  }

  public boolean add(E e) throws FullQueueException{//Funciona igual que offer() con la diferencia que muestra una excepcion de limite maximo alcanzado
    if(offer(e))
      return true;
    else//Caso Queue esta llena: asi que mostrara el mensaje de la excepcion
      throw new FullQueueException("Actualmente no hay espacio disponible");
  }

  public E peek(){//Recupera, pero no elimina, la cabeza de esta cola, o devuelve null si esta cola está vacía.
    if(isEmpty())//Retorna null si Queue esta vacio
      return null;
    return this.root.getData();//Retorna la informacion del nodo cabeza de Queue
  }

  public E element() throws EmptyQueueException{//Este método difiere de peek() sólo en que lanza una excepcion si la cola está vacía.
    if(this.peek() != null)
      return this.root.getData();
    else//Caso Queue esta vacia: asi que mostrara el mensaje de la excepcion
      throw new EmptyQueueException("La cola esta vacia");
  }

  public E poll(){ //Devuelve y elimina la cabeza de esta cola, o devuelve null si la cola está vacía.
    if(this.isEmpty())//Evalua que Queue no este vacio
      return null;
    Node <E> cabeza = this.root;//almacena la cabeza de Queue en la variable cabeza
    numElementos--;//Disminuye el contador de elementos
    if(this.root.nextNode() == null){//Caso: Un solo elemento en Queue
      this.root = null;
      this.last = null;
    }
    else//Caso: Mas de un elemento en Queue
      this.root = this.root.nextNode();//El siguiente nodo de cabeza sera la nueva cabeza de Queue
    return cabeza.getData();//retorna la informacion del nodo cabeza eliminado
  }

  public E remove() throws EmptyQueueException{//Este método difiere del poll() sólo en que lanza una mensaje si esta cola está vacía.
    if(this.isEmpty())//Caso Queue esta vacia: asi que mostrara el mensaje de la excepcion
      throw new EmptyQueueException("La cola esta vacia");
    return this.poll();
  }
  //Metodos auxiliares
  public boolean isEmpty(){//Evalua si Queue esta vacio
    return this.root == null;
  }
  public E getLast(){//Retorna el ultimo nodo de Queue
    if(this.last == null)
      return null;
    return this.last.getData();
  }
}
