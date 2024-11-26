
import java.util.ArrayList;
import java.util.Collections;

public class Sortingarraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); //0(n)
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(9);

        System.out.println(list);
        Collections.sort(list);  //ascending order
        System.out.println(list);

        //descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
