import java.util.LinkedList;
import java.util.Queue;

public class twoQueueStack<E> {
    private Queue<E> queueA = new LinkedList<>();
    private Queue<E> queueB = new LinkedList<>();

    public void push(E e) {
        if (!queueA.isEmpty()) {
            queueA.add(e);
        } else if (!queueB.isEmpty()) {
            queueB.add(e);
        } else {
            queueA.add(e);
        }
    }

    public E pop() {
        E element = null;
        if (queueA.isEmpty() && queueB.isEmpty()) {
            System.out.println("The stack is empty");
            return null;
        }
        if (!queueA.isEmpty()) {
            while (queueA.size() > 0) {
                element = queueA.poll();
                if (queueA.size() != 0) {
                    queueB.add(element);
                }
            }

        } else {
            while (queueB.size() > 0) {
                element = queueB.poll();
                if (queueB.size() != 0) {
                    queueA.add(element);
                }

            }
        }
        return element;

    }
}
