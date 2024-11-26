
public class clearrangeofbit {

    public static int clearrangeofbit(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (i << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String args[]) {
        System.out.println(clearrangeofbit(15, 2, 4));
    }
}
