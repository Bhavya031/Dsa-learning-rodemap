import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=input.nextInt();
        System.out.println("enter the second number:");
        int num2=input.nextInt();
        if (num2>num1){
            System.out.println("second number is the largest");
        }
        else {
            System.out.println("first number is the largest ");
        }
    }
}
