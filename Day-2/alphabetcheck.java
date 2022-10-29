import java.util.Scanner;

public class alphabetcheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your alphabet:");
        char alphabet=input.next().trim().charAt(0);
        if (alphabet>='a' && alphabet<='z'){
            System.out.println("This alphabet is small letter.");
        }
        else {
            System.out.println("This alphabet is capital letter.");
        }
    }
}
