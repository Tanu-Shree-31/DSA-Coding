import java.util.ArrayDeque;
import java.util.Queue;

public class LearnArrayDeque {
    public static void main(String[] args){
        ArrayDeque<Integer> ad= new ArrayDeque<>();
        ad.offer(10);
        ad.offerFirst(15);
        ad.offerLast(30);
        System.out.println(ad);

        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        System.out.println(ad.poll());
        System.out.println("poll() : "+ad);

        System.out.println(ad.pollFirst());
        System.out.println("pollFirst() : "+ad);

        System.out.println(ad.pollLast());
        System.out.println("pollLast() : "+ad);

    }
}
