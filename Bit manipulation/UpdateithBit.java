
public class UpdateithBit {

    public static int UpdateIthBit(int n, int i, int newBit) {
        // if(newBit==0){
        //     return  clearithBit(n,i);
        // }
        // else{
        //     return setithBit(n,i);
        // }
        n = ClearithBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String args[]) {
        System.out.println(UpdateIthBit(10, 1, 1));
    }
}
