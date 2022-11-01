import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        String fullname=name();
        System.out.println(fullname);
    }
    static String name(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name1=in.next();
        System.out.print("Enter your father Name:");
        String name2=in.next();
        System.out.print("Enter your last Name:");
        String name3=in.next();
        String name=name1+' '+name2+' '+name3;
        return name;
    }
}
