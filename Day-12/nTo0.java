public class nTo0 {
    public static void main(String[] args) {
        print(100);
    }
    static void print(int a){
        if (a==0){
            return;
        }
        print(a-1);
        System.out.println(a);
    }
}
