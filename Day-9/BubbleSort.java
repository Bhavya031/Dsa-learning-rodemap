import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr={23,11,45,67,89,12,34,56,78,90,21,43,65,87,98,10,32,54,76,98,1,3,5,7,9,2,4,6,8,0};
        System.out.println(Arrays.toString(bubble(arr)));
    }
    static int[] bubble(int[] arr){
        boolean swap;
        int len= arr.length-1;
        for (int i = 0; i < arr.length-1; i++) {
        swap=false;
            for (int j = 0; j < len; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                    if (arr[len-1]<arr[len]&&temp==arr[len]){
                        len--;
                    }
                }
            }
            if (!swap){
                break;
            }

        }
        return arr;
    }

}
