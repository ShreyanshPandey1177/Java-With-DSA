
public class XofPowerN {

    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1 = Power(x, n - 1);
        // int xn = x * xnm1;
        // return xn;

        //  or
        return x * Power(x, n - 1);
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(Power(2, 4));
    }
}
