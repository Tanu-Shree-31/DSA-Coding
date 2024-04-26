import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(23);
        list.add(56);
        list.add(89);
        list.add(32);
        list.add(56);

        System.out.println("Min element: "+ Collections.min(list));
        System.out.println("Max element: "+ Collections.max(list));
        System.out.println(Collections.frequency(list, 56));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
