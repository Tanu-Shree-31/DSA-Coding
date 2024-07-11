import java.util.ArrayList;
import java.util.List;

public class NTimes {
    public static List<String> addName(int n, List<String> list1){
        if(n>=1){
            list1.add("Coding Ninjas");
            addName(n-1,list1);
        }
        return list1;

    }
    public static List<String> printNtimes(int n){
        List<String> list1 = new ArrayList();
        return addName(n, list1);
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1 = printNtimes(4);
        System.out.println(list1);
    }
}
