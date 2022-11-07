import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] num= {5,7,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(num,7)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=firstAndLast(nums,target,true);
        int end= firstAndLast(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int firstAndLast(int[] nums,int target,boolean FindTheFirstIndex){
        int ans=-1;
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int middle=start+(end-start)/2;
            if (nums[middle]<target){
                start=middle+1;
            } else if (nums[middle]>target) {
                end=middle-1;
            }else {
                ans=middle;
                if (FindTheFirstIndex){
                    end=middle-1;
                }
                else {
                    start=middle+1;
                }
            }
        }
        return ans;
    }
}
