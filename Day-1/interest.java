import java.util.Scanner;

public class interest{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the principal:");
        int principal= input.nextInt();
        System.out.print("enter the time:");
        int time= input.nextInt();
        System.out.print("enter the rate :");
        int rate = input.nextInt();
        int interest=(principal*time*rate/100);
        System.out.println("interest:"+interest);
    }

}
