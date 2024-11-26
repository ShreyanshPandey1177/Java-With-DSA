

public class McmTabulation {

    public static int mcmMem(int arr[], int i, int j, int dp[][]) {
        if (i == j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = 1; k <= j - 1; k++) {
            int cost1 = mcmMem(arr, i, k, dp);
            int cost2 = mcmMem(arr, k + 1, j, dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(ans, cost1 + cost2 + cost3);
        }
        return dp[i][j] = ans;
    }

    public static int mcmTab(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];

        //initialization
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;

            //bottom up code
            for (int len = 2; len <= n - 1; len++) {
                int j = i + len - 1; //col
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k + 1][j];
                    int cost3 = arr[i - 1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1 + cost2 + cost3);
                }
            }
        }
        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3}; //n=5;

        System.out.println(mcmTab(arr));

    }
}
