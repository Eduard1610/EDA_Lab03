public class Test{
  public static void main(String [] args){
    Queue <Integer> lista = new Queue<>(5);
    //Test 1 : Añadiendo elementos a la cola
    try{
      lista.add(15);
      System.out.println(lista.getLast());//Muestra el ultimo elemento: 15
      lista.add(20);
      System.out.println(lista.getLast());//Muestra el 20
      lista.add(25);
      System.out.println(lista.getLast());//Muestra el 25
      lista.add(30);
      System.out.println(lista.getLast());//Muestra el 30
      lista.add(10);
      System.out.println(lista.getLast());//Muestra el 10
      lista.add(50);//Se lanzara la excepcion al sobrepasar la capacidad de la cola
    }catch(FullQueueException e){
      System.out.println(e.getMessage());
    }
    //Test 2 : eliminando y mostrando el elemento de cabeza actual en una cola
    try{
      lista.remove();//se va el 15
      System.out.println(lista.element());//Muestra el 20
      lista.remove();//se va el 20
      System.out.println(lista.element());//Muestra el 25
      lista.remove();//se va el 25
      System.out.println(lista.element());//Muestra el 30
      lista.remove();//se va el 30
      System.out.println(lista.element());//Muestra el 10
      lista.remove();//se va el 10
      lista.element();//Se lanzara la excepcion al no quedar elementos en la cola
    }catch(EmptyQueueException e){
      System.out.println(e.getMessage());
    }
    //Test 3 : eliminando elementos en una cola vacia
    try{
      lista.remove();
    }catch(EmptyQueueException e){
      System.out.println(e.getMessage());
    }
  }
}
