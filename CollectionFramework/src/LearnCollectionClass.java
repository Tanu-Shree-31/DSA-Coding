import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args) {
//        List<Integer> list = new LinkedList<>();
//        list.add(12);
//        list.add(23);
//        list.add(56);
//        list.add(89);
//        list.add(32);
//        list.add(56);
//
//        System.out.println("Min element: "+ Collections.min(list));
//        System.out.println("Max element: "+ Collections.max(list));
//        System.out.println(Collections.frequency(list, 56));
//
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);

        List<Student> list = new ArrayList<>();
        list.add(new Student("tanu",2));
        list.add(new Student("shilpa", 4));
        list.add(new Student("neha",3));

        Student s1 = new Student("tanu",2);
        Student s2 = new Student("neha",3);
//        System.out.println(s1.compareTo(s2));

        // dynamic sorting method using Collections Class
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });

        //another method of above implementation using lambda
        Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));

        System.out.println(list);
    }
}
