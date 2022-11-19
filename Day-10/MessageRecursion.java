public class MessageRecursion {
    public static void main(String[] args) {
        Message(2 );
    }
    static void Message(int i){

        System.out.println("Hello World!");
        Message(i+1);
    }
}
