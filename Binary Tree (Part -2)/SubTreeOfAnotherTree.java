
import org.w3c.dom.Node;

public class SubTreeOfAnotherTree {

    static class info {

        int diam;
        int ht;

        public info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static info diameter(Node root) {
        if (root == null) {
            return newInfo(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static boolean isIdentical(Node root, Node subRoot) {
        if (node == = null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubTree(Node root, Node subRoot) {

        if (root.data == subRoot.data) {
            if (root == null) {
                return false;
            }
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        //subtree exist 
        boolean rightAns = isSubTree(root.right, subRoot);

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static void main(String[] args) {
        /*  
            1
          /  \
          2   3
          /\    /\
        4  5   6  7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /**
         * 2
         * /\ 4 5
         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        //subRoot.right=new Node(5);

        System.out.println(subRoot);
    }
}
