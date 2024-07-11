import java.util.Stack;

public class StackExample {


    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Kaisik");
        stack.push("Oleg");
        stack.push("Misha");
        stack.push("Katya");
        System.out.println(stack);

        System.out.println(stack.pop());


        while(!stack.isEmpty()){
            // показывает и удаляет
            System.out.println(stack.pop());
            System.out.println(stack);
        }

        // просто показывает то что добавлено в конце
        System.out.println(stack.peek());

    }

}
