/**
 * minimumpathSum
 */
public class minimumpathSum {

    public static void main(String[] args) {

        int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };

        if (grid == null || grid.length == 0)
            return;

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                dp[i][j] += grid[i][j];

                if (i > 0 && j > 0) {
                    dp[i][j] += Math.min(dp[i - 1][j], dp[i][j - 1]);
                }

                else if (i > 0) {
                    dp[i][j] += dp[i - 1][j];
                } else if (j > 0) {
                    dp[i][j] += dp[i][j - 1];
                }

            }
        }

        System.out.println(dp[m - 1][n - 1]);
    }
}