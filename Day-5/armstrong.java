import java.util.Arrays;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter digit of numbers you like:");
        int num=input.nextInt();
        print(num);
    }
    static void print(int i) {

        int j=1;
        if (i<2){
            System.out.println("Enter vaild number");
            return;
        }
        for(int m=1;m<i;m++){
            j=j*10;
        }
        int[] numbers=new int[100];
        int arr=0;
        for (int m=j;m<j*10;m++)
        {
            if(isarmstrong(i,m)==true){
                System.out.println(m);
                numbers[arr]=m;
                arr++;
            }
        }

    }
    static boolean isarmstrong(int j,int numbers){
        int f=numbers;
        int[] separated=new int[j];
        int sum1=0;
        for (int m=0;m<j;m++){
            separated[m]=numbers%10;
            int s=1;
            for (int n=0;n<j;n++){
                s=s*separated[m];
            }
            separated[m]=s;
            sum1+=separated[m];
            numbers/=10;
        }
        return sum1==f;

    }
}
