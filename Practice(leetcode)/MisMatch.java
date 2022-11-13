import java.util.Arrays;

public class MisMatch {
    public static void main(String[] args) {
        int[] arr={2,2,3,4};
        System.out.println(Arrays.toString(Duplicate(arr)));
    }
    static int[] Duplicate(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr,int j,int i){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
