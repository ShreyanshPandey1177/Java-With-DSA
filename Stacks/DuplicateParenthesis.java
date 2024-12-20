
import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //closng
            if (ch == ')') {
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;  //duplicate
                } else {
                    s.pop();  //opening pair
                }
            } else {
                //opening
                s.push(ch);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String str1 = "((a+b))";  //true
        String str2 = "(a-b)"; //false
        System.out.println(isDuplicate(str2));
    }
}
