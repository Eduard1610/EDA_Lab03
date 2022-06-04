
public class Test {

	public static void main(String[] args) {
		// USAMOS LA CLASE INTEGER DE JAVA PARA ESTE TEST
		// LA PILA IMPLEMENTADA PUEDE SER USADA INCLUSO CON CLASES QUE NO SEAN PREDETERMINADAS DE JAVA
		Stack<Integer> stack = new Stack<Integer>();

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
	}
}
