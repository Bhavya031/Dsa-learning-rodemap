import java.util.ArrayList;
public class RecursionLinear {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,6,7,8,6,10};
        linear(arr,0,6);
        System.out.println(index);
    }
    static ArrayList<Integer> index = new ArrayList<>();
    static int linear(int[] arr,int a,int target){
        if (a==arr.length){
            return -1;
        }
        if (arr[a]==target){
            index.add(a);
        }
        return linear(arr,a+1,target);
    }
}
