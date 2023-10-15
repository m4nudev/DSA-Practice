import java.util.Arrays;

public class Climbing_Stairs {
    /*
      Solution by Recursion  TC := O(2^n)
     */
    static int countWays(int n) {
        if(n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countWays(n - 1) + countWays(n - 2);
    }

     /*
      Solution by Dynamic Programming (Memoization) TC := O(n)
     */
    static int countWaysByMemoization(int n, int[] dp) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1) { // Already calculated!!
            return dp[n];
        }
        dp[n] = countWaysByMemoization(n - 1, dp) + countWaysByMemoization(n - 2, dp);
        return dp[n];
    }

    /*
     Solution by Dynamic Programming (Tabulation); TC := O(n)
    */
    static int countWaysTab(int n) {
        int dp[] = new int[n+1]; // 0 to n
        dp[0] = 1;

        for (int i = 1; i <= n; i++){
            if (i == 1) {
                dp[i] = dp[i-1] + 0;
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int  n = 5; // n = 3  -> 3 & n = 4 -> 5 => 8
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
//        System.out.println(countWays(n));
//        System.out.println(countWaysByMemoization(n, dp));
        System.out.println(countWaysTab(n));
    }
}
