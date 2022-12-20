import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String str="bhavya";
        ArrayList<String> Final=new ArrayList<>();
        System.out.println(sub("",str,Final));
    }
    static ArrayList<String> sub(String prosees,String input,ArrayList<String> Final){
        if (input.isEmpty()){
            Final.add(prosees);
            return Final;
        }
        char ch=input.charAt(0);
        sub(prosees+ch,input.substring(1),Final);
        sub(prosees,input.substring(1),Final);
        return Final;
    }
}
