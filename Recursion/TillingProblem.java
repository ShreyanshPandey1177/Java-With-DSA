
public class TillingProblem {

    public static int TillingProblem(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }
        //kamm
        //vertical choice
        int fnm1 = TillingProblem(n - 1);

        //horizontal choice
        int fnm2 = TillingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;

    }

    public static void main(String[] args) {
        System.out.println(TillingProblem(4));
    }
}
