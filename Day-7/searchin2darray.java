import java.util.Scanner;

public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr={{-1902384850,117383289,347055613,84673860,1117354815,271191415},{-14391680,1435857485,154267408,-5808745,-967609550,695347452},{-1856429036,-532392443,1824627677,-788085295,1707259879,147347421},{1616018001,745012784,1538452700,902168186,1600919763,-411849496},{1026326569,1768268505,-406529084,754634455,2144619307,-692113751},{-1736024747,1774682529,922464989,-1203155010,-1729349908,215453516}};
        System.out.print("Enter the number you want search:");
        Scanner in=new Scanner(System.in);
        int number= in.nextInt();
        System.out.println("your number "+number+"is at index:"+find(arr,number));
    }
    static String find(int[][] arr,int number){
        String num="not found";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==number){
                    num="["+i+"]["+j+"]";
                }
            }
        }
        return num;
    }
}
