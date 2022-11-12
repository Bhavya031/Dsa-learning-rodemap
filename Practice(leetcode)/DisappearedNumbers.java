import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr={1,1};
        Missing(arr);
    }
    static void Missing(int[] arr){

        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {i++;}
        }
        List<Integer> arrli = new ArrayList<Integer>();
        for (int j = 0; j < arr.length; j++) {

            if (arr[j]!=j+1){
                arrli.add(j+1);
            }
        }
        System.out.println(arrli);
    }
    static void swap(int[] arr,int j,int i){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

}
