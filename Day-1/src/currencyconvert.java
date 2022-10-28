import java.util.Scanner;

public class currencyconvert {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter money in rupees:");
        Float rupees=input.nextFloat();
        Float dollar=rupees*0.012f;
        System.out.print("Dollar:"+dollar);
    }
}
