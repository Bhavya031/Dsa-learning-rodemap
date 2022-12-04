public class StringBesic {
    public static void main(String[] args) {
        String chr="ahjsqhsaa";
        System.out.println(Skip("appleappleis"));
    }
    static String Skip(String str){
        if (str.isEmpty()){

            return "";
        }
       if (str.startsWith("apple")){
           return Skip(str.substring(3));
       }
       else{
           return str.charAt(0)+Skip(str.substring(1));
       }

    }


}
