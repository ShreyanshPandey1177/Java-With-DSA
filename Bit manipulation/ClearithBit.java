
public class ClearithBit {

    public static int clearith(int n, int i) {
        int bitMask = ~(1 << 1);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearith(10, 2));
    }
}
