import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number:");
        int i =input.nextInt();
        System.out.println(isprime(i));;
    }
    static boolean isprime(int i){
        if (i <= 1) {
            return false;
        }
            int c = 2;
            while (c * c <=i) {
                if (i % c == 0) {
                    return false;
                }
                c++;
            }
    return c*c>i;
    }
}
