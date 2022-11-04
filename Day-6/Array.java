import java.util.Arrays;
import java.util.Scanner;

public class Array {
    Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        strarr();
        intarr();
    }
    static void strarr(){
        System.out.println("Enter any Five string");
        String[] a =new String[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i< a.length;i++) {
            a[i] = input.nextLine();
            System.out.println(Arrays.toString(a));
        }

    }
    static void intarr(){
        System.out.print("Enter any five number:");
        Scanner input=new Scanner(System.in);
        int[] a =new int[5];
        for(int i=0;i< a.length;i++){
            a[i]=input.nextInt();
            System.out.println(Arrays.toString(a));
        }
    }
}
