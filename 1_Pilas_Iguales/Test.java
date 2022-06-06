public class Test{

    public static void main(String[] args){
        Stack h1 = new Stack();
        Stack h2 = new Stack();
        Stack h3 = new Stack();

        h1.push(1);
        h1.push(1);
        h1.push(1);
        h1.push(2);
        h1.push(3);

        h2.push(2);
        h2.push(3);
        h2.push(4);

        h3.push(1);
        h3.push(4);
        h3.push(1);
        h3.push(1);

        System.out.println("H1 contiene "+h1.size()+" elementos" +h1);
        System.out.println("H2 contiene "+h2.size()+" elementos" +h2);
        System.out.println("H3 contiene "+h3.size()+" elementos" +h3);
    }

 }
