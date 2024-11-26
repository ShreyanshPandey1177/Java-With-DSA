
import java.util.TreeSet;

public class TreeSetBasic {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("mumbai");
        ts.add("Bengleru");

        for (String city : ts) {
            System.out.println(city);
        }
    }
}
