public class str {
    public static void main(String[] args) {
        String str="aaaa";
        System.out.println(check(str));
    }
    static boolean check(String str){
        char[] str1=str.toCharArray();
        for (int i = 0; i < str1.length / 2; i++) {
            if (str1[i]!=str1[str1.length-1-i]){
                return false;
            }
        }
        return true;
    }

}
