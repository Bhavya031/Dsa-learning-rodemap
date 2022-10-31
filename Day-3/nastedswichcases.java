import java.util.Scanner;

public class nastedswichcases {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("vegetable or fruit:");
            String option = in.next();
            switch (option) {
                case "fruit" -> {
                    System.out.print("Enter any fruit name:");
                    String name = in.next();
                    switch (name) {
                        case "banana" -> System.out.println("banana is yellow.");
                        case "Oranges" -> System.out.println("Oranges are Oranges.");
                        case "Pineapple" -> System.out.println("Pineapple is yellow.");
                        case "Strawberries" -> System.out.println("Strawberries is red.");
                        default -> System.out.println("enter valid fruit name");
                    }
                }
                case "vegetable" -> {
                    System.out.print("Enter any vegetable name:");
                    String vegetable = in.next();
                    switch (vegetable) {
                        case "Potato" -> System.out.println("Potato is Yellow.");
                        case "Tomato" -> System.out.println("Tomato is red.");
                        case "Onion" -> System.out.println("Potato is white.");
                        case "Corn" -> System.out.println("Potato is yellow.");
                        default -> System.out.println("enter valid vegetable name");
                    }

                }
                default -> System.out.println("enter valid name");
            }
        }
    }
}
