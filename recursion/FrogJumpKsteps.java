import java.util.Arrays;

public class FrogJumpKsteps {
    public static void main(String[] args) {
         int[] heights= {30, 10, 60, 10, 60, 50};
         int k = 2;
        int n =heights.length-1;
        int result = Recu(n,heights,k);
        System.out.println(result);
    }

    public static int Recu(int n , int[] heights,int k){
        if(n==0) return 0;
        int minSteps= Integer.MAX_VALUE;
        for(int j=1;j<=k;j++){
            if(n-j>=0){
            int jump= Recu(n-j,heights,k)+Math.abs(heights[n]-heights[n-j]);
            minSteps= Math.min(minSteps, jump);
            }
        }
        return minSteps;
    }
}
