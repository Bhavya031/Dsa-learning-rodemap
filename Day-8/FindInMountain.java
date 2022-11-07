public class FindInMountain {
    public static void main(String[] args) {
        int[] arr={1,3};
        System.out.println(MountainFind(arr,1));
    }
    static int MountainFind(int[] arr,int target){
        int peak = peak(arr);
        int firstTry = binary(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return binary(arr, target, peak, arr.length - 1);
    }
    static int binary(int[] arr,int target,int start,int end){
        if (arr.length==1){
            if(arr[0]==target){
                return 0;
            }
            return -1;
        }
           boolean isAsc = arr[start] < arr[end];
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
