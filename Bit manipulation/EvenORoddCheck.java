
public class EvenORoddCheck {

    public static void oddOREven(int n) {
        int bitmas = 1;
        if ((n & bitmas) == 0) {
            //even number
            System.err.println("even Number");
        } else {
            System.out.println("odd Number");
        }
    }

    public static void main(String[] args) {
        oddOREven(3);
        oddOREven(6);
        oddOREven(7);
    }
}
