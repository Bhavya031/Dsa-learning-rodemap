public class RotatedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9,0,1,2};
        System.out.println(Find(arr,1));
    }
    static int Find(int[] arr, int target) {
        int peak=peak(arr)-1;
        int FirstTry=binary(arr,target,0,peak);
        if (FirstTry!=-1){
            return FirstTry;
        }
        return binary(arr,target,peak, arr.length-1);
    }
    static int peak(int[] arr){
        int start=0;
        int end= arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
    static int binary(int[] arr,int target,int start,int end){
        boolean isAsc =arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
