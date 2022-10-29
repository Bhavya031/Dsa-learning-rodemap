import java.util.Scanner;

public class Countingoccurrences {
    public static void main(String[] args) {
        int n = 168499949;
        int count = 0;
        while (n >0) {
        int rem = n % 10;
        if (rem == 9) {
            count++;
            }
        n=n/10;
        }
        System.out.println(count);
    }
}
