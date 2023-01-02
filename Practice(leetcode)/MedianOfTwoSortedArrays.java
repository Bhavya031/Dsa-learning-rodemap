public class MedianOfTwoSortedArrays {
    public void main(String[] args) {
    int[] nums1={1,2};
    int[] nums2={3,4};
    System.out.println(find(nums1,nums2));
    }
    public static int[] Merge(int[] left, int[] right) {
        int[] mix=new int[left.length+ right.length];
        int i=0;
        int j=0;
        int k=0;
        while (i< left.length&&j< right.length){
            if (left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else {
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while (i< left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j< right.length){
            mix[k]=left[j];
            j++;
            k++;
        }
        return mix;
    }
    double find(int[] nums1,int[] nums2){
     int[] m=Merge(nums1,nums2);
     int total=0;
        for (int j : m) {
            total += j;
        }
        return total/m.length;
    }
}
