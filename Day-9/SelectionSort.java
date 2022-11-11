import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1486, 1615, 1659, 1442, 855, 1704, 1390, 608, 179, 1694};
        System.out.println(Arrays.toString(selection(arr)));
    }
    static int[] selection(int[] arr){
       int len= arr.length-1;


        for (int j = 0; j < arr.length; j++) {
            int k=0;
            int max=arr[0];
            for (int i = 0; i <=len; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    k = i;
                }
            }
            System.out.println(max + Arrays.toString(swap(arr, k, len)));
            len--;
            System.out.println(len);
        }
        return arr;
    }
    static int[] swap(int[] arr,int i,int len){
        int temp=arr[i];
        for (int j = i; j < len; j++) {
            arr[j]=arr[j+1];
        }
        arr[len]=temp;
        return arr;
    }
}
