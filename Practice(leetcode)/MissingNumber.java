public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={8,2,3,1,0};
        cycle(arr);
    }
    static void cycle(int[] arr){
        int total=0;
        int total1=0;
        for (int i = 0; i < arr.length; i++) {
            total=total+arr[i];
            total1=total1+i;
        }
        int Missing=arr.length-(total-total1);
        System.out.println(Missing);
    }
}
