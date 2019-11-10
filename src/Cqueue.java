import java.util.Stack;

public class Cqueue {
    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    public void appendTail(int a) {
        stack1.push(a);
    }

    public int deleteHead() {
        int a;
        if (!stack2.isEmpty()) {
            a = stack2.firstElement();
            stack2.pop();
            return a;
        } else {
            while (!stack1.isEmpty()) {
                a=stack1.firstElement();
                stack1.pop();
                stack2.push(a);
            }
            if (stack2.isEmpty()) {
                return 0;

            } else {
                a = stack2.firstElement();
                stack2.pop();
                return a;
            }
        }
    }
}
