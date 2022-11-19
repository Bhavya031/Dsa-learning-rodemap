public class BinaryRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,55,57,66,90,122,2222};
        System.out.println(search(arr,2222,0, arr.length-1));
    }
    static int search(int[] arr,int target,int start,int end){
        if (start>end){
            return -1;
        }
        int middle=start+(end-start)/2;
        if (arr[middle]==target){
            return middle+1;
        }
        if (target < arr[middle]){
            return search(arr,target,start,middle-1);
        }
        return search(arr,target,middle+1,end);
    }
}
