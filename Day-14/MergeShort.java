import java.util.Arrays;

public class MergeShort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(Short(arr)));
    }

    static int[] Short(int[] arr){
    if (arr.length==1){
    return arr;
    }
    int mid= arr.length/2;
    int[] left= Short(Arrays.copyOfRange(arr,0,mid));
    int[] right= Short(Arrays.copyOfRange(arr,mid,arr.length));
    return Merge(left,right);
    }

    private static int[] Merge(int[] left, int[] right) {
            int[] mix=new int[left.length+ right.length];
            int i=0;
            int j=0;
            int k=0;
            while (i< left.length&&j< right.length){
                if (left[i]<right[j]){
                    mix[k]=left[i];
                    i++;
                }
                else {
                    mix[k]=right[j];
                    j++;
                }
                k++;
            }
            while (i< left.length){
                mix[k]=left[i];
                i++;
                k++;
            }
            while (j< right.length){
                mix[k]=left[j];
                j++;
                k++;
            }
            return mix;
    }
}
