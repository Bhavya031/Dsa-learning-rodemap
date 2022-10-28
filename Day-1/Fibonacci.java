import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your number:");
        int num1=input.nextInt();
        int num3=num1;
        int num2;
        for (num2=1;num2<num3;num2++){
            num1=num1+num2;
        }
        System.out.println("Fibonacci Series:"+num1);
    }
}
