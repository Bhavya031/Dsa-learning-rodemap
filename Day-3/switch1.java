import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        System.out.print("Enter your name:");
        Scanner input=new Scanner(System.in);
        String name=input.next();
        switch (name) {
            case "bhavya" -> System.out.println("hii bhavya");
            case "manan" -> System.out.println("hii manan");
            case "smit" -> System.out.println("hii smit");
            case "dhruv" -> System.out.println("hii dhruv");
            case "dev" -> System.out.println("hii dev");
            default -> System.out.println("Enter vaild name");
        }
    }
}
