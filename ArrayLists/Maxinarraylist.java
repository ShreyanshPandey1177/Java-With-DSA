
import java.util.ArrayList;

public class Maxinarraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); //0(n)
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("max element =" + max);
    }
}
