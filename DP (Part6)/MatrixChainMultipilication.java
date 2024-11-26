
public class MatrixChainMultipilication {

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

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3}; //n=5;
        int n = arr.length;
        System.out.println(mcm(arr, 1, n - 1));
    }
}