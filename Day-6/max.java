public class max {
    public static void main(String[] args) {
        int[] arr={2, 7, 14542, 21, 32};
        System.out.println(maximum(arr));
    }
    static int maximum(int[] arr){
        int max=arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;

    }
}
