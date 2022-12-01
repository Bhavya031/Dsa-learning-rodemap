import java.util.Arrays;

public class RecursionBubble {

    static void Selection(int[] arr,int target,int i,int max){
        if (target==0){
            return;
        }
        if (i<target){
            if (arr[max]<arr[i]){
                Selection(arr,target,i+1,i);
            }
            else {
                Selection(arr,target,i+1,max);
            }
        }
        else {
            swap(arr,max,target-1);
            Selection(arr,target-1,0,0);
        }

    }
    public static void main(String[] args) {
        int[] arr={2,4,21,23,12,7,8,43,3554,22};
        Selection(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr,int target,int i){
        if(target==-1){
            return;
        }
        if (target>i){
            if (arr[i]>arr[i+1]){
            swap(arr,i,i+1);}
            bubble(arr,target,i+1);
        }
        else {
            bubble(arr,target-1,0);
        }

    }

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
