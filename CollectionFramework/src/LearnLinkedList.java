import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedList {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(2);
        queue.offer(4);
        queue.offer(6);
        queue.add(8);
        System.out.println("Linked list: "+queue);

        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println("Linked list: "+queue);

        queue.clear();

        // throws exceptions
        System.out.println(queue.element());
        System.out.println(queue.remove());
    }
}
