import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr={42,34,75,23,21,18,90,67,78};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quick(int[] arr, int i, int length) {
    if (i>=length){
        return;
    }
    int piv=length;
    int j=i;
    int pos=i;
    while (j<piv){
        if (arr[j]<arr[piv]){
         swap(arr,j,pos);
         pos++;
        }
        j++;
    }
    swap(arr,piv,pos);
    quick(arr,i,pos-1);
    quick(arr,pos+1,length);
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //assign povit point took arr.lenght-1 element

}
