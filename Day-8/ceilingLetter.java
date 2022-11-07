public class ceilingLetter {
    public static void main(String[] args) {
        char[] str={'a','b','c','e','f','h','j','k','m','n','o','p','q','r','s','t','u','v','w','x'};
        char target='z';
        System.out.println("Your celling string is:"+Letter(str,target));
    }
    static char Letter(char[] str,char target){
        int start=0;
        int end=str.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
             if (target<str[mid]){
                end=mid-1;
            } else {
                start = mid + 1;
            }
        }
        return str[start%str.length];
    }
}
