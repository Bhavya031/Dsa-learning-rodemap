import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your word:");
        char word[]=input.next().toCharArray();
        char reverse[] = new char[word.length];
        int num=0;

        for (num= 0;num<word.length;num++){
            reverse[num]=word[word.length-num-1];
        }
        if (reverse==word){
            System.out.print("this word is Palindrome word");
        }
        else {
            System.out.print("this word is Palindrome word");
        }
    }
}
