
public class IntroDp {

    public static int fib(int n, int f[]) {
        if (n == 0 || n == 1) { //0 1 1 2 3
            return n;
        }
        if (f[n] != 0) {//fib(n) is already calculated
            return f[n];
        }
        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n + 1]; //0,0,0,0
        System.out.println(fib(n, f));
    }
}
