
import java.util.*;

public class HashSetImplement {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        if (set.contains(2)) {
            System.out.println("set Contains 2");
        }
        if (set.contains(3)) {
            System.out.println("set contain 3");
        }

    }
}
