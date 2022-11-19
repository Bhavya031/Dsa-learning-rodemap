public class OddEven {
    public static void main(String[] args) {
        int a=4;
        System.out.println(check(a));
    }
    static boolean check(int a){
        return (a&1)==1;
    }
}
