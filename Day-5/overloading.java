public class overloading {
    public static void main(String[] args) {
        int a=1;
        String b="bhavya";
        over(a,b);
        over(b,a);
    }
    static void over(int a,String b){
        System.out.println(a+"."+b);
    }
    static void over(String a,int b){
        System.out.println(a+"."+b);
    }

}
