public class PassByReference {
    int data = 50;
    static void increment(PassByReference obj){
        obj.data+=100;
        System.out.println("in method: "+obj.data);
    }
    public static void main(String[] args) {
        PassByReference obj = new PassByReference();
        System.out.println("before passing the value: "+obj.data);
        increment(obj);
        System.out.println("after passing the value: "+obj.data);
    }
}
