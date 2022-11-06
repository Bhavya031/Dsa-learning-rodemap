//leetcode qustion no:1672. Richest Customer Wealth
public class Richest {
    public static void main(String[] args) {
        int[][] accounts = {{1,1,3},{3,2,1},{3,2,1}};
        System.out.println(max(accounts));
    }
    static int max(int[][] accounts){
        int[] maxwealth=new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
        int temp=0;
            int j = 0;
            while (j < accounts[i].length) {
                temp+=accounts[i][j];
                j++;
            }
            maxwealth[i]=temp;
        }
        int largest=maxwealth[0];
        for (int j : maxwealth) {
            if (j > largest) {
                largest = j;
            }
        }
        return largest;
    }
}
