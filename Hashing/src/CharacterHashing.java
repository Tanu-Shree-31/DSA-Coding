import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // pre storing in hash
        // if we assume the string is only in lowercase characters -> then we will have the hash size as 26.
        // if we have to consider all characters, then hash size should be 256
        int hash[] = new int[26];

        for(int i=0; i< s.length(); i++){
            hash[s.charAt(i)-'a'] = hash[s.charAt(i)-'a'] +1;
//            hash[s.charAt(i)]=hash[s.charAt(i)]+1; //for all characters
        }

        int freq = sc.nextInt();
        while(freq-- !=0){
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch-'a']);
//            System.out.println(hash[ch]); // for all characters
        }
    }
}
