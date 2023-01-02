import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        String str="9";
        System.out.println(letterCombinations(str));

    }
    public static List<String> letterCombinations(String digits) {
        if (digits.length()==0){
            return new ArrayList<>();
        }
        return run("",digits);
    }

    static List<String> run(String pr,String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(pr);
            return list;
        }
        int digit = up.charAt(0)-1 - '0';
        int range=digit*3;
        int start=(digit-1)*3;
        if (up.charAt(0) == '7') {
            range += 1;
        } else if (up.charAt(0) == '8') {
            start += 1;
            range += 1;
        } else if (up.charAt(0) == '9') {
            start += 1;
            range += 2;
        }

        List<String> list = new ArrayList<>();
        for (int i = start; i < range; i++) {
            char ch= (char) ('a'+i);
            list.addAll(run(pr+ch,up.substring(1)));
        }
        return list;
    }
}
