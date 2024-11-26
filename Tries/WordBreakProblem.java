
public class WordBreakProblem {

    static class Node {

        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static boolean wordBreak(String Key) {
        if (Key.length() == 0) {
            return true;
        }
        for (int i = 1; i < Key.length(); i++) {
            if (search(Key.substring(0, i))
                    && wordBreak(Key.substring(i))) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        String key = "ilikesung";
        System.out.println(wordBreak(key));
    }
}
