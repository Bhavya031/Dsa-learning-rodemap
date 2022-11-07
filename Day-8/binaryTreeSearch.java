public class binaryTreeSearch {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,3,2,1,0};
        System.out.println("your number's index is:"+binary(arr,3));
    }
    static int binary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]){
                    end=mid-1;
            } else {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
