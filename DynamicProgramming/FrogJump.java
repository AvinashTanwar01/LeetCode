import java.util.*;

public class FrogJump {
    public static void main(String[] args) {
        int[] heights= {10,20,30,40};
        int n =heights.length-1;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int result = RecuTablu(n,heights,dp);
        System.out.println(result);
    }

    public static int Recu(int n,int[] heights,int[] dp){
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int left=0;
        int right=Integer.MAX_VALUE;
        left= Recu(n-1,heights,dp)+Math.abs(heights[n]-heights[n-1]);
        if(n>1){
            right = Recu(n-2,heights,dp)+Math.abs(heights[n]-heights[n-2]);
        }

        return dp[n]=Math.min(left, right);
    }

    public static int RecuTablu(int n, int[] heights,int[] dp){
        dp[0]=0;
        for(int i=1;i<heights.length;i++){
            int left = dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1){
                right = dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            }
            dp[i]= Math.min(left, right);
        }
        return dp[n];
    }
}