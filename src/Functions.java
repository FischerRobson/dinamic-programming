public class Functions {

    // Write the arrangements of {1,3,5} to reach N
    // ex: solve(3) = 1+1+1 & 3
    // ex: solve(4) = 1+1+1+1 & 3+1 & 1+3
    public static int solve(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;

        return solve(n - 1) + solve(n - 3) + solve(n - 5);
    }

    private static int n = 1;
    // Write the arrangements of {1,3,5} to reach N using memoization
    static int[] dp = new int[n + 1];
    public static int solveDp(int n) {
        // base case
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;

        // Checking if already calculated
        if (dp[n] != -1)
            return dp[n];

        // Storing the result and returning
        return dp[n] = solveDp(n - 1) + solveDp(n - 3) + solveDp(n - 5);
    }
}
