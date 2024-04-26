import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args){
//        Set<Integer> set = new HashSet<>();
        //Set<Integer> linset = new LinkedHashSet<>();
        //Set<Integer> treeset = new TreeSet<>();

//        set.add(14);
//        set.add(54);
//        set.add(6);
//        set.add(85);
//        set.add(36);
//
//        System.out.println(set);
//
//        set.remove(6);
//        System.out.println(set);
//
//        System.out.println(set.contains(85));
//
//        System.out.println(set.isEmpty());
//
//        System.out.println(set.size());
//
//        set.clear();

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("tanu",2));
        studentSet.add(new Student("shilpa", 4));
        studentSet.add(new Student("tanu",2));

        System.out.println(studentSet );

    }
}
