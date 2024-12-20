
import java.util.HashMap;
import java.util.Set;

public class MajorityElement {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        Set<Integer> Keyset = map.keySet();
        for (Integer key : Keyset) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}
