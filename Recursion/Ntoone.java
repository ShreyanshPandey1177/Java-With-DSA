// Print 10 to 1;

public class Ntoone {

    public static void printDecrease(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDecrease(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDecrease(10);
    }
}
