
import java.util.ArrayList;

public class IntroArrayLists {

    public static void main(String[] args) {

        //java collection framework
        //as same like thats work vector in c++ so thats why we used
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1); //0(n)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //get operation\ 0(1)
        int element = list.get(2);
        System.out.println(element);

        //remove element
        list.remove(2);
        list.remove(1);
        System.out.println(list);

        //set element at index
        // list.set(2, 10);
        // list.set(1, 3);
        // System.out.println(list);
        //contain element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        //  add at index                                           
        list.add(1, 9);
        System.out.println(list);

    }
}
