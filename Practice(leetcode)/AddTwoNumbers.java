import java.util.LinkedList;

public class AddTwoNumbers {


    static LinkedList<Integer> merged=new LinkedList<>();
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);
        System.out.println(merge(l1,l2,0));

    }
    static LinkedList<Integer> merge(LinkedList<Integer> l1,LinkedList<Integer> l2,int extra) {
    if (l1.isEmpty()&& l2.isEmpty()&&extra==0){
        return merged;
    }
        int ele1=l1.isEmpty()?0:l1.element();
        int ele2=l2.isEmpty()?0:l2.element();
        int totel= ele1 + ele2 + extra;
        if (totel>9){
            int lastDigit = totel % 10;
            merged.add(lastDigit);
            if (!l1.isEmpty())l1.remove();
            if (!l2.isEmpty())l2.remove();
            merge(l1,l2,1);
        }
        else {

            merged.add(totel);
            if (!l1.isEmpty())l1.remove();
            if (!l2.isEmpty())l2.remove();
            merge(l1,l2,0);
        }

    return merged;
    }
}
