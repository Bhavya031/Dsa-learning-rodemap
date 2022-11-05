import java.util.Arrays;

public class reversearr {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] rev){
        for (int i = 0; i < rev.length/2; i++) {
            int temp=rev[i];
            rev[i]=rev[rev.length-i-1];
            rev[rev.length-i-1]=temp;
        }
    }
}
