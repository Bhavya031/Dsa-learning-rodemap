import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = input.nextInt();
        System.out.println("Enter your second number:");
        int num2 = input.nextInt();
        System.out.println("Enter your operator :");
        var operator = input.next();
        int calculate=0;
        if (operator.equals("+")) {
            calculate = num1 + num2;
        }
        else if (operator.equals("-")) {
            calculate = num1 - num2;
        }
        else if (operator.equals("*")) {
            calculate = num1 * num2;
        }
        else if (operator.equals("/")) {
            calculate = num1 / num2;
        }
        else
        {
            System.out.println("Error");
        }
        System.out.println(calculate);
    }
}