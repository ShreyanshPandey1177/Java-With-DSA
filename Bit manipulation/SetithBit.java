
public class SetithBit {

    public static int Setith(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String args[]) {
        System.out.println(Setith(10, 2));
    }
}
