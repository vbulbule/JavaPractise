package stackexercises;

import java.util.Stack;

public class ReverseStack {

    private static void insertBottom(Stack<Integer> stack, int data){

        if(stack.isEmpty())
        {
            stack.push(data);
            return;
        }

        int d = stack.pop();
        insertBottom(stack,data);
        stack.push(d);

    }

    private static void reverseStack(Stack<Integer> stack){

        if(stack.isEmpty()){
            return;
        }
        int d = stack.pop();
        reverseStack(stack);
        insertBottom(stack,d);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //insertBottom(stack, 4);
        System.out.println(stack);
        reverseStack(stack);

        System.out.println(stack);
    }
}
