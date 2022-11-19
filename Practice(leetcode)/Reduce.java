//leetcode question https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class Reduce {
   public int numberOfSteps(int a){
        return steps(a,0);
   }
    private int steps(int a,int step){
        if (a==0){
            return step;
        }
        if (a%2==0){
            return steps(a/2,step+1);
        }
        return steps(a-1,step+1);
    }

}
