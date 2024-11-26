
public class ClearLastibits {

    public static int ClearLastibits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(ClearLastibits(10, 2));
    }
}
