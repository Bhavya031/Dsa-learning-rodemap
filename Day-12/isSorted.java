public class isSorted  {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(helper(arr));
    }
    static boolean helper(int[] arr){
        return sorted(arr,0);
    }
    static boolean sorted(int[] arr,int a){
        if (a==arr.length-1){
            return true;
        }
        return arr[a]<arr[a+1]&&sorted(arr,a+1);
    }
}
