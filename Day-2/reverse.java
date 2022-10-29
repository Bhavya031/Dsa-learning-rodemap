import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        char[] num1=in.next().toCharArray();
        char[] reverse1=new char[num1.length];
        for (int num= 0;num<num1.length;num++){
            reverse1[num]=num1[num1.length-num-1];
        }
        System.out.println(reverse1);

    }
}
