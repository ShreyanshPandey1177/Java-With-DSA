
public class Fibonacci {

    public static int fib(int n) {
        if (n == 0 || n == 1) {   //base case 
            return n;
        }
        int fnm1 = fib(n - 1);   //1
        int fnm2 = fib(n - 2);   //2
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 26;
        System.out.println(fib(26));
        System.out.println(fib(27));
        System.out.println(fib(28));
        System.out.println(fib(29));

    }
}
