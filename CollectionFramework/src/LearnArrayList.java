import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        // define array list
        //ArrayList<Integer> studentList = new ArrayList<>();
        List<Integer> studentList = new ArrayList<>();
        studentList.add(1);
        studentList.add(2);
        studentList.add(3);
        System.out.println(studentList);

        studentList.add(2,50);
        System.out.println(studentList);

        List<Integer> newStudentList = new ArrayList<Integer>(); //creating a list

        newStudentList.add(100);

        studentList.addAll(newStudentList);
        System.out.println(studentList);

        System.out.println(studentList.get(1));

        studentList.remove(2);
        System.out.println(studentList);

        studentList.remove(Integer.valueOf(100));
        System.out.println(studentList);

        studentList.set(1,200);
        System.out.println(studentList);

        System.out.println(studentList.contains(3));

        // normal for loop to print all the elements
        for(int i=0; i<studentList.size(); i++){
            System.out.println("the element is: "+studentList.get(i));
        }
        System.out.println();

        // iterator using Datatype
        for (Integer element: studentList) {
            System.out.println("for each element: "+element);
        }
        System.out.println();

        //iterator
        Iterator<Integer> it = studentList.iterator();
        while(it.hasNext()) {
            System.out.println("iterator: "+it.next());
        }

        studentList.clear();
        System.out.println(studentList);



    }
}