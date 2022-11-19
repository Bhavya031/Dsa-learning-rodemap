public class Sum1 {
    public static void main(String[] args) {
        System.out.println(factorial(10));

    }
    static int factorial(int a){
        if (a<=1){
            return 1;
        }
        return a*factorial(a-1);
    }
}
