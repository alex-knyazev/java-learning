import java.util.ArrayList;
import java.util.Stack;

public class StackManage {

    public static void main(String args[]) {
        Stack<String> stack1 = new Stack<>();
        stack1.add("cat");
        stack1.add("dog");
        stack1.add("fish");


        Stack<String> stack2 = new Stack<>();
        stack2.add("petya");
        stack2.add("vasya");
        stack2.add("anton");


        System.out.println("Before mix");
        System.out.println("Stack 1");
        System.out.println(stack1);
        System.out.println("Stack 2");
        System.out.println(stack2);

        ArrayList<String> buffer = new ArrayList<>();


        for(int i =0; i<=stack1.size()+1; i++){
            buffer.add(stack1.peek());
            stack1.pop();
        }

        for(int i =0; i<=stack2.size()+1; i++){
            stack1.add(stack2.peek());
            stack2.pop();
        }

        stack2.addAll(buffer);

        System.out.println("After mix");
        System.out.println("Stack 1");
        System.out.println(stack1);
        System.out.println("Stack 2");
        System.out.println(stack2);

    }

}
