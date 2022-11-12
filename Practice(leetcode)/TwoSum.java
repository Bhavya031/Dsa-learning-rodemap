import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
    static int[] twoSum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=target){
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]>=target||i==j){
                    continue;
                }
                int total=arr[i]+arr[j];
                if (target==total){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
