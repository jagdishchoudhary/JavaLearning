package List;
import java.util.Stack;

public class stackProgram {
    public static void main(String[] args) {
        //Declaring a Integer stack
        Stack<Integer> intStack = new Stack<Integer>();
        //Adding elements in stack
        intStack.push(12);
        intStack.push(13);
        intStack.push(7);

        //Size of stack
        System.out.println(intStack.size());

        //Content of Stack
        System.out.println(intStack);

        intStack.pop();
        System.out.println(intStack);



    }
}
