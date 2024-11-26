
import java.util.HashMap;

public class HashMapOperation {

    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("us", 50);

        System.out.println(hm);

        //get
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        //containsKey
        System.out.println(hm.containsKey("India"));  // true
        System.out.println(hm.get("Indenosia"));  //false

        //Remove Operation
        hm.remove("china");
        System.out.println(hm.remove("china"));

        //size
        System.out.println(hm.size());

        //isEmpty
        hm.clear();
        System.out.println(hm.isEmpty());

    }

}
