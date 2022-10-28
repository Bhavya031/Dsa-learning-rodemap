import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your fist number:");
        int a= input.nextInt();
        System.out.print("enter your second number:");
        int b= input.nextInt();
        int sum=a+b;
        System.out.print("sum of two number is:"+sum);
    }

}
