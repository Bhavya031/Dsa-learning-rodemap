import java.util.Arrays;

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10,11,-1,-2};
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(find(arr,-1));
        }
    }
    static int find(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        int mid;
        while(left<=right){
            mid = left+(right-left)/2;
            if(nums[mid] == target) return mid;
            // condition for left side is sort
            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target <=nums[mid]){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }
            else{
                if(target>=nums[mid] && target <=nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;

    }
}
