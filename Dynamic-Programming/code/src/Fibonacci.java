public class Fibonacci {

    // Solved by Dynamic Programming. TC := O(n)
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    public static int fibTabulation(int n) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    // by recursion Dynamic Programming
    public static int fibByDp(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fibByDp(n-1, dp) + fibByDp(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
//        System.out.println(fib(n));
        int dp[] = new int[n+1]; // 0, 0, 0, 0
//        System.out.println(fibByDp(n, dp));
        System.out.println(fibTabulation(n));
    }
}