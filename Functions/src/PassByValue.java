public class PassByValue {
    void increment(int data){
        data+=100;
        System.out.println("in method: "+data);
    }
    public static void main(String[] args) {
        int data = 50;
        System.out.println("before passing the value: "+data);
        PassByValue obj = new PassByValue();
        obj.increment(data);
        System.out.println("after passing the value: "+data);
        
    }
}