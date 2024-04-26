import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(12);
        pq.offer(15);
        pq.offer(30);
        
        System.out.println(pq.peek());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);


    }
}
