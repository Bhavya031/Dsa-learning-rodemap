import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={8,77,443,4,12,4,233,554,322};
        insertion(arr);
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }   else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int j,int i){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
