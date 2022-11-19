public class CountZero {
    static int zero=0;
    static int count(int a,int c){
        if (a==0){
            return 0;
        } else if (a%10==c) {
            ++zero;
        }
        count(a/10,c);
        return zero;
    }
    public static void main(String[] args) {
        System.out.println(count(11110230,1));
    }

}
