public class ReverseInt {
    static int sum=0;
    static void rev(int a){
        if (a==0){
            return;
        }
        int rem=a%10;
        sum=rem+sum*10;
        rev(a/10);

    }

    public static void main(String[] args) {

        System.out.println(sum);
    }


}
