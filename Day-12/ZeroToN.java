public class ZeroToN {
    public static void main(String[] args) {
        PrintFromN(10000);
    }
    static void PrintFromN(int a){
        if (a==0){
            return;
        }
        System.out.println(a);
        PrintFromN(a-1);
    }
}
