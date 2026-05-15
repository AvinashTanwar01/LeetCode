import java.util.Arrays;

public class FrogJumpKsteps {
    public static void main(String[] args) {
        int[] heights = {30, 10, 60, 10, 60, 50};
        int k = 2;
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int result = RecuTablu(n - 1, heights, k, dp);
        System.out.println(result);
    }

    public static int Recu(int n, int[] heights, int k, int[] dp) {
        if (n == 0) return 0;
        if (dp[n] != -1) return dp[n];
        int minSteps = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (n - j >= 0) {
                int jump = Recu(n - j, heights, k, dp) + Math.abs(heights[n] - heights[n - j]);
                minSteps = Math.min(minSteps, jump);
            }
        }
        return dp[n] = minSteps;
    }

    public static int RecuTablu(int n, int[] heights, int k, int[] dp) {
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int minSteps = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(heights[i] - heights[i - j]);
                    minSteps = Math.min(minSteps, jump);
                }
            }
            dp[i] = minSteps;
        }
        return dp[n];
    }
}