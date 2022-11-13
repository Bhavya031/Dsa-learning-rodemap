import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(Duplicate(arr));
    }
    static int Duplicate(int[] arr){

        int i=0;
        int duplicate=-1;
        while (i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else if (i<arr.length-1){
                i++;
                continue;
            }
            if (arr[i]==arr[correct]){
                duplicate=arr[i];
                break;
            }
        }
        return duplicate;
    }
    static void swap(int[] arr,int j,int i){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

}
