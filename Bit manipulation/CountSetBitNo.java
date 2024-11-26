
public class CountSetBitNo {

    public static int countSetBitNo(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;   //check for LSb
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBitNo(10));
    }
}
