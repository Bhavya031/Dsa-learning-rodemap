import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> Final=new ArrayList<>();
        System.out.println(permute(str,Final));
    }
    static ArrayList<String> permute(String str,ArrayList<String> Final){
        if (str.isEmpty()){
            Final.add(str);
            return Final;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> recAns=permute(ros,Final);
        for (String s:recAns){
            for (int i = 0; i <=s.length(); i++) {
                String val=s.substring(0,i)+ch+s.substring(i);
                Final.add(val);
            }
        }
        return Final;
    }
}
