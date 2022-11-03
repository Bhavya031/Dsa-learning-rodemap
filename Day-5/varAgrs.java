import java.util.Arrays;

public class varAgrs {
    public static void main(String[] args) {
        multiple(1,2,3,3,44,4,4,4,4,4);
    }
    static void multiple(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
