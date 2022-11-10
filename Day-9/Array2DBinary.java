import java.util.Arrays;

public class Array2DBinary {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.println(anInt + Arrays.toString(search(arr, anInt)));
            }
        }
    }
    static int[] search(int[][] Matrix,int target){
        int start=0;
        int end=Matrix.length-1;
        if (target<Matrix[0][0]||target>Matrix[Matrix.length-1][Matrix[Matrix.length-1].length-1]){
            return new int[]{-1,-1};
        }
        while (start<=end){
            int mid=start+(end-start)/2;
//checks if target is in arr[mid]
            if (Matrix[mid][0]<=target&&Matrix[mid][Matrix[mid].length-1]>=target){
                return new int[]{mid,Binary(Matrix[mid],target)};
            }
            if (Matrix[mid][Matrix[mid].length-1]<target){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int Binary(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target < arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
