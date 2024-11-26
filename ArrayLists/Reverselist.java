
import java.util.ArrayList;

public class Reverselist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //0(n)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //reverse print
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }
}
