import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(Duplicate(arr));
    }
    static List<Integer> Duplicate(int[] arr){
        int i=0;
        List<Integer> all = new ArrayList<>();
        while (i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            if (arr[i]==arr[correct]){
            all.add(arr[i]);
            }
            i++;
        }
        System.out.println(all);
        return all;
    }
    static void swap(int[] arr,int j,int i){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
