
public class Test {

	public static void main(String[] args) {
		// USAMOS LA CLASE INTEGER DE JAVA PARA ESTE TEST
		// LA PILA IMPLEMENTADA PUEDE SER USADA INCLUSO CON CLASES QUE NO SEAN PREDETERMINADAS DE JAVA
		Stack<Integer> stack = new Stack<Integer>();

		// Empty: Devuelve un booleano si stack está vacío
		System.out.println("Usando empty: ¿La pila está vacía? : " + stack.empty() + "\n");

		// PUSH: AGREGAMOS ELEMENTOS A NUESTRA PILA
		// Los últimos elementos en agregarse serán los primeros
		stack.push(23);
		System.out.println(stack);
		stack.push(15);
		System.out.println(stack);
		stack.push(2);
		System.out.println(stack);
		stack.push(11);
		System.out.println(stack);
		stack.push(17);
		System.out.println(stack);
		stack.push(26);
		System.out.println(stack);
		stack.push(3);
		System.out.println(stack);
		stack.push(14);
		System.out.println(stack);

		// La pila ya no está vacía
		System.out.println("\nUsando empty: ¿La pila está vacía? : " + stack.empty() + "\n");

		// Usamos try-catch ya que los métodos POP y PEEK estan implementados con excepciones
		try {
			// Pop: Retorna y quita el último elemento agregado
			System.out.println("USANDO POP\n" + stack.pop());
			System.out.println(stack);
			
			// Peek: Retorna el último elemento agregado sin quitarlo
			System.out.println("\nUSANDO PEEK\n" + stack.peek());
			System.out.println(stack);
		} catch (EmptyStackException e) { // Por si la lista está vacía
			System.out.println(e.getMessage());
		}

		// Search: Nos regresa la posición de un elemento contando de 1 
		//(empezando por el último agregado) de no encontrar retorna -1
		System.out.println("\n¿Está el número 17? - Retorna posición: " + stack.search(17));
		System.out.println("\n¿Está el número 578? - Retorna posición (-1 si no encontró): " + stack.search(578));

	}
}
