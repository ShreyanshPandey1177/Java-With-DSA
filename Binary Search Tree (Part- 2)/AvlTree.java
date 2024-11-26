
import java.util.*;

public class AvlTree {

    static class Node {

        int data, height;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node root;

    //right rotate subtree rotated with y
    public static Node rightRotate(Node y) {
        Node x = y.right;
        Node T2 = x.left;

        //perform rotation
        x.left = y;
        y.right = T2;

        //update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // return  new  root
        return x;
    }

    //left rotate subtree rotated with x
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        //perform rotation
        y.left = x;
        x.right = T2;

        //update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // return  new  root
        return y;
    }

    //get balanced factor of node
    public static int getBalance(Node root) {
        if (root == null) {
            return 0;
        }

        return height(root.left) - height(root.right);
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            //left subtree
            root.left = insert(root.left, key);
        } else if (key > root.data) {

            //right subtree
            root.right = insert(root.right, key);
            return root;   //duplicate value are not allowed

            //update root height
            root.height = 1 + Math.max(height(root.left), height(root.right));

            //get root balance factor
            int bf = getBalance(root);

            //left left cae
            if (bf > 1 && key < root.left.data) {
                return rightRotate(root);
            }

            //right right case 
            if (bf <= -1 && key > root.right.data) {
                return leftRotate(root);
            }

            //left right case
            if (bf > 1 && key > root.left.data) {
                root.left = leftRotate(root.left);
            }
            return rightRotate(root);
        }
        return root; // retu if Avl balanced
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return root.height;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);


        /*    AVL TREE
                  30
                /    \
               20     40
              /   \      \
            10    25      50 

         */
        preorder(root);
    }
}
