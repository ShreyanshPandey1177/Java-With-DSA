
import java.util.Arrays;

public class McmMemoization {

    public static int mcm(int arr[], int i, int j) {
        if (i == j) {
            return 0; //single Matrix case
        }

        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcm(arr, i, j); //Ai....Ak => arr[i-1] x arr[k]
            int cost2 = mcm(arr, i + 1, j); //Ai+1....aj =>arr[K] x arr[j]
            int cost3 = arr[i - 1] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return ans;
    }

//mcm memoization code
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

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3}; //n=5;
        int n = arr.length;

        int dp[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(dp[i], -1);

            System.out.println(mcmMem(arr, 1, n - 1, dp));
        }
    }
}
