import java.util.Scanner;

public class oddevan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the any number:");
        int num=input.nextInt();
        if (num%2==0){
            System.out.print("This number is even");
        }
        else {
            System.out.println("this number odd");
        }
    }
}
