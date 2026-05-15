import java.util.*;
public class Fibonaci {
    public static void main(String[] args) {
        int n=30;
        int[] dp= new int[n+1];
        Arrays.fill(dp, -1);
        // System.out.println(memoCode(n,dp));
        System.out.println(tabulCode(n,dp));
    }
    public static int memoCode(int n , int[] dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        // System.out.println(n);
        dp[n]= memoCode(n-1,dp)+memoCode(n-2,dp);
        return dp[n];
    }

    public static int tabulCode(int n , int[] dp){
        if(n<=1) return n;
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
