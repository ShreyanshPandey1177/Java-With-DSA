
import java.util.LinkedHashSet;

public class LinkedHashSetbasic {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("Bengleru");

        for (String city : lhs) {
            System.out.println(city);
        }
    }
}
