import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UnderstandingNumbersHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // pre-compute over a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int freq = 0;
            if(map.containsKey(arr[i]))
                freq = map.get(arr[i]);
            freq++;
            map.put(arr[i], freq);
        }


        // Traverse through map and print frequencies
//        for (Map.Entry<Integer,Integer> entry : map.entrySet())
//        {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        //fetching
        int num = sc.nextInt();
        while (num-- >0) {
            int i = sc.nextInt();
            // actual fetching from HashMap
            if(map.containsKey(i))
                System.out.println(map.get(i));
            else
                System.out.println(0);
        }
    }
}
